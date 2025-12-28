import java.io.*;
import java.util.*;

class Main{
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringBuilder sb = new StringBuilder();
    static StringTokenizer st;

    public static void main(String[] args) throws IOException {
        while(true){
            st = new StringTokenizer(br.readLine());
            int w = Integer.parseInt(st.nextToken());
            int h = Integer.parseInt(st.nextToken());

            if(w == 0 && h == 0) break;

            int[][] arr = new int[h][w];
            boolean[][] visited = new boolean[h][w];
            for (int i = 0; i < h; i++) {
                st = new StringTokenizer(br.readLine());
                for (int j = 0; j < w; j++) {
                    arr[i][j] = Integer.parseInt(st.nextToken());
                }
            }

            int cnt = 0;
            for (int i = 0; i < h; i++) {
                for (int j = 0; j < w; j++) {
                    if(arr[i][j] == 1){
                        if(dfs(arr,visited,w,h,i,j)){
                            cnt++;
                        }
                    }
                }
            }

            sb.append(cnt).append("\n");
        }

        System.out.println(sb);
    }

    private static boolean dfs(int[][] arr, boolean[][] visited, int w, int h, int i, int j) {
        if(i < 0 || i >= h || j < 0 || j >= w || visited[i][j] || arr[i][j] == 0) return false;

        visited[i][j] = true;

        dfs(arr,visited,w,h,i+1,j);
        dfs(arr,visited,w,h,i+1,j+1);
        dfs(arr,visited,w,h,i+1,j-1);
        dfs(arr,visited,w,h,i-1,j);
        dfs(arr,visited,w,h,i-1,j+1);
        dfs(arr,visited,w,h,i-1,j-1);
        dfs(arr,visited,w,h,i,j+1);
        dfs(arr,visited,w,h,i,j-1);

        return true;
    }
}