import java.io.*;
import java.util.*;

public class Main{
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringBuilder sb = new StringBuilder();
    static StringTokenizer st;

    public static void main(String[] args) throws IOException{
        //st = new StringTokenizer(br.readLine());
        int total = Integer.parseInt(br.readLine());
        int t = Integer.parseInt(br.readLine());
        int cost = 0;
        while(t-->0) {
            st = new StringTokenizer(br.readLine());
            cost += Integer.parseInt(st.nextToken()) * Integer.parseInt(st.nextToken());
        }

        if(cost == total) sb.append("Yes");
        else sb.append("No");

        System.out.println(sb);
    }
}