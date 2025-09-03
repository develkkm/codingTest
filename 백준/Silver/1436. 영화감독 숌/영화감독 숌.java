import java.io.*;
import java.util.*;

class Main{
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringBuilder sb = new StringBuilder();
    static StringTokenizer st;
    static int minCnt = Integer.MAX_VALUE;

    public static void main(String[] args) throws IOException{
        st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int cnt = 0;
        int result = 666;

        while(true){
            String str = Integer.toString(result);
            if(str.contains("666")){
                cnt++;
            }
            if(cnt == n)
                break;
            result++;
        }

        System.out.println(result);
    }
}