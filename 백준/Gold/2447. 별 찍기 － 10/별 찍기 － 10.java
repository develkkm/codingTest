import java.io.*;
import java.util.*;

class Main{
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringBuilder sb = new StringBuilder();
    static StringTokenizer st;
    static char[][] arr;

    public static void main(String[] args) throws IOException {
        int n = Integer.parseInt(br.readLine());
        arr = new char[n][n];

        star(0,0,n,false);

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                sb.append(arr[i][j]);
            }
            sb.append("\n");
        }

        System.out.println(sb);
    }

    private static void star(int x, int y, int n, boolean blank){

        if(blank){
            for (int i = x; i < x + n ; i++) {
                for (int j = y; j < y + n; j++) {
                    arr[i][j] = ' ';
                }
            }
            return;
        }

        if(n == 1){
            arr[x][y] = '*';
            return;
        }


        int size = n / 3;
        int cnt = 0;
        for (int i = x; i < x + n; i+=size) {
            for (int j = y; j < y + n; j+=size) {
                cnt++;
                if(cnt == 5)
                    star(i,j,size,true);
                else
                    star(i,j,size,false);
            }
        }
    }
}