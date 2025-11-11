import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine().trim();

        int[][] pos = new int[26][2];
        for (int[] p : pos) Arrays.fill(p, -1);

        for (int i = 0; i < s.length(); i++) {
            int idx = s.charAt(i) - 'A';
            if (pos[idx][0] == -1) pos[idx][0] = i;
            else pos[idx][1] = i;
        }

        int ans = 0;
        for (int a = 0; a < 26; a++) {
            for (int b = a + 1; b < 26; b++) {
                int a1 = pos[a][0], a2 = pos[a][1];
                int b1 = pos[b][0], b2 = pos[b][1];
                if (a1 == -1 || b1 == -1) continue;
                if ((a1 < b1 && b1 < a2 && a2 < b2) ||
                    (b1 < a1 && a1 < b2 && b2 < a2)) {
                    ans++;
                }
            }
        }

        System.out.println(ans);
    }
}
