import java.io.*;
import java.util.*;

class Main{
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringBuilder sb = new StringBuilder();
    static StringTokenizer st;

    public static void main(String[] args) throws IOException {
        int t = Integer.parseInt(br.readLine());
        int[] arr = new int[t];
        int cal = (int) Math.round(t * 0.15);

        for (int i = 0; i < t; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        Arrays.sort(arr);
        double sum = 0;
        for (int i = cal; i < t-cal ; i++) {
            sum += arr[i];
        }

        int result = (int) Math.round(sum / (t - cal * 2));

        System.out.println(result);

    }
}