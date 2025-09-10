import java.io.*;
import java.util.*;

class Main{
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringBuilder sb = new StringBuilder();
    static StringTokenizer st;
    static boolean[] prime;

    public static void main(String[] args) throws IOException {
        st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        prime = new boolean[m+1];
        isPrime();

        for (int i = n; i <= m; i++) {
            if(!prime[i]) sb.append(i).append("\n");
        }

        System.out.println(sb);
    }

    public static void isPrime(){
        prime[0] = prime[1] = true;

        for (int i = 2; i < Math.sqrt(prime.length); i++) {
            if(prime[i]) continue;
            for (int j = i*i; j < prime.length; j+=i) {
                prime[j] = true;
            }
        }
    }
}