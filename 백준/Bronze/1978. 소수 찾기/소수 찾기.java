import java.io.*;
import java.util.*;

class Main{
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringBuilder sb = new StringBuilder();
    static StringTokenizer st;

    public static void main(String[] args) throws IOException{
        int t = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        int cnt = 0;
        while(t-->0){
            int n = Integer.parseInt(st.nextToken());
            if(n == 1) continue;
            if(prime(n)) cnt++;
        }
        System.out.println(cnt);
    }

    private static boolean prime(int n){
        for(int i=2;i<=n/2;i++){
            if(n % i == 0) return false;
        }

        return true;
    }
}