import java.io.*;
import java.util.*;

class Main{
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringBuilder sb = new StringBuilder();
    static StringTokenizer st;

    public static void main(String[] args) throws IOException{
        int t = Integer.parseInt(br.readLine());
        while(t-->0){
            Deque<Integer> q = new ArrayDeque<>();
            String str = br.readLine();
            boolean flag = true;
            for (int i = 0; i < str.length(); i++) {
                if(str.charAt(i) == '(')
                    q.addLast(1);
                else {
                    if(q.isEmpty()){
                        flag = false;
                        break;
                    }
                    else
                        q.removeLast();
                }
            }
            if(!q.isEmpty()) flag = false;

            if(flag) sb.append("YES");
            else sb.append("NO");
            sb.append("\n");
        }

        System.out.println(sb);
    }
}