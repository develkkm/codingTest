import java.io.*;
import java.util.*;

class Main{
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringBuilder sb = new StringBuilder();
    static StringTokenizer st;

    public static void main(String[] args) throws IOException {
        st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        ArrayDeque<Integer> dq = new ArrayDeque<>();
        for (int i = 1; i <= n; i++) {
            dq.addLast(i);
        }
        
        sb.append("<");
        while(dq.size()!=1){
            for (int i = 0; i < k - 1; i++) {
                dq.addLast(dq.removeFirst());
            }
            
            sb.append(dq.removeFirst()).append(", ");
        }
        sb.append(dq.removeFirst()).append(">");

        System.out.println(sb);
    }
}
