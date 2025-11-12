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
        int s = Integer.parseInt(st.nextToken());
        int r = Integer.parseInt(st.nextToken());
        int[] arr = new int[n+2];

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < s; i++) {
            arr[Integer.parseInt(st.nextToken())]--;
        }

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < r; i++) {
            int num = Integer.parseInt(st.nextToken());
            arr[num]++;
        }

        for (int i = 1; i <= n; i++) {
            if(arr[i] == 1) {
                if (arr[i - 1] == -1) {
                    arr[i - 1]++;
                } else if (arr[i + 1] == -1) {
                    arr[i + 1]++;
                }
            }
        }

        int cnt = 0;
        for (int i : arr) {
            if(i == -1)
                cnt++;
        }

        System.out.println(cnt);
    }
}
