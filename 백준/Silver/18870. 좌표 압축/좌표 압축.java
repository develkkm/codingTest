import java.io.*;
import java.util.*;

class Main{
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringBuilder sb = new StringBuilder();
    static StringTokenizer st;

    public static void main(String[] args) throws IOException{
        int n = Integer.parseInt(br.readLine());
        HashMap<Integer,Integer> map = new HashMap<>();
        int[] arr = new int[n];
        int[] arrS = new int[n];

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            int num = Integer.parseInt(st.nextToken());
            arr[i] = num;
            arrS[i] = num;
        }

        Arrays.sort(arrS);

        int rank = 0;
        for (int i = 0; i < n; i++) {
            if(!map.containsKey(arrS[i])) {
                map.put(arrS[i] , rank);
                rank++;
            }
        }

        for (int i = 0; i < n; i++) {
            sb.append(map.get(arr[i])).append(" ");
        }

        System.out.println(sb);
    }
}