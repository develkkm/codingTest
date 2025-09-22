import java.io.*;
import java.util.*;

class Main{
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringBuilder sb = new StringBuilder();
    static StringTokenizer st;

    public static void main(String[] args) throws IOException {
        int t = Integer.parseInt(br.readLine());
        int[] arr = new int[t];
        double sum = 0;
        int[] dup = new int[8001];

        for (int i = 0; i < t; i++) {
            int num = Integer.parseInt(br.readLine());
            arr[i] = num;
            sum+=num;
            dup[num + 4000]++;
        }

        Arrays.sort(arr);

        int max = 0;
        int result = 0;
        int cnt = 1;
        for (int i = 0; i < 8001; i++) {
            if(max < dup[i]){
                cnt = 1;
                max = dup[i];
                result = (i - 4000);
            }
            else if(max == dup[i]){
                cnt++;
                if(cnt == 2)
                    result = i-4000;
            }
        }

        sb.append(Math.round(sum / t)).append("\n");
        sb.append(arr[t/2]).append("\n");
        sb.append(result).append("\n");
        sb.append(arr[t-1] - arr[0]).append("\n");

        System.out.println(sb);
    }
}