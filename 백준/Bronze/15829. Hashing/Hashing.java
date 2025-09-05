import java.io.*;
import java.util.*;

class Main{
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringBuilder sb = new StringBuilder();
    static StringTokenizer st;

    public static void main(String[] args) throws IOException{
        int n = Integer.parseInt(br.readLine());
        String str = br.readLine();
        int[] arr = new int[n];
        long result = 0;

        for (int i = 0; i < n; i++) {
            arr[i] = str.charAt(i) - 'a' + 1;
        }

        for (int i = 0; i < n; i++) {
            result += (long)(Math.pow(31,i) * arr[i]);
        }

        System.out.println(result);
    }
}