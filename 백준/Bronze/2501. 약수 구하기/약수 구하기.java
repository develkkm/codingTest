import java.io.*;
import java.util.*;

class Main{
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringBuilder sb = new StringBuilder();
    static StringTokenizer st;

    public static void main(String[] args) throws IOException{
        st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        int num = 0;
        int cnt = 0;

        while(true){
            if(cnt == k || num > n) break;
            num++;
            if(n % num == 0){
                cnt++;
            }
        }

        if(cnt < k) num = 0;
        System.out.println(num);
    }
}