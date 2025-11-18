import java.io.*;
import java.util.*;

class Main{
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringBuilder sb = new StringBuilder();
    static StringTokenizer st;
    static int[][] adj;
    static ArrayList<Integer> track = new ArrayList<>();
    static boolean[] visited;
    static int v;
    static int e;
    static int start = 1;

    public static void main(String[] args) throws IOException{
        v = Integer.parseInt(br.readLine());
        e = Integer.parseInt(br.readLine());
        adj = new int[v+1][v+1];
        visited = new boolean[v+1];

        while(e-->0){
            st = new StringTokenizer(br.readLine());
            int s = Integer.parseInt(st.nextToken());
            int e = Integer.parseInt(st.nextToken());

            adj[s][e] = 1;
            adj[e][s] = 1;
        }

        ArrayDeque<Integer> dq = new ArrayDeque<>();
        dq.addLast(start);

        while(!dq.isEmpty()){
            int cur = dq.removeFirst();

            if(!visited[cur]){
                visited[cur] = true;
                track.add(cur);
            }

            for (int i = 1; i < v+1; i++) {
                if(!visited[i] && adj[cur][i] == 1){
                    dq.addLast(i);
                }
            }
        }

        System.out.println(track.size()-1);
    }
}