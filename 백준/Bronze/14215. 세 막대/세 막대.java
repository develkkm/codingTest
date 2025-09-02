import java.io.*;
import java.util.*;

class Main{
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringBuilder sb = new StringBuilder();
    static StringTokenizer st;

    public static void main(String[] args) throws IOException{
        st = new StringTokenizer(br.readLine());
        int max = 0;
        int sum = 0;

        int l1 = Integer.parseInt(st.nextToken());
        int l2 = Integer.parseInt(st.nextToken());
        int l3 = Integer.parseInt(st.nextToken());

        max = Math.max(l3,Math.max(l1,l2));
        sum = l1 + l2 + l3;

        if(max >= sum - max){
            sum -= max - (sum - max - 1);
        }

        System.out.println(sum);
    }
}