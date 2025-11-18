import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        boolean[][] visited = new boolean[m][n];
        int[][] city = new int[m][n];
        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < n; j++) {
                city[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        boolean result = dfs(city, visited, 0, 0, m, n);

        if (result) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }

    private static Boolean dfs(int[][] city, boolean[][] visited, int x, int y, int m, int n) {
        if (x == m - 1 && y == n - 1) {
            return true;
        }

        if (x < 0 || x >= m || y < 0 || y >= n || city[x][y] == 0 || visited[x][y]) {
            return false;
        }
        visited[x][y] = true;

        if (dfs(city, visited, x + 1, y, m, n)) {
            return true;
        }

        if (dfs(city, visited, x, y + 1, m, n)) {
            return true;
        }

        return false;
    }
}