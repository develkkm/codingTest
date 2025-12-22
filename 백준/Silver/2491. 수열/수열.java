import java.io.*;
import java.util.*;

class Main{
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringBuilder sb = new StringBuilder();
    static StringTokenizer st;

    public static void main(String[] args) throws IOException {
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        System.out.println(findLength(arr));
    }

    private static int findLength(int[] arr) {
        int num = arr[0];
        int cnt = 1;
        int len = 1;
        for (int i = 1; i < arr.length; i++) {
            if(arr[i] < num){
                cnt = 1;
            }else{
                cnt++;
                len = Math.max(len,cnt);
            }
            num = arr[i];
        }

        cnt = 1;
        num = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if(arr[i] > num){
                cnt = 1;
            }else{
                cnt++;
                len = Math.max(len,cnt);
            }
            num = arr[i];
        }

        return len;
    }
}