import java.io.*;
import java.util.*;

public class Main{
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringBuilder sb = new StringBuilder();
    static StringTokenizer st;

    public static void main(String[] args) throws IOException{
        st = new StringTokenizer(br.readLine());
        int x = Integer.parseInt(st.nextToken());
        int y = Integer.parseInt(st.nextToken());
        int z = Integer.parseInt(st.nextToken());
        int max = Integer.MIN_VALUE;

        if(x == y && y == z){
            sb.append(10000+1000*x);
        }
        else if(x == y || x == z){
            sb.append(1000 + 100 * x);
        }
        else if(y == z){
            sb.append(1000+100*y);
        }
        else{
            if(x > max) max = x;
            if(y > max) max = y;
            if(z > max) max = z;
            sb.append(max * 100);
        }
        System.out.println(sb);
    }
}