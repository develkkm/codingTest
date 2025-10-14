import java.io.*;
import java.util.*;

class Main{
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringBuilder sb = new StringBuilder();
    static StringTokenizer st;

    public static void main(String[] args) throws IOException{
        int n = Integer.parseInt(br.readLine());
        int[] a = new int[n];
        int[] b = new int[n];

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            int num = Integer.parseInt(st.nextToken());
            a[i] = num;
            b[i] = num;
        }

        Arrays.sort(b);

        for (int i = 0; i < n; i++) {
            int aNum = a[i];
            for (int j = 0; j < n; j++) {
                if(b[j] == aNum){
                    b[j] = -1;
                    sb.append(j).append(" ");
                    break;
                }
            }
        }

        System.out.println(sb);

    }
}