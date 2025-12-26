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
        int maxRowIdx = 0;
        int maxColIdx = 0;
        for (int i = 0; i < 6; i++) {
            st = new StringTokenizer(br.readLine());
            int direction = Integer.parseInt(st.nextToken());
            int length = Integer.parseInt(st.nextToken());
            arr[i] = length;

            if(direction == 1 || direction == 2){
                if(length > maxRow){
                    maxRow = length;
                    maxRowIdx = i;
                }
            }

            if(direction == 3 || direction == 4){
                if(length > maxCol){
                    maxCol = length;
                    maxColIdx = i;
                }
            }
        }

        int totalWidth = maxRow * maxCol;

        int leftMaxRow = arr[(maxRowIdx + 5) % 6];
        int rightMaxRow = arr[(maxRowIdx + 1) % 6];
        int littleSquareRow = Math.abs(leftMaxRow - rightMaxRow);

        int leftMaxCol = arr[(maxColIdx + 5) % 6];
        int rightMaxCol = arr[(maxColIdx + 1) % 6];
        int littleSquareCol = Math.abs(leftMaxCol - rightMaxCol);

        System.out.println((totalWidth - (littleSquareCol * littleSquareRow)) * n );
    }
}