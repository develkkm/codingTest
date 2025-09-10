import java.io.*;
import java.util.*;

class Main{
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringBuilder sb = new StringBuilder();
    static StringTokenizer st;

    public static void main(String[] args) throws IOException{
        st = new StringTokenizer(br.readLine());
        long n1 = Long.parseLong(st.nextToken());
        long d1 = Long.parseLong(st.nextToken());

        st = new StringTokenizer(br.readLine());
        long n2 = Long.parseLong(st.nextToken());
        long d2 = Long.parseLong(st.nextToken());

        long num = n1 * d2 + n2 * d1;
        long de = d1 * d2;
        long gcd = getGCD(num , de);

        System.out.println(num / gcd + " " + de / gcd);


    }

    public static long getGCD(long n,long m){
        while(m != 0){
            long r = n % m;

            n = m;
            m = r;
        }

        return n;
    }
}