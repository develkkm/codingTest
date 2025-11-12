import java.io.*;
import java.util.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringBuilder sb = new StringBuilder();
    static StringTokenizer st;
    static String str;

    public static void main(String[] args) throws IOException {
        while((str=br.readLine())!=null){
            st = new StringTokenizer(str);
            String s = st.nextToken();
            String t = st.nextToken();

            int sIdx = 0;

            for (int i = 0; i < t.length(); i++) {
                if(t.charAt(i) == s.charAt(sIdx)){
                    sIdx++;
                }
                if(sIdx == s.length()) break;
            }

            if(sIdx == s.length()){
                System.out.println("Yes");
            }else{
                System.out.println("No");
            }
        }
    }
}
