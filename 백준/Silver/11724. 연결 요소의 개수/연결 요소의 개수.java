import java.io.*;
import java.util.*;

class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringBuilder sb = new StringBuilder();
    static StringTokenizer st;

    static ArrayList<Integer>[] adj;
    static boolean[] visited;
    static int cnt = 0;

    public static void main(String[] args) throws IOException {
        st = new StringTokenizer(br.readLine());
        int v = Integer.parseInt(st.nextToken());
        int e = Integer.parseInt(st.nextToken());

        adj = new ArrayList[v+1];
        for (int i = 0; i < v+1; i++) {
            adj[i] = new ArrayList<>();
        }
        visited = new boolean[v+1];

        for (int i = 0; i < e; i++) {
            st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            int m = Integer.parseInt(st.nextToken());

            adj[n].add(m);
            adj[m].add(n);
        }

        for (int i = 1; i < v+1; i++) {
            if(!visited[i]) {
                dfs(i);
                cnt++;
            }
        }

        System.out.println(cnt);
    }

    private static void dfs(int start){
        visited[start] = true;

        for(int next : adj[start]) {
            if (!visited[next]) {
                dfs(next);
            }
        }
    }
}
