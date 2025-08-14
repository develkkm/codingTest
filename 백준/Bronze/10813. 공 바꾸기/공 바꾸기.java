import java.io.*;
import java.util.*;

public class Main{
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringBuilder sb = new StringBuilder();
    static StringTokenizer st;
    static int[] arr;

    public static void main(String[] args) throws IOException{
        st = new StringTokenizer(br.readLine());
        int b = Integer.parseInt(st.nextToken());
        int t = Integer.parseInt(st.nextToken());
        arr = new int[b];
        for(int i=0;i<b;i++){
            arr[i] = i+1;
        }

        for(int i=0;i<t;i++){
            st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            int m = Integer.parseInt(st.nextToken());
            swap(n-1,m-1);
        }

        for(int i : arr)
            sb.append(i).append(" ");
        System.out.println(sb);
    }

    static void swap(int n,int m){
        int tmp = arr[n];
        arr[n] = arr[m];
        arr[m] = tmp;
    }
}