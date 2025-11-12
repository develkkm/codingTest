import java.io.*;
import java.util.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringBuilder sb = new StringBuilder();
    static StringTokenizer st;

    public static void main(String[] args) throws IOException {
        long l = Long.parseLong(br.readLine());

        long num = 1;
        int cnt = 0;
        while(true){
            if(l >= num){
                l -= num++;
                cnt++;
            }else{
                break;
            }
        }

        System.out.println(cnt);
    }
}
