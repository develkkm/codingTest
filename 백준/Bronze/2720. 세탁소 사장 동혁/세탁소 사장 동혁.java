import java.io.*;
import java.util.*;

class Main{

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringBuilder sb = new StringBuilder();
    static StringTokenizer st ;

    public static void main(String[] args) throws IOException{
        int t = Integer.parseInt(br.readLine());

        while(t-->0) {
            int m = Integer.parseInt(br.readLine());
            int q = 0;
            int d = 0;
            int n = 0;
            int p = 0;

            while(m>0){
                if(m >= 25){
                    q++;
                    m-=25;
                }
                else if(m>=10){
                    d++;
                    m-=10;
                }
                else if(m>=5){
                    n++;
                    m-=5;
                }
                else{
                    p++;
                    m-=1;
                }
            }
            sb.append(q+" "+d+" "+n+" "+p+"\n");
        }

        System.out.println(sb);
    }
}