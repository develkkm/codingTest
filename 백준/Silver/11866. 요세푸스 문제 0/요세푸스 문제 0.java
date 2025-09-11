import java.io.*;
import java.util.*;

class Main{
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringBuilder sb = new StringBuilder();
    static StringTokenizer st;

    public static void main(String[] args) throws IOException{
        st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        Deque<Integer> q= new ArrayDeque<>();
        int cnt = 1;

        for (int i = 1; i <= n; i++) {
            q.addLast(i);
        }

        sb.append("<");
        while(q.size()>1){
            if(cnt == k){
                sb.append(q.removeFirst()).append(", ");
                cnt = 1;
            }
            else{
                q.addLast(q.removeFirst());
                cnt++;
            }
        }
        sb.append(q.removeFirst()).append(">");

        System.out.println(sb);
    }
}