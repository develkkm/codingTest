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

        boolean[] arr = new boolean[n+1];

        int cnt = 0;
        int ans = 0;
        for (int i = 2; i <= n; i++) {
            for (int j = i; j <= n ; j +=i) {
                if(!arr[j]){
                    arr[j] = true;
                    cnt++;
                }

                if(cnt == k){
                    ans = j;
                    break;
                }
            }
            if(cnt == k){
                System.out.println(ans);
                break;
            }
        }
    }
}