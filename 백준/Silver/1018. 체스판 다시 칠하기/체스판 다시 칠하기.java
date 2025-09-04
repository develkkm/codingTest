import java.io.*;
import java.util.*;

class Main{
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringBuilder sb = new StringBuilder();
    static StringTokenizer st;
    static int cnt = 65;

    public static void main(String[] args) throws IOException {
        st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        char[][] arr = new char[n][m];
        for(int i=0;i<n;i++){
            String str = br.readLine();
            for(int j=0;j<m;j++){
                arr[i][j] = str.charAt(j);
            }
        }

        for(int i=0;i<n-7;i++){
            for(int j=0;j<m-7;j++){
                chess(i,j,arr);
            }
        }

        System.out.println(cnt);
    }

    public static void chess(int i,int j,char[][] arr){
        char first = arr[i][j];
        int wrong = 0;

        for(int k=0;k<8;k++){
            for(int l=0;l<8;l++){
                if(first != arr[i+k][j+l]) wrong++;

                if(first == 'W') first = 'B';
                else first = 'W';
            }
            if(first == 'W') first = 'B';
            else first = 'W';
        }
        cnt = Math.min(cnt,Math.min(wrong, 64-wrong));
    }
}