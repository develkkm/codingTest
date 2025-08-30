import java.io.*;
import java.util.*;

class Main{

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringBuilder sb = new StringBuilder();
    static StringTokenizer st ;

    public static void main(String[] args) throws IOException{
        st = new StringTokenizer(br.readLine());
        int num = Integer.parseInt(st.nextToken());
        int n = Integer.parseInt(st.nextToken());

        while(num>0){
            if(num % n >= 10){
                sb.append((char)(num % n + 55));
            }
            else{
                sb.append(num % n);
            }
            num /= n;
        }

        sb.reverse();
        System.out.println(sb);
    }
}