import java.io.*;
import java.util.*;

class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringBuilder sb = new StringBuilder();
    static StringTokenizer st;

    static ArrayList<Integer>[] adj;
    static boolean[] visited;
    static int n,m,k,x;
    static ArrayList<Integer> list = new ArrayList<>();

    public static void main(String[] args) throws IOException {
        st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        k = Integer.parseInt(st.nextToken());
        x = Integer.parseInt(st.nextToken());

        adj = new ArrayList[n+1];
        for (int i = 0; i < n+1; i++) {
            adj[i] = new ArrayList<>();
        }
        visited = new boolean[n+1];

        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());
            int s = Integer.parseInt(st.nextToken());
            int e = Integer.parseInt(st.nextToken());

            adj[s].add(e);
        }

        bfs(x);

        if (list.isEmpty()) {
            System.out.println(-1);
        }else{
            Collections.sort(list);
            for (int num : list) {
                System.out.println(num);
            }
        }

    }

    private static void bfs(int num){
        ArrayDeque<int []> dq = new ArrayDeque<>();
        dq.addLast(new int[]{num,0});
        visited[num] = true;

        while(!dq.isEmpty()){
            int[] cur = dq.removeFirst();
            int start = cur[0];
            int depth = cur[1];

            for (int next : adj[start]) {
                if(!visited[next]) {
                    dq.addLast(new int[]{next, depth + 1});
                    if(depth+1 == k && !visited[next]){
                        list.add(next);
                    }
                    visited[next] = true;
                }
            }
        }
    }

}
