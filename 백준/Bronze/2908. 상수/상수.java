import java.io.*;
import java.util.*;

class Main{
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringBuilder sb = new StringBuilder();
    static StringTokenizer st;

    public static void main(String[] args) throws IOException {
        sb.append(br.readLine());
        sb.reverse();
        String str = sb.toString();
        st = new StringTokenizer(str);

        System.out.println(Math.max(Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken())));
    }
}