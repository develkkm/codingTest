import java.io.*;
import java.util.*;

public class Main{
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringBuilder sb = new StringBuilder();
    static StringTokenizer st;

    public static void main(String[] args) throws IOException{
        int n = Integer.parseInt(br.readLine());

        for(int i=1; i<10; i++){
            sb.append(n).append(" * ").append(i).append(" = ").append(n*i).append("\n");
        }

        System.out.println(sb);
    }
}