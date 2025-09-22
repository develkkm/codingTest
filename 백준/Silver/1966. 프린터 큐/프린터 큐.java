import java.io.*;
import java.util.*;

class Main{
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringBuilder sb = new StringBuilder();
    static StringTokenizer st;

    public static void main(String[] args) throws IOException {
        int t = Integer.parseInt(br.readLine());
        while(t-->0){
            Deque<int[]> dq = new ArrayDeque<>();
            st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            int m = Integer.parseInt(st.nextToken());
            int cnt = 0;

            st = new StringTokenizer(br.readLine());
            for (int i = 0; i < n; i++) {
                dq.addLast(new int[]{i,Integer.parseInt(st.nextToken())});
            }

            while(true){
                int[] first = dq.removeFirst();
                boolean isMax = true;

                for (int[] q : dq) {
                    if(first[1] < q[1]){
                        isMax = false;
                        break;
                    }
                }

                if(isMax){
                    cnt++;
                    if(first[0] == m) break;
                }
                else{
                    dq.addLast(first);
                }
            }

            sb.append(cnt).append("\n");
        }

        System.out.println(sb);
    }
}