import java.io.*;
import java.util.*;

class Main{
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringBuilder sb = new StringBuilder();
    static StringTokenizer st;

    public static void main(String[] args) throws IOException {
        int t = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        if(t == 1){
            int num = Integer.parseInt(st.nextToken());
            sb.append(num*num);
        }
        else{
            int[] arr = new int[t];
            for (int i = 0; i < t; i++) {
                arr[i] = Integer.parseInt(st.nextToken());
            }

            Arrays.sort(arr);

            sb.append(arr[0] * arr[t-1]);
        }
        System.out.println(sb);
    }
}