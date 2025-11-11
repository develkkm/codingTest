import java.io.*;
import java.util.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringBuilder sb = new StringBuilder();
    static StringTokenizer st;

    public static void main(String[] args) throws IOException {
        st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        int[] arr = new int[1000001];

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            int num = Integer.parseInt(st.nextToken());
            arr[Integer.parseInt(st.nextToken())] = num;
        }

        int sum = 0;
        int max = 0;
        if(m > 500000) {
            for (int i = 0; i <arr.length ; i++) {
                sum += arr[i];
            }
            max = sum;
        }else {
            for (int i = 1; i <= 2 * m + 1; i++) {
                sum += arr[i];
            }
            
            max = sum;
            for (int i = 2 * m + 2; i < 1000001; i++) {
                sum -= arr[i - (2 * m + 1)];
                sum += arr[i];
                max = Math.max(sum, max);
            }
        }
        System.out.println(max);
    }
}
