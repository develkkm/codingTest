import java.io.*;
import java.util.*;

class Main{
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringBuilder sb = new StringBuilder();
    static StringTokenizer st;

    public static void main(String[] args) throws IOException{
        int t = Integer.parseInt(br.readLine());
        String[] arr = new String[t];

        for (int i = 0; i < t; i++) {
            arr[i] = br.readLine();
        }

        Arrays.sort(arr,Comparator.comparing(String::length)
                .thenComparing(Main::sumOfDigit)
                .thenComparing(Comparator.naturalOrder()));

        for (int i = 0; i < t; i++) {
            sb.append(arr[i]).append("\n");
        }

        System.out.println(sb);
    }

    static int sumOfDigit(String s){
        int sum = 0;
        for (int i = 0; i < s.length(); i++) {
            if(Character.isDigit(s.charAt(i))){
                sum+=s.charAt(i) - '0';
            }
        }

        return sum;
    }
}