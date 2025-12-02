import java.io.*;
import java.util.*;

class Main{
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringBuilder sb = new StringBuilder();
    static StringTokenizer st;

    public static void main(String[] args) throws IOException{
        String str = br.readLine();
        st = new StringTokenizer(str,"-");

        int sum = Integer.MAX_VALUE;

        while(st.hasMoreTokens()){
            int tmp = 0;

            StringTokenizer pst = new StringTokenizer(st.nextToken(),"+");

            while(pst.hasMoreTokens()){
                tmp += Integer.parseInt(pst.nextToken());
            }

            if(sum == Integer.MAX_VALUE)
                sum = tmp;
            else
                sum -= tmp;
        }

        System.out.println(sum);
    }
}