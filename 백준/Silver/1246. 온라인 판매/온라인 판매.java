import java.io.*;
import java.util.*;

class Main{
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringBuilder sb = new StringBuilder();
    static StringTokenizer st;

    public static void main(String[] args) throws IOException {
        st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        int[] arr = new int[m];
        for (int i = 0; i < m; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        Arrays.sort(arr);
        
        int maxPrice = 0;
        int totalAmount = 0;
        for (int i = 0; i < m; i++) {
            int price = arr[i];
            int totalPrice = arr[i] * (Math.min((m - i),n));

            if(totalPrice > totalAmount){
                maxPrice = price;
                totalAmount = totalPrice;
            }
        }

        sb.append(maxPrice).append(" ").append(totalAmount);
        System.out.println(sb);
    }
}
