import java.io.*;
import java.util.*;

class Main{
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringBuilder sb = new StringBuilder();
    static StringTokenizer st;

    public static void main(String[] args) throws IOException{
        int t = Integer.parseInt(br.readLine());
        while(t-->0){
            st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            int m = Integer.parseInt(st.nextToken());

            int gcd = getGCD(n,m);

            sb.append(n * m / gcd).append("\n");
        }
        System.out.println(sb);
    }

    public static int getGCD(int n,int m){
        while(m != 0){
            int r = n % m;

            n = m;
            m = r;
        }

        return n;
    }
}