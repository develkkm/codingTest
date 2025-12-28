import java.io.*;
import java.util.*;

class Main{
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringBuilder sb = new StringBuilder();
    static StringTokenizer st;

    public static void main(String[] args) throws IOException{
        st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        Deque<int []> dq = new ArrayDeque<>();
        boolean[] visited = new boolean[k+1];
        dq.addLast(new int[]{a,0});
        int result = 0;
        while(true){
            int[] arr = dq.removeFirst();
            int num = arr[0];
            int cnt = arr[1];

            if (arr[0] >= visited.length || visited[arr[0]]) continue;
            visited[num] = true;

            if(num == k) {
                result = cnt;
                break;
            }

            dq.addLast(new int[]{num+1,cnt+1});
            dq.addLast(new int[]{num*2,cnt+1});
        }

        System.out.println(result);
    }
}