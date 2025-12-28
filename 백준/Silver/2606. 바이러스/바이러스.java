import java.io.*;
import java.util.*;

class Main{
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringBuilder sb = new StringBuilder();
    static StringTokenizer st;
    static boolean[] visited;
    static int cnt = 0;
    static int n,m;
    static int[][] arr;

    public static void main(String[] args) throws IOException{
        n = Integer.parseInt(br.readLine());
        m = Integer.parseInt(br.readLine());

        arr = new int[n+1][n+1];
        visited = new boolean[n+1];

        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());
            int start = Integer.parseInt(st.nextToken());
            int end = Integer.parseInt(st.nextToken());

            arr[start][end] = 1;
            arr[end][start] = 1;
        }

        dfs(1);

        System.out.println(cnt-1);
    }

    private static void dfs(int start) {
        if(visited[start]) return;

        visited[start] = true;
        cnt++;
        for (int i = 1; i <= n; i++) {
            if(arr[start][i] == 1)
                dfs(i);
        }
    }
}