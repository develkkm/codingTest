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
            String str = st.nextToken();
            switch(str){
                case "push":
                    q.addFirst(Integer.parseInt(st.nextToken()));
                    break;
                case "pop":
                    if(q.isEmpty()){
                        sb.append(-1);
                    }
                    else{
                        sb.append(q.removeLast());
                    }
                    sb.append("\n");
                    break;
                case "size":
                    sb.append(q.size()).append("\n");
                    break;
                case "empty":
                    if(q.isEmpty()){
                        sb.append(1);
                    }
                    else{
                        sb.append(0);
                    }
                    sb.append("\n");
                    break;
                case "front":
                    if(q.isEmpty()){
                        sb.append(-1);
                    }
                    else{
                        sb.append(q.getLast());
                    }
                    sb.append("\n");
                    break;
                case "back":
                    if(q.isEmpty()){
                        sb.append(-1);
                    }
                    else{
                        sb.append(q.getFirst());
                    }
                    sb.append("\n");
                    break;
            }
        }

        System.out.println(sb);
    }
}