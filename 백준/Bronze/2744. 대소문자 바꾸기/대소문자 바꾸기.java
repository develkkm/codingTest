import java.io.*;
import java.util.*;

public class Main{
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringBuilder sb = new StringBuilder();
    static StringTokenizer st;

    public static void main(String[] args) throws IOException{
        //st = new StringTokenizer(br.readLine());
        String str = br.readLine();
        for(int i=0;i<str.length();i++){
            char c = str.charAt(i);
            if(Character.isUpperCase(c)) c=Character.toLowerCase(c);
            else c = Character.toUpperCase(c);
            sb.append(c);
        }
        System.out.println(sb);
    }
}