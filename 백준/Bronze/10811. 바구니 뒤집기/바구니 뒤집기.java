import java.io.*;
import java.util.*;

class Main{
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringBuilder sb = new StringBuilder();
    static StringTokenizer st;

    public static void main(String[] args) throws IOException {
        st = new StringTokenizer(br.readLine());
        int cnt = Integer.parseInt(st.nextToken());
        int t = Integer.parseInt(st.nextToken());

        int[] arr = new int[cnt];
        for(int i=0;i<cnt;i++){
            arr[i] = i+1;
        }

        while(t-->0){
            st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());

            for(;x<y;x++,y--){
                int tmp = arr[x-1];
                arr[x-1] = arr[y-1];
                arr[y-1] = tmp;
            }
        }

        for(int i : arr){
            sb.append(i+" ");
        }
        System.out.println(sb);
    }
}