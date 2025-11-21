import java.io.*;
import java.util.*;

class Main{
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;

    public static void main(String[] args) throws IOException {
        st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        int[] arr = new int[n];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        int[] nums = new int[200001]; // 등장 횟수

        int start = 0;
        int end = 0;
        int max = 0;

        while (end < n) {
            int num = arr[end];
            
            if (nums[num] < k) { 
                nums[num]++;
                max = Math.max(max, end - start + 1);
                end++;
            } else {
                nums[arr[start]]--;
                start++;
            }
        }

        System.out.println(max);
    }
}
