import java.io.*;
import java.util.*;

class Main{
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringBuilder sb = new StringBuilder();
    static StringTokenizer st;

    static int n;
    static int m;
    static int[] arr;
    static boolean[] visited;

    public static void main(String[] args) throws IOException {
        st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        arr = new int[n+1];
        for (int i = 0; i < n+1; i++) {
            arr[i] = i;
        }
        visited = new boolean[n+1];

        back(0, "");

        System.out.println(sb);
    }

    private static void back(int depth, String numString){
        if(depth == m){
            sb.append(numString).append("\n");
            return;
        }

        for (int i = 1; i < n+1; i++) {
            if(!visited[i]){
                visited[i] = true;
                back(depth+1,numString+i+" ");
                visited[i] = false;
            }
        }
    }
}