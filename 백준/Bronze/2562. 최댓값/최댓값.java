import java.io.*;
import java.util.*;

public class Main{
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringBuilder sb = new StringBuilder();
    static StringTokenizer st;

    public static void main(String[] args) throws IOException{
        int max = Integer.MIN_VALUE;
        int idx = 0;

        for(int i=0;i<9;i++){
            int num = Integer.parseInt(br.readLine());
            if(num > max){
                max = num;
                idx = i;
            }
        }
        sb.append(max).append("\n").append(idx+1);
        System.out.println(sb);
    }
}