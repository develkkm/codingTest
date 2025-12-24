import java.io.*;
import java.util.*;

class Main{
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringBuilder sb = new StringBuilder();
    static StringTokenizer st;

    public static void main(String[] args) throws IOException{
        st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        int[][] arr = new int[n][4];
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < 4; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        Arrays.sort(arr,
                Comparator.comparingInt((int[] o) -> o[1]).reversed()
                        .thenComparing(Comparator.comparingInt((int[] o) -> o[2]).reversed())
                        .thenComparing(Comparator.comparingInt((int[] o) -> o[3]).reversed())
        );

        int idx = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i][0] == k) {
                idx = i;
                break;
            }
        }

        int grade = 1;
        for (int i = 0; i < n; i++) {
            if (arr[i][1] > arr[idx][1]) grade++;
            else if (arr[i][1] == arr[idx][1] && arr[i][2] > arr[idx][2]) grade++;
            else if (arr[i][1] == arr[idx][1] && arr[i][2] == arr[idx][2] && arr[i][3] > arr[idx][3]) grade++;
        }

        System.out.println(grade);
    }
}