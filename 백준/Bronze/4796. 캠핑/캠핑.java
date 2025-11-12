import java.io.*;
import java.util.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringBuilder sb = new StringBuilder();
    static StringTokenizer st;

    public static void main(String[] args) throws IOException {
        int t = 1;
        while(true){
            st = new StringTokenizer(br.readLine());
            int l = Integer.parseInt(st.nextToken());
            int p = Integer.parseInt(st.nextToken());
            int v = Integer.parseInt(st.nextToken());
            if(l==0 || p==0 || v==0) break;

            int n = v / p;
            int m = v % p;

            if(m > l) m = l;
            int ans = l * n + m;
            System.out.println("Case " + (t++) + ": " + ans);
        }
    }
}
