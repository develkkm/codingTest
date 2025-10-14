import java.io.*;
import java.util.*;

class Main{
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringBuilder sb = new StringBuilder();
    static StringTokenizer st;

    public static void main(String[] args) throws IOException{
        int l = Integer.parseInt(br.readLine());
        int[] arr = new int[l];

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < l; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        int n = Integer.parseInt(br.readLine());

        Arrays.sort(arr);

        int a = 0;      
        int b = 1001;   
        for (int x : arr) {
            if (x < n) a = x;
            else { b = x; break; }
        }

        int ans = (n - a) * (b - n) - 1;
        if(b == n) ans = 0;
        System.out.println(ans);
    }
}