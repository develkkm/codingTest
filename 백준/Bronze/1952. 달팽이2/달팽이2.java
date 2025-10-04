import java.io.*;
import java.util.*;

class Main{
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringBuilder sb = new StringBuilder();
    static StringTokenizer st;
    static int[] dr = {-1, 0, 1, 0};
    static int[] dc = {0, 1, 0, -1};
    static int r, c = 0;
    static int d = 1;
    static boolean[][] arr;


    public static void main(String[] args) throws IOException {
        st = new StringTokenizer(br.readLine());
        int m = Integer.parseInt(st.nextToken());
        int n = Integer.parseInt(st.nextToken());
        int cnt = 0;

        arr = new boolean[m][n];

        for (int i = 0; i < m * n - 1; i++) {
            arr[r][c] = true;

            int nr = r + dr[d];
            int nc = c + dc[d];

            if(nr < 0 || nr >= m || nc < 0 || nc >= n || arr[nr][nc]){
                d = (d + 1) % 4;

                nr = r + dr[d];
                nc = c + dc[d];
                cnt++;
            }

            r = nr;
            c = nc;
        }

        System.out.println(cnt);

    }
}