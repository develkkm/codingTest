import java.io.*;
import java.util.*;

class Main{
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringBuilder sb = new StringBuilder();
    static StringTokenizer st;
    static int[][] arr;

    public static void main(String[] args) throws IOException{
        arr = new int[5][5];

        for (int i = 0; i < 5; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < 5; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        int cnt = 0;
        for (int i = 0; i < 5; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < 5; j++) {
                findIdx(Integer.parseInt(st.nextToken()));
                cnt++;
                if (bingo()) {
                    System.out.println(cnt);
                    return;
                }
            }
        }
    }

    private static boolean bingo() {
        int bCnt = 0;

        for (int i = 0; i < 5; i++) {
            int cnt = 0;
            for (int j = 0 ; j < 5; j++) {
                if(arr[j][i] == -1) cnt++;
            }
            if(cnt == 5) bCnt++;
        }

        for (int i = 0; i < 5; i++) {
            int cnt = 0;
            for (int j = 0 ; j < 5; j++) {
                if(arr[i][j] == -1) cnt++;
            }
            if(cnt == 5) bCnt++;
        }

        int xCnt = 0;
        for (int i = 0; i < 5; i++) {
            if(arr[i][i] == -1) xCnt++;
        }
        if(xCnt == 5) bCnt++;

        int yCnt = 0;
        for (int i = 0; i < 5; i++) {
            if(arr[i][4-i] == -1) yCnt++;
        }
        if(yCnt == 5) bCnt++;

        return bCnt >= 3;
    }

    private static void findIdx(int num) {
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if(arr[i][j] == num){
                    arr[i][j] = -1;
                }
            }
        }
    }
}