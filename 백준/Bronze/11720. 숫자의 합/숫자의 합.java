import java.io.*;
import java.util.*;

public class Main{
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringBuilder sb = new StringBuilder();
    static StringTokenizer st;

    public static void main(String[] args) throws IOException{
        int t = Integer.parseInt(br.readLine());
        String str = br.readLine();
        int sum = 0;

        for(int i=0;i<t;i++){
            sum += str.charAt(i)-'0';
        }
        System.out.println(sum);
    }
}