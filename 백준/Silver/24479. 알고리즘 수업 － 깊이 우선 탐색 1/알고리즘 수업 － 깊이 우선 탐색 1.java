import java.io.*;
import java.util.*;

class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringBuilder sb = new StringBuilder();
    static StringTokenizer st;

    static ArrayList<Integer>[] adj;
    static boolean[] visited;
    static int[] order;
    static int cnt = 1;

    public static void main(String[] args) throws IOException {

        st = new StringTokenizer(br.readLine());
        int v = Integer.parseInt(st.nextToken());
        int e = Integer.parseInt(st.nextToken());
        int sn = Integer.parseInt(st.nextToken());

        adj = new ArrayList[v + 1];
        visited = new boolean[v + 1];
        order = new int[v + 1];

        for (int i = 0; i <= v; i++) {
            adj[i] = new ArrayList<>();
        }

        for (int i = 0; i < e; i++) {
            st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            int m = Integer.parseInt(st.nextToken());

            adj[n].add(m);
            adj[m].add(n);
        }

        for (int i = 1; i <= v; i++) {
            Collections.sort(adj[i]);
        }

        dfs(sn);

        for (int i = 1; i <= v; i++) {
            sb.append(order[i]).append("\n");
        }

        System.out.print(sb);
    }

    private static void dfs(int cur) {
        visited[cur] = true;
        order[cur] = cnt++;

        for (int next : adj[cur]) {
            if (!visited[next]) {
                dfs(next);
            }
        }
    }
}
