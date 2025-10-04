import java.io.*;
import java.util.*;

class Main{
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringBuilder sb = new StringBuilder();
    static StringTokenizer st;
    static int[][] snail;
    static int[] dr = {1, 0, -1, 0};
    static int[] dc = {0, 1, 0, -1};
    static int r = 0, c = 0, d = 0;
    static int target, targetR, targetC;

    public static void main(String[] args) throws IOException{
        int n = Integer.parseInt(br.readLine());
        target = Integer.parseInt(br.readLine());

        snail = new int[n][n];

        for (int i = n*n; i >0 ; i--) {
            snail[r][c] = i;

            int nr = r + dr[d];
            int nc = c + dc[d];

            if(nc < 0 || nc >= n || nr < 0 || nr >= n || snail[nr][nc] != 0){
                d = (d + 1) % 4;
                nr = r + dr[d];
                nc = c + dc[d];
            }

            r = nr;
            c = nc;
        }

        printSnail();
    }

    private static void printSnail(){
        for (int i = 0; i < snail.length; i++) {
            for (int j = 0; j < snail.length; j++) {
                if(target == snail[i][j]){
                    targetR = i + 1;
                    targetC = j + 1;
                }
                sb.append(snail[i][j]).append(" ");
            }
            sb.append("\n");
        }
        sb.append(targetR).append(" ").append(targetC);
        System.out.println(sb);
    }
}