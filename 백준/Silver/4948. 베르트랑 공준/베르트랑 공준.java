import java.io.*;
import java.util.*;

class Main{
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringBuilder sb = new StringBuilder();
    static StringTokenizer st;
    static boolean[] prime = new boolean[123456*2 + 1];

    public static void main(String[] args) throws IOException {
        getPrime();
        while(true) {
            int n = Integer.parseInt(br.readLine());
            if (n == 0) break;
            int cnt = 0;

            for (int i = n+1; i <= 2*n ; i++) {
                if(!prime[i]) cnt++;
            }

            sb.append(cnt).append("\n");
        }
        System.out.println(sb);
    }

    public static void getPrime(){
        prime[0] = prime[1] = true;
        for (int i = 2; i < Math.sqrt(123456*2+1); i++) {
            if(prime[i]) continue;
            for (int j = i*i; j <123456*2+1 ; j+=i) {
                prime[j] = true;
            }
        }
    }

}