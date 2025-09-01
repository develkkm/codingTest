import java.io.*;
import java.util.*;

class Main{
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringBuilder sb = new StringBuilder();
    static StringTokenizer st;

    public static void main(String[] args) throws IOException{
        while(true) {
            st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            if (x == 0 || y == 0)
                break;

            if (x % y == 0)
                sb.append("multiple");
            else if (y % x == 0)
                sb.append("factor");
            else
                sb.append("neither");
            sb.append("\n");
        }

        System.out.println(sb);
    }
}