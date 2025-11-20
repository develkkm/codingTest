import java.util.*;
import java.io.*;

public class Main{

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        ArrayDeque<int[]> queue = new ArrayDeque<>();
        boolean[] visited = new boolean[k+1];

        queue.addLast(new int[] {a,0});

        while(!queue.isEmpty()){
            int[] arr = queue.removeFirst();

            if (arr[0] >= visited.length || visited[arr[0]]) continue;

            visited[arr[0]] = true;

            if(arr[0] == k){
                sb.append(arr[1]);
                break;
            }

            queue.addLast(new int[] {arr[0]+1,arr[1]+1});
            queue.addLast(new int[] {arr[0]*2,arr[1]+1});
        }

        System.out.print(sb);
    }
}