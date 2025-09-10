import java.io.*;
import java.util.*;

class Main{
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringBuilder sb = new StringBuilder();
    static StringTokenizer st;

    public static void main(String[] args) throws IOException{
        st = new StringTokenizer(br.readLine());
        long n = Long.parseLong(st.nextToken());
        long m = Long.parseLong(st.nextToken());

        System.out.println( n * m / getGCD(n, m));

    }

    public static long getGCD(long n, long m){
        while(m != 0){
            long r = n % m;

            n = m;
            m = r;
        }

        return n;
    }
}