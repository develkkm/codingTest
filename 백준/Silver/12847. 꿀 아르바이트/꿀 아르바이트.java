import java.io.*;
import java.util.*;

class Main{
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringBuilder sb = new StringBuilder();
    static StringTokenizer st;

    public static void main(String[] args) throws IOException {
        st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        int[] arr = new int[n];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        long sum = 0;
        for (int i = 0; i < m; i++) {
            sum += arr[i];
        }

        long max = sum;
        for (int i = m; i < n; i++) {
            sum -= arr[i - m];
            sum += arr[i];

            max = Math.max(max,sum);
        }

        System.out.println(max);
    }
}