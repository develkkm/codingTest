import java.io.*;
import java.util.*;

class Main{
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringBuilder sb = new StringBuilder();
    static StringTokenizer st;

    public static void main(String[] args) throws IOException{
        int n = Integer.parseInt(br.readLine());
        int[][] adj =  new int[n][n];
        boolean[][] visited = new boolean[n][n];
        int num = 0;

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < n; j++) {
                adj[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        ArrayDeque<int[]> dq = new ArrayDeque<>();
        dq.addLast(new int[]{0,0});

        while(!dq.isEmpty()){
            int[] arr = dq.removeFirst();
            int x = arr[0];
            int y = arr[1];

            if(visited[x][y]) continue;

            visited[x][y] = true;

            num = adj[x][y];
            if(num == -1) break;

            if((x+num) < n)
                dq.addLast(new int[] {x+num,y});
            if((y+num) < n)
                dq.addLast(new int[] {x,y+num});
        }
        if(num == -1){
            System.out.println("HaruHaru");
        }else{
            System.out.println("Hing");
        }
    }
}