import java.io.*;
import java.util.*;

class Main{
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringBuilder sb = new StringBuilder();
    static StringTokenizer st;

    public static void main(String[] args) throws IOException {
        int t = Integer.parseInt(br.readLine());
        while(t-->0){
            int k = Integer.parseInt(br.readLine());
            int n = Integer.parseInt(br.readLine());

            sb.append(recursion(k,n)).append("\n");
        }
        System.out.println(sb);
    }

    public static int recursion(int k,int n){
        if(k==0) return n;
        if(n==1) return 1;

        return recursion(k,n-1) + recursion(k-1,n);
    }
}