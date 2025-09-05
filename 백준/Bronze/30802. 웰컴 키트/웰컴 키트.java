import java.io.*;
import java.util.*;

class Main{
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringBuilder sb = new StringBuilder();
    static StringTokenizer st;

    public static void main(String[] args) throws IOException{
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[6];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < 6; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        st = new StringTokenizer(br.readLine());
        int t = Integer.parseInt(st.nextToken());
        int p = Integer.parseInt(st.nextToken());

        int tCnt = 0;

        for (int i = 0; i < 6; i++) {
            if(arr[i] > 0){
                if(arr[i] % t == 0){
                    tCnt += arr[i] / t;
                }
                else{
                    tCnt += arr[i] / t + 1;
                }
            }
        }

        sb.append(tCnt).append("\n").append(n/p).append(" ").append(n%p);

        System.out.println(sb);
    }
}