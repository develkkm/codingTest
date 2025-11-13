import java.io.*;
import java.util.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringBuilder sb = new StringBuilder();
    static StringTokenizer st;
    static String str;

    public static void main(String[] args) throws IOException {
        int n = Integer.parseInt(br.readLine());

        int div = n / 9;
        int mod = n % 9;

        int ans = 0;

        ans = div;

        if(div % 2 ==0) {
            if (mod > 0)
                ans = div + 1;
        } else {
            if(mod % 2 == 0 && mod != 0){
                ans = div + 2;
            }else if(mod % 2 != 0){
                ans = div + 1;
            }
        }

        System.out.println(ans);
    }
}
