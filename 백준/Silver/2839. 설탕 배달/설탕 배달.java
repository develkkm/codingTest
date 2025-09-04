import java.io.*;
import java.util.*;

class Main{
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringBuilder sb = new StringBuilder();
    static StringTokenizer st;
    static int cnt = -1;

    public static void main(String[] args) throws IOException {
        int n = Integer.parseInt(br.readLine());

        bag(n);
        System.out.println(cnt);
    }

    public static void bag(int n){
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                int sum = (3 * i) + (5 * j);
                if(sum > n) break;
                else if(sum == n){
                    cnt = i + j;
                    return;
                }
            }
        }
    }
}