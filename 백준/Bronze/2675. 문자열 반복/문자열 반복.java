import java.io.*;
import java.util.*;

public class Main{
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringBuilder sb = new StringBuilder();
    static StringTokenizer st;

    public static void main(String[] args) throws IOException{
        int t = Integer.parseInt(br.readLine());
        while(t-->0){
            st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            String str = st.nextToken();

            for(int i=0;i<str.length();i++){
                for(int j=0;j<n;j++){
                    sb.append(str.charAt(i));
                }
            }
            sb.append("\n");
        }
        System.out.println(sb);
    }
}