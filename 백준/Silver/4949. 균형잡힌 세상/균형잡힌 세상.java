import java.io.*;
import java.util.*;

class Main{
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringBuilder sb = new StringBuilder();
    static StringTokenizer st;

    public static void main(String[] args) throws IOException{
        while(true){
            String str = br.readLine();
            if(str.equals(".")) break;
            Deque<Character> q = new ArrayDeque<>();
            boolean flag = true;

            for (int i = 0; i < str.length(); i++) {
                char ch = str.charAt(i);
                if(ch == '(' || ch == '['){
                    q.addLast(ch);
                }
                else if(ch == ')'){
                    if(q.isEmpty() || q.getLast()!='('){
                        flag = false;
                        break;
                    }
                    else q.removeLast();
                }
                else if(ch == ']'){
                    if(q.isEmpty() || q.getLast()!='['){
                        flag = false;
                        break;
                    }
                    else q.removeLast();
                }
            }
            if(!q.isEmpty()) flag = false;

            if(flag) sb.append("yes");
            else sb.append("no");
            sb.append("\n");
        }
        System.out.println(sb);

    }
}