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
    static ArrayList<Integer> list = new ArrayList<>();

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

        back(0,0);

        list.sort(Comparator.naturalOrder());
        for(int num : list){
            sb.append(num).append(" ");
        }
        
        if(list.isEmpty()){
            System.out.println(-1);
        }else{
            System.out.println(sb);
        }
    }

    private static void back(int depth, int num){
        if(depth == m){
            if(isPrime(num) && !list.contains(num))
                list.add(num);
            return;
        }

        for (int i = 0; i < n; i++) {
            if(!visited[i]) {
                visited[i] = true;
                back(depth + 1, num + arr[i]);
                visited[i] = false;
            }
        }
    }

    private static boolean isPrime(int num){
        boolean flag = true;

        for (int i = 2; i < num/2; i++) {
            if(num % i == 0) {
                flag = false;
                break;
            }
        }

        return flag;
    }
}
