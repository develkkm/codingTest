import java.util.*;
import java.io.*;

public class Main{

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;
    static StringBuilder sb = new StringBuilder();

    static ArrayList<Integer>[] adj;
    static boolean[] visited;
    static int[] order;
    static int cnt = 1;

    public static void main(String[] args) throws IOException {
        st = new StringTokenizer(br.readLine());
        int v = Integer.parseInt(st.nextToken());
        int e = Integer.parseInt(st.nextToken());
        int sn = Integer.parseInt(st.nextToken());

        adj = new ArrayList[v+1];
        for (int i = 0; i < v+1; i++) {
            adj[i] = new ArrayList<>();
        }
        visited = new boolean[v+1];
        order = new int[v+1];

        for (int i = 0; i < e; i++) {
            st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            int m = Integer.parseInt(st.nextToken());

            adj[n].add(m);
            adj[m].add(n);
        }


        for(ArrayList<Integer> list : adj){
            list.sort(Comparator.naturalOrder());
        }

        bfs(sn);

        for (int i = 1; i < v+1; i++) {
            sb.append(order[i]).append("\n");
        }

        System.out.println(sb);

    }

    private static void bfs(int start){
        ArrayDeque<Integer> dq = new ArrayDeque<>();
        dq.addLast(start);

        while(!dq.isEmpty()){
            int cur = dq.removeFirst();
            if(visited[cur]) continue;

            visited[cur] = true;
            order[cur] = cnt++;

            for(int next : adj[cur]){
                dq.addLast(next);
            }
        }
    }
}