import java.io.*;
import java.util.*;

public class Main{
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringBuilder sb = new StringBuilder();
    static StringTokenizer st;

    public static void main(String[] args) throws IOException{
        //st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(br.readLine());
        int cnt =  n / 4;
        while(cnt-->0){
            sb.append("long ");
        }
        sb.append("int");
        System.out.println(sb);
    }
}