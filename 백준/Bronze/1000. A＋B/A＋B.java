import java.io.*;
import java.util.*;

public class Main{
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringBuilder sb = new StringBuilder();
    static StringTokenizer st;

    public static void main(String[] args) throws IOException{
        String str = br.readLine();
        st = new StringTokenizer(str);
        int sum = 0;

        for(int i=0;i<2;i++){
            sum+=Integer.parseInt(st.nextToken());
        }

        System.out.println(sum);
    }
}