import java.io.*;
import java.util.*;

class Main{
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringBuilder sb = new StringBuilder();
    static StringTokenizer st;

    public static void main(String[] args) throws IOException {
        st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int x = Integer.parseInt(st.nextToken());

        int[] arr = new int[n];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        int sum = 0;
        for (int i = 0; i < x; i++) {
            sum += arr[i];
        }

        int max = sum;
        int cnt = 1;
        for (int i = 1; i <= n - x; i++) {
            sum -= arr[i - 1];
            sum += arr[i + x - 1];

            if(max < sum){
                max = sum;
                cnt=1;
            }else if(max == sum){
                cnt++;
            }
        }

        if(max > 0) {
            System.out.println(max);
            System.out.println(cnt);
        }else{
            System.out.println("SAD");
        }
    }
}