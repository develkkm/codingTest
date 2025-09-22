import java.io.*;
import java.util.*;

class Main{
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringBuilder sb = new StringBuilder();
    static StringTokenizer st;

    public static void main(String[] args) throws IOException {
        String str = br.readLine();
        int sum = 0;
        int p = 0;

        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i) == '*') {
                p = i;
                continue;
            }

            if(i % 2 == 0) sum += str.charAt(i) - '0';
            else sum += 3 * (str.charAt(i) - '0');
        }

        int ans = 0;
        while(true){
            if(p % 2 == 0){
                if((sum + ans) % 10 == 0) break;
            }
            else{
                if((sum + 3 * ans) % 10 == 0) break;
            }
            ans++;
        }

        System.out.println(ans);
    }

}