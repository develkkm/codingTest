import java.io.*;
import java.util.*;

public class Main{
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringBuilder sb = new StringBuilder();
    static StringTokenizer st;

    public static void main(String[] args) throws IOException{
        int n = Integer.parseInt(br.readLine());
        int cnt = 0;

        int start = 1;
        int end = 1;
        int sum = 1;

        while(start <= end){
            if(sum == n) cnt++;
            if(sum < n){
                end++;
                sum+=end;
            }
            else if(sum >= n){
                sum -= start;
                start++;
            }
        }

        System.out.println(cnt);
    }
}