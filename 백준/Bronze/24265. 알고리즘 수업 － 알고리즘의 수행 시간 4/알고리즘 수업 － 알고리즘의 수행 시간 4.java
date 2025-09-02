import java.io.*;
import java.util.*;

class Main{
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringBuilder sb = new StringBuilder();
    static StringTokenizer st;

    public static void main(String[] args) throws IOException{
        long n = Long.parseLong(br.readLine());
        sb.append(n * (n-1) / 2).append("\n").append(2);

        System.out.println(sb);
    }
}