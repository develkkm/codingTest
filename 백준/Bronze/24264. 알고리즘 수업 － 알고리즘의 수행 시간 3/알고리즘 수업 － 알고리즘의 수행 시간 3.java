import java.io.*;
import java.util.*;

class Main{
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringBuilder sb = new StringBuilder();
    static StringTokenizer st;

    public static void main(String[] args) throws IOException{
        sb.append((long)Math.pow(Integer.parseInt(br.readLine()),2)).append("\n").append(2);

        System.out.println(sb);
    }
}