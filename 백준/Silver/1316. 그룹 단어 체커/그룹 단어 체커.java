import java.io.*;
import java.util.*;

class Main{
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringBuilder sb = new StringBuilder();
    static StringTokenizer st;

    public static void main(String[] args) throws IOException {
        int t = Integer.parseInt(br.readLine());
        int cnt = t;
        while(t-->0){
            int[] arr = new int[26];
            String str = br.readLine();
            char prev = str.charAt(0);
            for(int i=0;i<str.length();i++){
                if(prev != str.charAt(i) && arr[str.charAt(i)-'a']!=0) {
                    cnt--;
                    break;
                }
                else{
                    arr[str.charAt(i)-'a']++;
                    prev = str.charAt(i);
                }
            }
        }
        System.out.println(cnt);
    }
}