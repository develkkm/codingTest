import java.io.*;
import java.util.*;

class Main{
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringBuilder sb = new StringBuilder();
    static StringTokenizer st;

    public static void main(String[] args) throws IOException{
        long n = Long.parseLong(br.readLine());
        long cnt = 0;
        for(long i=n-2;i>0;i--){
            cnt += i * (i+1) / 2;
        }

        sb.append(cnt+ "\n"+ 3);

        System.out.println(sb);
    }
}