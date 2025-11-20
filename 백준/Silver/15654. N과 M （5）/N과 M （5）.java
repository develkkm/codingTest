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

        arr = new int[n];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        visited = new boolean[n];

        Arrays.sort(arr);

        back(0, "");

        System.out.println(sb);
    }

    private static void back(int depth, String numString){
        if(depth == m){
            sb.append(numString).append("\n");
            return;
        }

        for (int i = 0; i < n; i++) {
            if(!visited[i]) {
                visited[i] = true;
                back(depth + 1, numString + arr[i] + " ");
                visited[i] = false;
            }
        }
    }
}