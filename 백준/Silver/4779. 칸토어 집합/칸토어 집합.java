import java.io.*;
import java.util.*;

class Main{
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringBuilder sb;
    static StringTokenizer st;

    public static void main(String[] args) throws IOException{
        String str;
        while((str = br.readLine()) != null){
            int n = Integer.parseInt(str);
            int len = (int) Math.pow(3,n);
            sb = new StringBuilder();
            for (int i = 0; i < len; i++) {
                sb.append("-");
            }

            func(0, len);
            System.out.println(sb);
        }
    }

    private static void func(int idx, int len){
        if(len == 1){
            return;
        }

        int threeLen = len / 3;

        for (int i = idx+threeLen; i < idx + 2 * threeLen; i++) {
            sb.setCharAt(i,' ');
        }

        func(idx,threeLen);
        func(idx + 2 * threeLen, threeLen);
    }
}