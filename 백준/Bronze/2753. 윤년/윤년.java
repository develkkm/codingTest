import java.io.*;
import java.util.*;

public class Main{
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringBuilder sb = new StringBuilder();
    static StringTokenizer st;

    public static void main(String[] args) throws IOException{
        int y = Integer.parseInt(br.readLine());

        if(y%4==0) {
            if(y%400==0) sb.append(1);
            else if(y%100==0) sb.append(0);
            else sb.append(1);
        }
        else sb.append(0);

        System.out.println(sb);

    }
}