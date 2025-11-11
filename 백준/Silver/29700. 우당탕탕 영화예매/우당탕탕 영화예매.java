import java.io.*;
import java.util.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringBuilder sb = new StringBuilder();
    static StringTokenizer st;

    public static void main(String[] args) throws IOException {
        st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        int result = 0;

        for (int i = 0; i < n; i++) {
            String row = br.readLine();
            if (m < k) continue;

            int streak = 0;
            for (int j = 0; j < m; j++) {
                if (row.charAt(j) == '0') {
                    streak++;
                } else {
                    if (streak >= k) result += (streak - k + 1);
                    streak = 0;
                }
            }
            if (streak >= k) result += (streak - k + 1);
        }

        System.out.println(result);
    }
}
