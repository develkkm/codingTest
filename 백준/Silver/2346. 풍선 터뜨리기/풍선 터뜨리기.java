import java.io.*;
import java.util.*;

class Main{
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringBuilder sb = new StringBuilder();
    static StringTokenizer st;

    public static void main(String[] args) throws IOException{
        int n = Integer.parseInt(br.readLine());
        Deque<int[]> q = new ArrayDeque<>();

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            q.addLast(new int[]{i+1,Integer.parseInt(st.nextToken())});
        }

        int num = q.removeFirst()[1];
        sb.append("1 ");
        while(!q.isEmpty()){
            if(num > 0){
                for (int i = 0; i < num-1; i++) {
                    q.addLast(q.removeFirst());
                }
            }
            else{
                for (int i = 0; i < num * -1; i++) {
                    q.addFirst(q.removeLast());
                }
            }
            int[] arr = q.removeFirst();
            num = arr[1];
            sb.append(arr[0]).append(" ");
        }

        System.out.println(sb);

    }
}