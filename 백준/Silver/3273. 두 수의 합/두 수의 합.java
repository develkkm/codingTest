import java.io.*;
import java.util.*;

public class Main{
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringBuilder sb = new StringBuilder();
    static StringTokenizer st;

    public static void main(String[] args) throws IOException{
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        int m = Integer.parseInt(br.readLine());

        int s = 0;
        int e = n-1;
        int cnt = 0;

        Arrays.sort(arr);
        while(true){
            int num = arr[s] + arr[e];
            if(num < m){
                s++;
            } else if(num == m){
                cnt++;
                e--;
            }else{
                e--;
            }
            if(s >= e) break;
        }
        System.out.println(cnt);
    }
}