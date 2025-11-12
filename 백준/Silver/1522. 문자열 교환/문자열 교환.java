import java.io.*;
import java.util.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringBuilder sb = new StringBuilder();
    static StringTokenizer st;

    public static void main(String[] args) throws IOException {
        String str = br.readLine();
        int aCnt = 0;
        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i) == 'a'){
                aCnt++;
            }
        }

        String str2 = str + str;
        int bCnt = 0;
        for (int i = 0; i < aCnt; i++) {
            if(str.charAt(i) == 'b'){
                bCnt++;
            }
        }

        int min = bCnt;
        for (int i = aCnt; i < str2.length() ; i++) {
            if(str2.charAt(i-aCnt) == 'b'){
                bCnt--;
            }

            if(str2.charAt(i) == 'b'){
                bCnt++;
            }

            min = Math.min(min,bCnt);
        }

        System.out.println(min);
    }
}
