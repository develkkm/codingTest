import java.io.*;
import java.util.*;

public class Main{
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringBuilder sb = new StringBuilder();
    static StringTokenizer st;

    public static void main(String[] args) throws IOException{
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        int s = 0;
        int e = 0;
        int cnt = 4;
        int min = 4;

        Arrays.sort(arr);

        while(true){

            int num = arr[e] - arr[s];
            if(num < 4){
                min = Math.min(min, cnt - (e-s));
                e++;
            } else if (num == 4){
                min = Math.min(min, cnt - (e-s));
                s++;
            }else{
                s++;
            }

            if(e == n) break;
        }

        System.out.println(min);
    }
}