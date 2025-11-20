import java.io.*;
import java.util.*;

class Main{
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringBuilder sb = new StringBuilder();
    static StringTokenizer st;

    static ArrayList<Integer>[] adj;
    static ArrayList<Integer> dTrack = new ArrayList<>();
    static boolean[] dVisited;
    static ArrayList<Integer> bTrack = new ArrayList<>();
    static boolean[] bVisited;

    public static void main(String[] args) throws IOException{
        st = new StringTokenizer(br.readLine());
        int v = Integer.parseInt(st.nextToken());
        int e = Integer.parseInt(st.nextToken());
        int sn = Integer.parseInt(st.nextToken());

        adj = new ArrayList[v+1];
        for (int i = 0; i < v+1; i++) {
            adj[i] = new ArrayList<>();
        }
        dVisited = new boolean[v+1];
        bVisited = new boolean[v+1];

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

        dfs(sn);
        bfs(sn);

        for(int num : dTrack){
            sb.append(num).append(" ");
        }
        sb.append("\n");
        for(int num : bTrack){
            sb.append(num).append(" ");
        }

        System.out.println(sb);
    }


    public static void dfs(int start){
        dVisited[start] = true;
        dTrack.add(start);

        for(int next : adj[start]){
            if(!dVisited[next]){
                dfs(next);
            }
        }
    }


    public static void bfs(int start){
        ArrayDeque<Integer> dq = new ArrayDeque<>();
        dq.addLast(start);

        while(!dq.isEmpty()){
            int cur = dq.removeFirst();
            if(bVisited[cur]) continue;

            bVisited[cur] = true;
            bTrack.add(cur);

            for(int next : adj[cur]){
                if(!bVisited[next]){
                    dq.addLast(next);
                }
            }
        }
    }
}