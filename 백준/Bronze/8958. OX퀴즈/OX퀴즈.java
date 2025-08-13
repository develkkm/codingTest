import java.io.*;
import java.util.*;

public class Main{
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringBuilder sb = new StringBuilder();
    static StringTokenizer st;

    public static void main(String[] args) throws IOException{
        int t = Integer.parseInt(br.readLine());

        while(t-->0){
            String str = br.readLine();
            int cnt = 0;
            int score = 0;
            for(int i=0;i<str.length();i++){
                if(str.charAt(i) == 'O'){
                    cnt++;
                    score += cnt;
                }
                else{
                    cnt = 0;
                }
            }
            sb.append(score).append("\n");
        }
        System.out.println(sb);
    }
}