import java.io.*;
import java.util.*;

class Main{
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringBuilder sb = new StringBuilder();
    static StringTokenizer st;

    public static void main(String[] args) throws IOException{
        int n = Integer.parseInt(br.readLine());

        int num = 10;
        int cnt = 0;
        int zCnt = 1;
        for (int i = 1; i <= n ; i++) {
                if(i % num == 0){
                    num *= 10;
                    zCnt++;
                }
                cnt+=zCnt;
        }

        System.out.println(cnt);
    }
}