import java.io.*;
import java.util.*;

class Main{
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringBuilder sb = new StringBuilder();
    static StringTokenizer st;

    public static void main(String[] args) throws IOException{
        int t = Integer.parseInt(br.readLine());
        Deque<Integer> dq = new ArrayDeque<>();
        int tmp = 1;

        for (int i = 0; i < t; i++) {
            int n = Integer.parseInt(br.readLine());

            for (; tmp <= n ; tmp++) {
                dq.addLast(tmp);
                sb.append("+").append("\n");
            }

            if(dq.getLast() == n){
                dq.removeLast();
                sb.append("-").append("\n");
            }
            else{
                System.out.println("NO");
                return;
            }
        }

        System.out.println(sb);
    }
}