import java.io.*;
import java.util.*;

class Main{
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringBuilder sb = new StringBuilder();
    static StringTokenizer st;

    public static void main(String[] args) throws IOException{
        int n = Integer.parseInt(br.readLine());
        boolean[] arrN = new boolean[20000001];

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            arrN[Integer.parseInt(st.nextToken())+10000000] = true;
        }

        int m = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < m; i++) {
            if(arrN[Integer.parseInt(st.nextToken())+10000000])
                sb.append(1);
            else
                sb.append(0);
            sb.append(" ");
        }

        System.out.println(sb);
    }
}