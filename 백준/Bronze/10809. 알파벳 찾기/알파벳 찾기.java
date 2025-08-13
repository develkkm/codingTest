import java.io.*;
import java.util.*;

public class Main{
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringBuilder sb = new StringBuilder();
    static StringTokenizer st;

    public static void main(String[] args) throws IOException{
        int[] arr = new int[26];
        String str = br.readLine();

        for(int i=0;i<26;i++)
            arr[i] = -1;

        for(int i=0;i<str.length();i++){
            if(arr[(int)str.charAt(i)-'a'] == -1){
                arr[(int)str.charAt(i)-'a'] = i;
            };
        }

        for(int i : arr)
            sb.append(i).append(" ");
        System.out.println(sb);
    }
}