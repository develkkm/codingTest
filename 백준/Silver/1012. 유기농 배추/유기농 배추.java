import java.io.*;
import java.util.*;

class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;

    public static void main(String[] args) throws IOException {
        int t = Integer.parseInt(br.readLine());

        while (t-- > 0) {
            st = new StringTokenizer(br.readLine());
            int m = Integer.parseInt(st.nextToken());
            int n = Integer.parseInt(st.nextToken());
            int k = Integer.parseInt(st.nextToken());

            int[][] adj = new int[n][m];          
            boolean[][] visited = new boolean[n][m];


            for (int i = 0; i < k; i++) {
                st = new StringTokenizer(br.readLine());
                int x = Integer.parseInt(st.nextToken());
                int y = Integer.parseInt(st.nextToken());
                adj[y][x] = 1;
            }

            ArrayDeque<int[]> dq = new ArrayDeque<>();
            int cnt = 0;

            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    if (adj[i][j] == 1 && !visited[i][j]) {
                        dq.addLast(new int[]{i, j});
                        visited[i][j] = true;

                        while (!dq.isEmpty()) {
                            int[] cur = dq.removeFirst();
                            int x = cur[0];
                            int y = cur[1];

                            if (x - 1 >= 0 && !visited[x - 1][y] && adj[x - 1][y] == 1) {
                                visited[x - 1][y] = true;
                                dq.addLast(new int[]{x - 1, y});
                            }

                            if (x + 1 < n && !visited[x + 1][y] && adj[x + 1][y] == 1) {
                                visited[x + 1][y] = true;
                                dq.addLast(new int[]{x + 1, y});
                            }

                            if (y - 1 >= 0 && !visited[x][y - 1] && adj[x][y - 1] == 1) {
                                visited[x][y - 1] = true;
                                dq.addLast(new int[]{x, y - 1});
                            }

                            if (y + 1 < m && !visited[x][y + 1] && adj[x][y + 1] == 1) {
                                visited[x][y + 1] = true;
                                dq.addLast(new int[]{x, y + 1});
                            }
                        }
                        cnt++;
                    }
                }
            }
            System.out.println(cnt);
        }
    }
}
