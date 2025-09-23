import java.io.*;
import java.util.*;

class Main{
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringBuilder sb = new StringBuilder();
    static StringTokenizer st;

    public static void main(String[] args) throws IOException{
        int t = Integer.parseInt(br.readLine());
        int[][] arr = new int[t][2];

        for (int i = 0; i < t; i++) {
            st = new StringTokenizer(br.readLine());
            arr[i][0] = Integer.parseInt(st.nextToken());
            arr[i][1] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(arr,Comparator.comparingInt((int[]r) -> r[1])
                .thenComparing((int[]r) -> r[0]));
        int end = 0;
        int cnt = 0;

        for (int i = 0; i < t; i++) {
             if(arr[i][0] >= end){
                 cnt++;
                 end = arr[i][1];
             }
        }

        System.out.println(cnt);
    }
}