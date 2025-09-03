import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());
        int d = Integer.parseInt(st.nextToken());
        int e = Integer.parseInt(st.nextToken());
        int f = Integer.parseInt(st.nextToken());

        for (int x = -999; x <= 999; x++) {
            // 첫 번째 식에서 y를 계산할 수 있는지 확인
            if (b != 0 && (c - a * x) % b == 0) {
                int y = (c - a * x) / b;

                // 두 번째 식도 만족하는지 검사
                if (d * x + e * y == f) {
                    System.out.println(x + " " + y);
                    return;
                }
            }

            // 만약 b가 0이라서 위에서 못 구하는 경우 -> y를 두 번째 식으로부터 계산
            if (e != 0 && (f - d * x) % e == 0) {
                int y = (f - d * x) / e;

                if (a * x + b * y == c) {
                    System.out.println(x + " " + y);
                    return;
                }
            }
        }
    }
}
