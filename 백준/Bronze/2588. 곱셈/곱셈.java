import java.io.*;
import java.util.*;

public class Main{
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringBuilder sb = new StringBuilder();
    static StringTokenizer st;

    public static void main(String[] args) throws IOException{
        //st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(br.readLine());
        String m = br.readLine();

        for(int i=3;i>0;i--){
            sb.append(n * (m.charAt(i-1) - '0')).append("\n");
        }
        sb.append(n * Integer.parseInt(m));
        System.out.println(sb);
    }
}