import java.io.*;
import java.util.*;

class Main{
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringBuilder sb = new StringBuilder();
    static StringTokenizer st;

    public static void main(String[] args) throws IOException {
        boolean[] arr = new boolean[10001];

        for (int i = 1; i < 10001; i++) {
            int num = madeNum(i);
            if(num < 10001) arr[num] = true;
        }

        for (int i = 1; i < 10001; i++) {
            if(!arr[i]) sb.append(i).append("\n");
        }

        System.out.println(sb);
    }

    private static int madeNum(int n) {
        int result = n;
        while(n!=0){
            result += n % 10;
            n /= 10;
        }
        return result;
    }


}