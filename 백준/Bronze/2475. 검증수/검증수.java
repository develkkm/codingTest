import java.io.*;
import java.util.*;

public class Main{
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringBuilder sb = new StringBuilder();
    static StringTokenizer st;

    public static void main(String[] args) throws IOException{
        st = new StringTokenizer(br.readLine());
        int sum = 0;
        for(int i=0;i<5;i++){
            int num = Integer.parseInt(st.nextToken());
            sum += (int) Math.pow(num , 2);
        }

        System.out.println(sum % 10);
    }
}