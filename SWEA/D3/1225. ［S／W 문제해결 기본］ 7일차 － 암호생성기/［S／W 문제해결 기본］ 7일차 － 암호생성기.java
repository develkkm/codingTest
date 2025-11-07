import java.io.*;
import java.util.*;

public class Solution{
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringBuilder sb = new StringBuilder();
    static StringTokenizer st;

    public static void main(String[] args) throws IOException{
        for (int t = 0; t < 10; t++) {
            int n = Integer.parseInt(br.readLine());
            Deque<Integer> dq = new ArrayDeque<>();
            st = new StringTokenizer(br.readLine());
            for (int i = 0; i < 8; i++) {
                dq.addLast(Integer.parseInt(st.nextToken()));
            }

            int minus = 1;
            while(true){
                int num = dq.removeFirst();
                if(num - minus <= 0){
                    num = 0;
                    dq.addLast(num);
                    break;
                }

                dq.addLast(num - minus);
                minus++;
                if(minus == 6) minus = 1;
            }

            sb.append("#").append(n).append(" ");
            for(int num : dq){
                sb.append(num).append(" ");
            }
            sb.append("\n");
        }

        System.out.println(sb);
    }
}