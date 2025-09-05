import java.io.*;
import java.util.*;

class Main{
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringBuilder sb = new StringBuilder();
    static StringTokenizer st;

    public static void main(String[] args) throws IOException{
        int n = Integer.parseInt(br.readLine());
        String[] arr = new String[n];
        String prev = "";

        for (int i = 0; i < n; i++) {
            arr[i] = br.readLine();
        }

        Arrays.sort(arr, Comparator.comparing(String::length).thenComparing(Comparator.naturalOrder()));

        for(String str : arr){
            if(!prev.equals(str)) {
                prev = str;
                sb.append(str).append("\n");
            }
        }

        System.out.println(sb);
    }
}