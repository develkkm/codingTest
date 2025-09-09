import java.io.*;
import java.util.*;

class Main{
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringBuilder sb = new StringBuilder();
    static StringTokenizer st;

    public static void main(String[] args) throws IOException{
        st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        String[] arr = new String[n];
        int cnt = 0;

        for (int i = 0; i < n; i++) {
            arr[i] = br.readLine();
        }

        for (int i = 0; i < m; i++) {
            String str  = br.readLine();
            if(Arrays.asList(arr).contains(str))
                cnt++;
        }

        System.out.println(cnt);
    }
}