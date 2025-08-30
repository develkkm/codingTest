import java.io.*;
import java.util.*;

class Main{

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringBuilder sb = new StringBuilder();
    static StringTokenizer st ;

    public static void main(String[] args) throws IOException{
        int[][] arr = new int[100][100];
        int result = 0;

        int n = Integer.parseInt(br.readLine());

        while(n-->0){
            st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            for(int i=x;i<x+10;i++){
                for(int j=y;j<y+10;j++){
                    arr[i][j] = 1;
                }
            }
        }

        for(int i=0;i<100;i++){
            for(int j=0;j<100;j++){
                result += arr[i][j];
            }
        }

        System.out.println(result);
    }
}