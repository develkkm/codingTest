import java.io.*;
import java.util.*;

class Main{
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringBuilder sb = new StringBuilder();
    static StringTokenizer st;

    public static void main(String[] args) throws IOException {
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            int person = Integer.parseInt(st.nextToken());
            int cnt = 0;
            int idx = 0;
            for (int j = 0; j < n; j++) {
                if(arr[j] == 0) cnt++;
                if(cnt == person) idx = j+1;
            }

            while(arr[idx]!=0){
                idx++;
            }

            arr[idx] = i+1;
        }

        for (int num : arr) {
            sb.append(num).append(" ");
        }

        System.out.println(sb);
    }
}