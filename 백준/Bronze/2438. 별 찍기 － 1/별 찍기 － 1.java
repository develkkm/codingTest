import java.io.*;
import java.util.*;

public class Main{
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringBuilder sb = new StringBuilder();
    static StringTokenizer st;

    public static void main(String[] args) throws IOException{
        int n = Integer.parseInt(br.readLine());
        StringBuilder star = new StringBuilder();

        for(int i=0;i<n;i++){
            star.append("*");
            sb.append(star).append("\n");
        }

        System.out.println(sb);
    }
}