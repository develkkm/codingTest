import java.io.*;
import java.util.*;

class Main{
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringBuilder sb = new StringBuilder();
    static StringTokenizer st;

    public static void main(String[] args) throws IOException{
        int m = Integer.parseInt(br.readLine());
        int n = Integer.parseInt(br.readLine());
        int cnt = 0;
        int min = 0;
        int sum = 0;

        for(int i=0;i<=n-m;i++){
            if(prime(m+i)){
                if(cnt==0) min = m+i;
                sum+=m+i;
                cnt++;
            }
        }

        if(cnt!=0)
            sb.append(sum).append("\n").append(min);
        else
            sb.append(-1);

        System.out.println(sb);
    }

    private static boolean prime(int n){
        if (n == 1) return false;
        for(int i=2;i<=n/2;i++){
            if(n % i == 0) return false;
        }

        return true;
    }
}