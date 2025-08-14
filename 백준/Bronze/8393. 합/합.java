import java.io.*;
import java.util.*;

public class Main{
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringBuilder sb = new StringBuilder();
    static StringTokenizer st;

    public static void main(String[] args) throws IOException{
        //st = new StringTokenizer(br.readLine());
        int x = Integer.parseInt(br.readLine());
        int sum = 0;
        while(x-->0){
            sum += x+1;
        }
        System.out.println(sum);
    }
}