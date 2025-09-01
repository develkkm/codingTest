import java.io.*;
import java.util.*;

class Main{
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringBuilder sb = new StringBuilder();
    static StringTokenizer st;

    public static void main(String[] args) throws IOException{
        int n = Integer.parseInt(br.readLine());
        int i = 1;
        if(n == 1) sb.append("1/1");
        else{
            int x = 0;
            int y = 0;

            while(n-i > 0){
                n-=i;
                i++;
            }

            if(i % 2 ==0){
                x = n;
                y = i-n+1;
            }
            else{
                x = i-n+1;
                y = n;
            }

            sb.append(x).append("/").append(y);
        }

        System.out.println(sb);
    }
}