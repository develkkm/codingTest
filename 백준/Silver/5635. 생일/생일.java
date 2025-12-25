import java.io.*;
import java.util.*;

class Main{
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringBuilder sb = new StringBuilder();
    static StringTokenizer st;

    public static void main(String[] args) throws IOException{
        int n = Integer.parseInt(br.readLine());

        String[][] arr = new String[n][4];

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < 4; j++) {
                arr[i][j] = st.nextToken();
            }
        }

        Arrays.sort(arr,Comparator.comparing((String[]o) -> Integer.parseInt(o[3]))
                .thenComparing((String[]o) -> Integer.parseInt(o[2]))
                .thenComparing((String[]o) -> Integer.parseInt(o[1])));

        sb.append(arr[n-1][0]).append("\n").append(arr[0][0]);
        System.out.println(sb);
    }
}