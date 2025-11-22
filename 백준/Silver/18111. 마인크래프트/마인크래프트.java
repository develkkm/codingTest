import java.io.*;
import java.util.*;

class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;

    public static void main(String[] args) throws IOException {
        st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());

        int[][] arr = new int[n][m];

        int min = 257;
        int max = -1;

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < m; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
                min = Math.min(min, arr[i][j]);
                max = Math.max(max, arr[i][j]);
            }
        }

        int bestTime = Integer.MAX_VALUE;
        int bestHeight = -1;
        
        for (int h = min; h <= max; h++) {
            int remove = 0;
            int build = 0;

            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    if (arr[i][j] > h) {
                        remove += arr[i][j] - h;
                    } else {
                        build += h - arr[i][j];
                    }
                }
            }

            if (remove + b < build) continue;

            int time = remove * 2 + build;

            if (time < bestTime) {
                bestTime = time;
                bestHeight = h;
            } else if (time == bestTime && h > bestHeight) {
                bestHeight = h;
            }
        }

        System.out.println(bestTime + " " + bestHeight);
    }
}
