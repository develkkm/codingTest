import java.io.*;
import java.util.*;

class Main{
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringBuilder sb = new StringBuilder();
    static StringTokenizer st;

    public static void main(String[] args) throws IOException{
        boolean[][] arr = new boolean[101][101];

        for (int i = 0; i < 4; i++) {
            st = new StringTokenizer(br.readLine());
            int x1 = Integer.parseInt(st.nextToken());
            int y1 = Integer.parseInt(st.nextToken());

            int x2 = Integer.parseInt(st.nextToken());
            int y2 = Integer.parseInt(st.nextToken());

            for (int j = x1; j < x2; j++) {
                for (int k = y1; k < y2 ; k++) {
                    arr[j][k] = true;
                }
            }
        }

        int width = 0;
        for (int j = 0; j < 101 ; j++) {
            for (int k = 0; k < 101; k++) {
                if(arr[j][k]) width++;
            }
        }

        System.out.println(width);
    }
}