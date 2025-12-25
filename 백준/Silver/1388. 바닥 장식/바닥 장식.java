import java.io.*;
import java.util.*;

class Main{
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringBuilder sb = new StringBuilder();
    static StringTokenizer st;
    static int n,m;
    static boolean[][] visited;
    static char[][] arr;

    public static void main(String[] args) throws IOException {
        st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        arr = new char[n][m];
        visited = new boolean[n][m];

        for (int i = 0; i < n; i++) {
            String str = br.readLine();
            for (int j = 0; j < m; j++) {
                arr[i][j] = str.charAt(j);
            }
        }

        int cnt = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if(visited[i][j]) continue;
                dfs(i,j);
                cnt++;
            }
        }

        System.out.println(cnt);
    }

    private static void dfs(int i, int j) {
        visited[i][j] = true;
        if(arr[i][j] == '-'){
            j++;
            if(j<m && arr[i][j] == '-') dfs(i,j);
        }else{
            i++;
            if(i<n && arr[i][j] == '|') dfs(i,j);
        }
    }
}