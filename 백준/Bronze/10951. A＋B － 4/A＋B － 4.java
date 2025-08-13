import java.io.*;
import java.util.*;

public class Main{
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringBuilder sb = new StringBuilder();
    static StringTokenizer st;

    public static void main(String[] args) throws IOException{
        //int n = Integer.parseInt(br.readLine());
        String str = "";
        while((str = br.readLine()) != null){
            st = new StringTokenizer(str);
            System.out.println(Integer.parseInt(st.nextToken()) + Integer.parseInt(st.nextToken()));
        }
        //System.out.println(sb);
    }
}