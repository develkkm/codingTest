import java.io.*;
import java.util.*;

class Main{
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringBuilder sb = new StringBuilder();
    static StringTokenizer st;

    public static void main(String[] args) throws IOException {
        int t = Integer.parseInt(br.readLine());
        int[] arr = new int[t];
        int[] mArr = new int[t-1];

        for (int i = 0; i < t; i++) {
            arr[i] = Integer.parseInt(br.readLine());
            if(i > 0){
                mArr[i-1] = arr[i] - arr[i-1];
            }
        }

        for (int i = 0; i < t-2; i++) {
            int gcd = getGCD(mArr[i],mArr[i+1]);
            mArr[i+1] = gcd;
        }

        System.out.println((arr[t-1] - arr[0]) / mArr[t-2] + 1 - t);
    }
    
    public static int getGCD(int n, int m){
        while(m != 0){
            int r = n % m;
            
            n = m;
            m = r;
        }
        return n;
    }
}