import java.io.*;
import java.util.*;

public class Main{
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringBuilder sb = new StringBuilder();
    static StringTokenizer st;

    public static void main(String[] args) throws IOException{
        int x = Integer.parseInt(br.readLine());
        int y = Integer.parseInt(br.readLine());

        if(x>0){
            if(y>0) sb.append(1);
            else sb.append(4);
        }
        else{
            if(y>0) sb.append(2);
            else sb.append(3);
        }

        System.out.println(sb);

    }
}