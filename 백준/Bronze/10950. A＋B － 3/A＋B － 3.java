import java.io.*;
import java.util.*;

public class Main{
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringBuilder sb = new StringBuilder();
    static StringTokenizer st;

    public static void main(String[] args) throws IOException{
        int n = Integer.parseInt(br.readLine());

        while(n-->0){
            st = new StringTokenizer(br.readLine());
            int num = Integer.parseInt(st.nextToken()) + Integer.parseInt(st.nextToken());
            sb.append(num).append("\n");
        }

        System.out.println(sb);
    }
}