import java.io.*;
import java.util.*;

class Main{
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringBuilder sb = new StringBuilder();
    static StringTokenizer st;

    public static void main(String[] args) throws IOException {
        int n = Integer.parseInt(br.readLine());

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            int m = Integer.parseInt(st.nextToken());
            int sum = 0;
            for (int j = 0; j < m; j++) {
                sum+= Integer.parseInt(st.nextToken());
            }
            arr[i] = sum;
        }

        Arrays.sort(arr);

        int[] pfSum = new int[n+1];

        for (int i = 1; i < n+1; i++) {
            pfSum[i] = pfSum[i-1] + arr[i-1];
        }

        int sum = 0;
        for (int num : pfSum) {
            sum+=num;
        }

        System.out.println(sum);
    }
}
