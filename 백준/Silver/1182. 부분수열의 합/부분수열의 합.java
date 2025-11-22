import java.io.*;
import java.util.*;

class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringBuilder sb = new StringBuilder();
    static StringTokenizer st;

    static int[] arr;
    static int n,m;
    static int cnt = 0;

    public static void main(String[] args) throws IOException {
        st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        arr = new int[n];

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        back(0,0);

        if(m == 0)
            cnt--;
        System.out.println(cnt);
    }

    private static void back(int start, int result){
        if(start == n){
            if(result == m)
                cnt++;
            return;
        }

        back(start+1,result+arr[start]);
        back(start+1,result);
    }
}
