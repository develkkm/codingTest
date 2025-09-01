import java.io.*;
import java.util.*;

class Main{
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringBuilder sb = new StringBuilder();
    static StringTokenizer st;

    public static void main(String[] args) throws IOException {
        int n = Integer.parseInt(br.readLine());
        while(n >= 1){
            if(n == 1) break;
            
            for(int i=2;i<=n;i++){
                if(n % i == 0){
                    sb.append(i).append("\n");
                    n /= i;
                    break;
                }
            }
        }

        System.out.println(sb);
    }
}