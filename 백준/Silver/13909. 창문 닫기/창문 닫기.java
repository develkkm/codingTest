import java.io.*;
import java.util.*;

class Main{
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringBuilder sb = new StringBuilder();
    static StringTokenizer st;

    public static void main(String[] args) throws IOException{
        int n = Integer.parseInt(br.readLine());
        int cnt = 0;
        for (int i = 1; i*i <= n; i++) {
            cnt++;
        }

        System.out.println(cnt);
    }
}