import java.io.*;
import java.util.*;

class Main{
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringBuilder sb = new StringBuilder();
    static StringTokenizer st;

    public static void main(String[] args) throws IOException {
        int n = Integer.parseInt(br.readLine());
        for (int i = 1; i <= n; i++) {
            sb.append(" ".repeat(Math.max(0, n - i)));
            sb.append("*".repeat(Math.max(0, 2 * i - 1)));
            sb.append("\n");
        }
        for (int i = n-1; i >= 1; i--) {
            sb.append(" ".repeat(Math.max(0, n - i)));
            sb.append("*".repeat(Math.max(0, 2 * i - 1)));
            sb.append("\n");
        }
        System.out.print(sb);
    }
}