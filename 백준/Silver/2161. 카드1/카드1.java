import java.io.*;
import java.util.*;

class Main{
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringBuilder sb = new StringBuilder();
    static StringTokenizer st;

    public static void main(String[] args) throws IOException{
        ArrayDeque<Integer> dq = new ArrayDeque<>();
        int n = Integer.parseInt(br.readLine());

        for (int i = 1; i <= n ; i++) {
            dq.addFirst(i);
        }

        while(dq.size()!=1){
            sb.append(dq.removeLast()).append(" ");
            dq.addFirst(dq.removeLast());
        }

        sb.append(dq.getFirst());
        System.out.println(sb);
    }
}