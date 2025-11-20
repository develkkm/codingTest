import java.io.*;
import java.util.*;

class Main{
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringBuilder sb = new StringBuilder();
    static StringTokenizer st;

    static int n;
    static int k;
    static int[] arr;
    static boolean[] visited;
    static Set<String> set = new HashSet<>();

    public static void main(String[] args) throws IOException {
        n = Integer.parseInt(br.readLine());
        k = Integer.parseInt(br.readLine());

        arr = new int[n];
        visited = new boolean[n];
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }
        int depth = 0;
        String numStr = "";
        dfs(depth,numStr);

        System.out.println(set.size());
    }

    private static void dfs(int depth, String num){
        if(depth == k){
            set.add(num);
            return;
        }

        for (int i = 0; i < n; i++) {
            if(!visited[i]){
                visited[i] = true;
                dfs(depth+1,num+arr[i]);
                visited[i] = false;
            }
        }

    }
}