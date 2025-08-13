import java.io.*;
import java.util.*;

public class Main{
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringBuilder sb = new StringBuilder();
    static StringTokenizer st;

    public static void main(String[] args) throws IOException{
        int a = Integer.parseInt(br.readLine());
        int b = Integer.parseInt(br.readLine());
        int c = Integer.parseInt(br.readLine());
        int[] arr = new int[10];

        String str = Long.toString((long) a * b * c);

        for(int i=0;i<str.length();i++){
            arr[str.charAt(i)-'0']++;
        }

        for(int i : arr){
            sb.append(i).append("\n");
        }
        System.out.println(sb);
    }
}