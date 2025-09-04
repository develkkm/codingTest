import java.io.*;
import java.util.*;

class Main{
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringBuilder sb = new StringBuilder();
    static StringTokenizer st;

    public static void main(String[] args) throws IOException {
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[10000001];

        for(int i=0;i<n;i++){
            arr[Integer.parseInt(br.readLine())]++;
        }

        for(int i=0;i<10000001;i++){
            for(int j=0;j<arr[i];j++){
                sb.append(i).append("\n");
            }
        }

        System.out.println(sb);
    }
}