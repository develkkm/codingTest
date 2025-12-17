import java.io.*;
import java.util.*;

class Main{
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringBuilder sb = new StringBuilder();
    static StringTokenizer st;

    public static void main(String[] args) throws IOException{
        st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int[][] arr1 = new int[n][m];
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < m; j++) {
                arr1[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        st = new StringTokenizer(br.readLine());
        Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        int[][] arr2 = new int[m][k];
        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < k; j++) {
                arr2[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        int[][] result = new int[n][k];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                int a = arr1[j][i];

                for (int l = 0; l < k; l++) {
                    result[j][l] += a * arr2[i][l];
                }
            }
        }

        for (int[] arr : result) {
            for (int num : arr) {
                sb.append(num).append(" ");
            }
            sb.append("\n");
        }

        System.out.println(sb);
    }
}