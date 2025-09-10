import java.io.*;
import java.util.*;

class Main{
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringBuilder sb = new StringBuilder();
    static StringTokenizer st;

    public static void main(String[] args) throws IOException {
        int t = Integer.parseInt(br.readLine());
        while(t-->0){
            long n = Long.parseLong(br.readLine());
            while(true){
                if(isPrime(n)) break;
                n++;
            }
            if(n == 0 || n == 1) n = 2;
            sb.append(n).append("\n");
        }

        System.out.println(sb);
    }

    public static boolean isPrime(long n){
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if(n % i == 0) return false;
        }
        return true;
    }
}