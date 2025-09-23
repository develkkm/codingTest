import java.io.*;
import java.util.*;

class Main{
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringBuilder sb = new StringBuilder();
    static StringTokenizer st;
    static int cnt = 0;

    public static void main(String[] args) throws IOException{
        int n = Integer.parseInt(br.readLine());
        while(n-->0){
            String str = br.readLine();
            sb.append(isPalindrome(str,0,str.length()-1)).append(" ").append(cnt).append("\n");
            cnt = 0;
        }
        System.out.println(sb);
    }

    static int isPalindrome(String str, int l, int r){
        cnt++;
        if(l>=r) return 1;
        else if(str.charAt(l) != str.charAt(r)) return 0;
        else return isPalindrome(str,l+1,r-1);
    }

}