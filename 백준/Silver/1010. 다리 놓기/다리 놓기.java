import java.io.*;
import java.util.*;

class Main{
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringBuilder sb = new StringBuilder();
    static StringTokenizer st;

    public static void main(String[] args) throws IOException {
        int tc = Integer.parseInt(br.readLine());

        while(tc-->0){
            st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            int m = Integer.parseInt(st.nextToken());

            int r = Math.min(n, m - n);
            long result = 1;

            for (int i = 1; i <= r; i++) {
                result = result * (m - r + i) / i;
            }

            System.out.println(result);
        }
    }
}