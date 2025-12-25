import java.io.*;
import java.util.*;

class Main{
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringBuilder sb = new StringBuilder();
    static StringTokenizer st;

    public static void main(String[] args) throws IOException {
        int n = Integer.parseInt(br.readLine());

        char[][] arr = new char[n][n];
        for (int i = 0; i < n; i++) {
            String str = br.readLine();
            for (int j = 0; j < n; j++) {
                arr[i][j] = str.charAt(j);
            }
        }

        int maxLength = findMaxLength(arr);
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if(j+1 < n && arr[i][j] != arr[i][j+1]){
                    swap(arr,i,j,i,j+1);
                    maxLength = Math.max(maxLength,findMaxLength(arr));
                    swap(arr,i,j,i,j+1);
                }

                if(i+1 < n && arr[i][j] != arr[i+1][j]){
                    swap(arr,i,j,i+1,j);
                    maxLength = Math.max(maxLength,findMaxLength(arr));
                    swap(arr,i,j,i+1,j);
                }
            }
        }

        System.out.println(maxLength);
    }

    private static void swap(char[][] arr, int x1, int y1, int x2, int y2){
        char tmp = arr[x1][y1];
        arr[x1][y1] = arr[x2][y2];
        arr[x2][y2] = tmp;
    }

    private static int findMaxLength(char[][] arr){
        int row = 0;
        for (int i = 0; i < arr.length; i++) {
            int cnt = 1;
            for (int j = 0; j < arr[0].length-1; j++) {
                if(arr[i][j] == arr[i][j+1]) cnt++;
                else{
                    row = Math.max(row,cnt);
                    cnt = 1;
                }
            }
            row = Math.max(row,cnt);
        }

        int col = 0;
        for (int i = 0; i < arr.length; i++) {
            int cnt = 1;
            for (int j = 0; j < arr[0].length-1; j++) {
                if(arr[j][i] == arr[j+1][i]) cnt++;
                else{
                    col = Math.max(col,cnt);
                    cnt = 1;
                }
            }
            col = Math.max(col,cnt);
        }

        return Math.max(row,col);
    }
}