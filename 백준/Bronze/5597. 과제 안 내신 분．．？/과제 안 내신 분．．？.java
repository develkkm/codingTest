import java.io.*;
import java.util.*;

public class Main{
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringBuilder sb = new StringBuilder();
    static StringTokenizer st;

    public static void main(String[] args) throws IOException{
        int[] arr = new int[31];
        for(int i=0;i<28;i++){
            int num = Integer.parseInt(br.readLine());
            arr[num] = 1;
        }

        for(int i=1;i<31;i++){
            if(arr[i]==0)
                sb.append(i).append("\n");
        }

        System.out.println(sb);
    }
}