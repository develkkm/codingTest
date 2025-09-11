import java.io.*;
import java.util.*;

class Main{
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringBuilder sb = new StringBuilder();
    static StringTokenizer st;

    public static void main(String[] args) throws IOException{
        int t = Integer.parseInt(br.readLine());
        Deque<Integer> q = new ArrayDeque<>();
        while(t-->0){
            st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());

            switch(n){
                case 1:
                    q.addFirst(Integer.parseInt(st.nextToken()));
                    break;
                case 2:
                    q.addLast(Integer.parseInt(st.nextToken()));
                    break;
                case 3:
                    if(q.isEmpty()) sb.append(-1);
                    else sb.append(q.removeFirst());
                    sb.append("\n");
                    break;
                case 4:
                    if(q.isEmpty()) sb.append(-1);
                    else sb.append(q.removeLast());
                    sb.append("\n");
                    break;
                case 5:
                    sb.append(q.size()).append("\n");
                    break;
                case 6:
                    if(q.isEmpty()) sb.append(1);
                    else sb.append(0);
                    sb.append("\n");
                    break;
                case 7:
                    if(q.isEmpty()) sb.append(-1);
                    else sb.append(q.getFirst());
                    sb.append("\n");
                    break;
                case 8:
                    if(q.isEmpty()) sb.append(-1);
                    else sb.append(q.getLast());
                    sb.append("\n");
                    break;
            }
        }

        System.out.println(sb);
    }
}