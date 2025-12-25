import java.io.*;
import java.util.*;

class Main{
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringBuilder sb = new StringBuilder();
    static StringTokenizer st;

    public static void main(String[] args) throws IOException {
        String str = br.readLine();

        StringBuilder ans = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if(ch == '<'){
                ans.append(sb.reverse());
                sb.delete(0,sb.length());
                while(str.charAt(i) != '>'){
                    ans.append(str.charAt(i));
                    i++;
                }
                ans.append(str.charAt(i));
            }else if(ch == ' '){
                ans.append(sb.reverse());
                sb.delete(0,sb.length());
                ans.append(ch);
            }else{
                sb.append(ch);
            }
        }

        if(sb.length() > 0) ans.append(sb.reverse());

        System.out.println(ans);
    }
}