import java.io.*;
import java.util.*;

class Main{
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringBuilder sb = new StringBuilder();
    static StringTokenizer st;

    public static void main(String[] args) throws IOException {
        int n = Integer.parseInt(br.readLine());

        int[] arr = new int[6];
        int maxRow = 0;
        int maxCol = 0;
        for (int i = 0; i < 6; i++) {
            st = new StringTokenizer(br.readLine());
            int direction = Integer.parseInt(st.nextToken());
            int length = Integer.parseInt(st.nextToken());
            arr[i] = length;

            if(direction == 1 || direction == 2){
                maxRow = Math.max(maxRow, length);
            }

            if(direction == 3 || direction == 4){
                maxCol = Math.max(maxCol, length);
            }
        }

        int totalWidth = maxRow * maxCol;

        int littleSquareRow = 0;
        int littleSquareCol = 0;

        for (int i = 0; i < 6; i++) {
            if(arr[i] == maxRow){
                int left = 0;
                int right = 0;

                if(i == 0){
                    left = arr[5];
                    right = arr[i+1];
                }else if(i == 5){
                    left = arr[i-1];
                    right = arr[0];
                }else{
                    left = arr[i-1];
                    right = arr[i+1];
                }

                littleSquareRow = Math.abs(left - right);
            }

            if(arr[i] == maxCol){
                int left = 0;
                int right = 0;

                if(i == 0){
                    left = arr[5];
                    right = arr[i+1];
                }else if(i == 5){
                    left = arr[i-1];
                    right = arr[0];
                }else{
                    left = arr[i-1];
                    right = arr[i+1];
                }
                
                littleSquareCol = Math.abs(left - right);
            }
        }

        System.out.println((totalWidth - (littleSquareCol * littleSquareRow)) * n );
    }
}