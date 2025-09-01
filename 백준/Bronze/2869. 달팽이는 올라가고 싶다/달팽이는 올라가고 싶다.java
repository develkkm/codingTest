import java.io.*;
import java.util.*;

class Main{
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringBuilder sb = new StringBuilder();
    static StringTokenizer st;

    public static void main(String[] args) throws IOException{
        st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int v = Integer.parseInt(st.nextToken());
        int result = 0;

        if(a >= v) result = 1;
        else{
            int last = v - a;
            int day = a - b;

            if(last % day == 0){
                result = last / day;
            }
            else{
                result = last / day + 1;
            }
            result++;
        }
        
        System.out.println(result);
    }
}