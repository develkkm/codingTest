import java.io.*;
import java.util.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringBuilder sb = new StringBuilder();
    static StringTokenizer st;

    public static void main(String[] args) throws IOException {
        st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());

        int[] arr = new int[n+1];
        for (int i = 0; i < b; i++) {
            arr[Integer.parseInt(br.readLine())]++;
        }

        int sum = 0;
        for (int i = 1; i < k+1; i++) {
            sum+=arr[i];
        }
        int min = sum;

        for (int i = k+1; i < n+1; i++) {
            sum -= arr[i - k];
            sum += arr[i];
            min = Math.min(sum,min);
        }

        System.out.println(min);
    }
}
