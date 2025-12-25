import java.io.*;
import java.util.*;

class Main{
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringBuilder sb = new StringBuilder();
    static StringTokenizer st;

    public static void main(String[] args) throws IOException {
        st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int score = Integer.parseInt(st.nextToken());
        int p = Integer.parseInt(st.nextToken());

        if(n == 0){
            if(p != 0){
                System.out.println(1);
                return;
            }else{
                System.out.println(-1);
                return;
            }
        }

        st = new StringTokenizer(br.readLine());
        int cnt = 0;
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
            if(arr[i] > score) cnt++;
        }

        if(cnt >= p){
            System.out.println(-1);
        }else{
            if(n == p && arr[n-1] == score){
                System.out.println(-1);
                return;
            }
            System.out.println(cnt+1);
        }
    }
}