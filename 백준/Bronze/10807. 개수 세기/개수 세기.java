import java.io.*;
import java.util.*;

public class Main{
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringBuilder sb = new StringBuilder();
    static StringTokenizer st;

    public static void main(String[] args) throws IOException{
        //st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(br.readLine());

        st = new StringTokenizer(br.readLine());
        int x = Integer.parseInt(br.readLine());

        int cnt = 0;
        while(n-->0){
            int num = Integer.parseInt(st.nextToken());
            if(num == x) cnt++;
        }

        System.out.println(cnt);
    }
}