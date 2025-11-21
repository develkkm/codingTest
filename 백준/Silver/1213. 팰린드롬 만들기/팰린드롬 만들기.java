import java.io.*;
import java.util.*;

class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringBuilder sb = new StringBuilder();
    static StringTokenizer st;

    public static void main(String[] args) throws IOException {
        String str = br.readLine();
        int len = str.length();
        int[]arr = new int[26];

        for (int i = 0; i < len; i++) {
            arr[str.charAt(i)-'A']++;
        }

        boolean flag = true;
        if(len % 2 == 0){
            for (int i = 0; i < 26; i++) {
                if(arr[i] % 2 ==1) {
                    flag = false;
                    break;
                }
            }
        }else{
            int cnt = 0;
            for (int i = 0; i < 26; i++) {
                if(arr[i] % 2 ==1)cnt++;
                if(cnt == 2) {
                    flag = false;
                    break;
                }
            }
        }

        if(flag){
            for (int i = 0; i < 26; i++) {
                int num = arr[i] / 2;
                char ch = (char)(i+65);
                for (int j = 0; j < num; j++) {
                    sb.append(ch);
                }
            }
            String middle = "";
            String str1 = sb.toString();
            String str2 = sb.reverse().toString();
            for (int i = 0; i < 26; i++) {
                if(arr[i] % 2 == 1)
                    middle+= (char)(i+65);
            }

            System.out.println(str1+middle+str2);
        }else{
            System.out.println("I'm Sorry Hansoo");
        }
    }
}
