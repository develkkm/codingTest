import java.io.*;
import java.util.*;

class Main{

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringBuilder sb = new StringBuilder();
    static StringTokenizer st ;

    public static void main(String[] args) throws IOException{
        int max = Integer.MIN_VALUE;
        int x = 0;
        int y = 0;
        for(int i=0;i<9;i++) {
            st = new StringTokenizer(br.readLine());
            for(int j=0;j<9;j++){
                int n = Integer.parseInt(st.nextToken());
                if(n > max){
                    max = n ;
                    x = i+1;
                    y = j+1;
                }
            }
        }
        sb.append(max).append("\n").append(x).append(" ").append(y);
        System.out.println(sb);
    }
}