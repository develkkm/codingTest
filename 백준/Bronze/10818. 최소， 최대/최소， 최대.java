import java.io.*;
import java.util.*;

public class Main{
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringBuilder sb = new StringBuilder();
    static StringTokenizer st;

    public static void main(String[] args) throws IOException{
        int t = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE ;
        while(t-->0){
            int num = Integer.parseInt(st.nextToken());
            if(num > max){
                max = num;
            }
            if(num < min){
                min = num;
            }
        }
        sb.append(min).append(" ").append(max);
        System.out.println(sb);
    }
}