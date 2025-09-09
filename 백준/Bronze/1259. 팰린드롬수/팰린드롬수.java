import java.io.*;
import java.util.*;

class Main{
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringBuilder sb = new StringBuilder();
    static StringTokenizer st;

    public static void main(String[] args) throws IOException {
     while(true){
         String str = br.readLine();
         if(str.equals("0")) break;
         boolean flag = true;

         for (int i = 0; i < str.length()/2; i++) {
            if(str.charAt(i) != str.charAt(str.length()-i-1)){
                flag = false;
                break;
            }
         }

         if(flag)
             sb.append("yes");
         else
             sb.append("no");
         sb.append("\n");
     }

        System.out.println(sb);
    }
}