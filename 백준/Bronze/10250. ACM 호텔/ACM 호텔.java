import java.io.*;
import java.util.*;

public class Main{
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringBuilder sb = new StringBuilder();
    static StringTokenizer st;

    public static void main(String[] args) throws IOException{
        int t = Integer.parseInt(br.readLine());
        while(t-->0){
            st = new StringTokenizer(br.readLine());
            int h = Integer.parseInt(st.nextToken());
            int w = Integer.parseInt(st.nextToken());
            int n = Integer.parseInt(st.nextToken());

            int height = n%h == 0 ? h : n%h;
            String num;
            if(height != h)
                num = n/h+1<10 ? "0"+(n/h+1) : Integer.toString(n/h+1);
            else
                num = n/h<10 ? "0"+(n/h) : Integer.toString(n/h);
            sb.append(height).append(num).append("\n");
        }
        System.out.println(sb);
    }
}