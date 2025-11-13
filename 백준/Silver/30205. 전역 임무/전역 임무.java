import java.io.*;
import java.util.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringBuilder sb = new StringBuilder();
    static StringTokenizer st;
    static String str;

    public static void main(String[] args) throws IOException {
        st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        long p = Long.parseLong(st.nextToken());
        int ans = 1;

        while(n-->0){
            int[] arr = new int[m];
            st = new StringTokenizer(br.readLine());
            int mCnt = 0;
            for (int i = 0; i < m; i++) {
                int num = Integer.parseInt(st.nextToken());
                if(num == -1) mCnt++;
                else if(num == 0) {
                }
                else arr[i] = num;
            }

            Arrays.sort(arr);

            for (int i = 0; i < m; i++) {
                if(p < arr[i]){
                    if(mCnt == 0){
                        ans = 0;
                        break;
                    }else{
                        mCnt--;
                        p *= 2;
                        i--;
                    }
                }else{
                    p += arr[i];
                }
            }
            while(mCnt -->0) p *=2;
            if(ans == 0) break;
        }

        System.out.println(ans);
    }
}
