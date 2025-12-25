import java.io.*;
import java.util.*;

class Main{
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringBuilder sb = new StringBuilder();
    static StringTokenizer st;
    static char[][] arr;
    static int n,m;
    static int cnt = 0;

    public static void main(String[] args) throws IOException {
        st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        arr = new char[n][m];
        for (int i = 0; i < n; i++) {
            String str = br.readLine();
            for (int j = 0; j < m; j++) {
                arr[i][j] = str.charAt(j);
            }
        }

        String ans = findGene();

        System.out.println(ans);
        System.out.println(cnt);
    }

    private static String findGene() {
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < m; i++) {
            int[] gene = new int[4];
            for (int j = 0; j < n; j++) {
                if(arr[j][i] == 'A') gene[0]++;
                if(arr[j][i] == 'C') gene[1]++;
                if(arr[j][i] == 'G') gene[2]++;
                if(arr[j][i] == 'T') gene[3]++;
            }

            int max = 0;
            int idx = 0;
            for (int j = 0; j < 4; j++) {
                if(gene[j] > max){
                    max = gene[j];
                    idx = j;
                }
            }

            if(idx == 0) result.append('A');
            if(idx == 1) result.append('C');
            if(idx == 2) result.append('G');
            if(idx == 3) result.append('T');

            cnt += n - max;
        }
        return result.toString();
    }
}