import java.io.*;
import java.util.*;

public class Main{
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringBuilder sb = new StringBuilder();
    static StringTokenizer st;

    public static void main(String[] args) throws IOException{
        st = new StringTokenizer(br.readLine());
        int h = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        if(m >= 45){
            m -= 45;
        }
        else{
            m = m - 45 + 60;
            if(h!=0) h-=1;
            else h=23;
        }
        System.out.println(h+" "+m);
    }
}