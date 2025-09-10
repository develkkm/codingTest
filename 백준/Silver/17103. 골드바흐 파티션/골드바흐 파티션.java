import java.io.*;
import java.util.*;

class Main{
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringBuilder sb = new StringBuilder();
    static StringTokenizer st;
    static boolean[] prime = new boolean[1000001];

    public static void main(String[] args) throws IOException {
        getPrime();
        int t = Integer.parseInt(br.readLine());
        while(t-->0){
            int n = Integer.parseInt(br.readLine());

            int cnt = 0;
            for (int i = 2; i <= n/2; i++) {
                if(!prime[i] && !prime[n - i]) cnt++;
            }

            sb.append(cnt).append("\n");
        }

        System.out.println(sb);
    }

    public static void getPrime(){
        prime[0] = prime[1] = true;

        for (int i = 2; i <= Math.sqrt(1000001); i++) {
            if(prime[i]) continue;
            for (int j = i*i; j <1000001 ; j+=i) {
                prime[j] = true;
            }
        }
    }
}