import java.io.*;
import java.util.*;

class Main{
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringBuilder sb = new StringBuilder();
    static StringTokenizer st;

    public static void main(String[] args) throws IOException {
        int n = Integer.parseInt(br.readLine());

        int[][] arr = new int[n][3];
        Map<Integer,Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            arr[i][0] = Integer.parseInt(st.nextToken());
            arr[i][1] = Integer.parseInt(st.nextToken());
            arr[i][2] = Integer.parseInt(st.nextToken());

            map.put(arr[i][0],0);
        }

        Arrays.sort(arr,Comparator.comparing((int[]o) -> o[2]).reversed());

        int cnt = 0;
        int idx = 0;
        while(cnt!=3){
            if(map.get(arr[idx][0]) < 2) {
                sb.append(arr[idx][0]).append(" ").append(arr[idx][1]).append("\n");
                cnt++;
                map.put(arr[idx][0],map.get(arr[idx][0])+1);
            }
            idx++;
        }

        System.out.println(sb);
    }
}
