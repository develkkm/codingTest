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
        
        int[][] arr = new int[n][m];

        for (int i = 0; i < n; i++) {
            String str = br.readLine();
            for (int j = 0; j < m; j++) {
                arr[i][j] = str.charAt(j)-'0';
            }
        }

        int maxSize = Math.min(n,m);
        int maxWidth = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                for (int k = 0; k < maxSize; k++) {
                    if((i+k) < n && (j+k) < m && arr[i][j] == arr[i+k][j] && arr[i][j+k] == arr[i+k][j+k] && arr[i][j] == arr[i][j+k]){
                        maxWidth = Math.max(maxWidth, (k+1) * (k+1));
                    }
                }
            }
        }

        System.out.println(maxWidth);
    }
}