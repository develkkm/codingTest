import java.io.*;
import java.util.*;

class Main{
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringBuilder sb = new StringBuilder();
    static StringTokenizer st;

    public static void main(String[] args) throws IOException{
        int n = Integer.parseInt(br.readLine());
        int[] A = new int[n];
        int[] B = new int[n];
        int sum = 0;

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            A[i] = Integer.parseInt(st.nextToken());
        }

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            B[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(A);
        Arrays.sort(B);

        for (int i = 0; i < n; i++) {
            sum += A[i] * B[n-i-1];
        }

        System.out.println(sum);
    }

}