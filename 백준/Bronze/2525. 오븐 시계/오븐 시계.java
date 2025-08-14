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
        int t = Integer.parseInt(br.readLine());

        if((m+t) >= 60){
            h += (m+t) / 60;
            if(h >= 24) h-= 24;
            m = (m+t) % 60;
        }
        else{
            m += t;
        }
        System.out.println(h+" "+ m);
    }
}