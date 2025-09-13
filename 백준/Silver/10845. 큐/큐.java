import java.io.*;
import java.util.*;

class Main{
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringBuilder sb = new StringBuilder();
    static StringTokenizer st;

    public static void main(String[] args) throws IOException{
        int t = Integer.parseInt(br.readLine());
        Deque<Integer> dq = new ArrayDeque<>();

        while(t-->0){
            st = new StringTokenizer(br.readLine());
            String str = st.nextToken();

            switch(str){
                case "push":
                    dq.addLast(Integer.parseInt(st.nextToken()));
                    break;
                case "pop":
                    if(dq.isEmpty()) sb.append(-1);
                    else sb.append(dq.removeFirst());
                    sb.append("\n");
                    break;
                case "size":
                    sb.append(dq.size());
                    sb.append("\n");
                    break;
                case "empty":
                    if(dq.isEmpty()) sb.append(1);
                    else sb.append(0);
                    sb.append("\n");
                    break;
                case "front":
                    if(dq.isEmpty()) sb.append(-1);
                    else sb.append(dq.getFirst());
                    sb.append("\n");
                    break;
                case "back":
                    if(dq.isEmpty()) sb.append(-1);
                    else sb.append(dq.getLast());
                    sb.append("\n");
                    break;
            }
        }
        System.out.println(sb);
    }
}