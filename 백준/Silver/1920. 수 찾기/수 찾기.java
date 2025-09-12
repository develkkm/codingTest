import java.util.*;
import java.io.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringBuilder sb = new StringBuilder();
    static StringTokenizer st ;

    public static void main(String[] args) throws IOException {
        int t = Integer.parseInt(br.readLine());
        int[] arr = new int[t];

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < t; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(arr);

        int m = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        while(m-->0){
            if(binarySearch(arr, Integer.parseInt(st.nextToken()))){
                sb.append(1);
            }
            else{
                sb.append(0);
            }
            sb.append("\n");
        }

        System.out.println(sb);
    }

    static boolean binarySearch(int[] arr, int n){
        int lo = 0;
        int hi = arr.length-1;

        while(lo <= hi){
            int mid = lo + (hi - lo) / 2;

            if(n == arr[mid]) return true;
            else if(n > arr[mid]) lo = mid + 1;
            else hi = mid - 1;
        }

        return false;
    }
}