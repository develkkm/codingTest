import java.io.*;
import java.util.*;

class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringBuilder sb = new StringBuilder();
    static StringTokenizer st;

    public static void main(String[] args) throws IOException {
        st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        double[] arr = new double[n];
        for (int i = 0; i < n; i++) {
            arr[i] = Double.parseDouble(br.readLine());
        }

        Arrays.sort(arr);

        double sum1 = 0;
        for (int i = k; i < n-k; i++) {
            sum1 += arr[i];
        }
        double result1 = sum1 / (n-(2*k));

        double sum2 = sum1 + arr[k] * k + arr[n-k-1] * k;
        double result2 = sum2 / n;

        System.out.printf("%.2f%n",result1);
        System.out.printf("%.2f%n",result2);
    }
}
