import java.io.*;
import java.util.*;

class Main{

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringBuilder sb = new StringBuilder();
    static StringTokenizer st ;

    public static void main(String[] args) throws IOException{
        st = new StringTokenizer(br.readLine());
        String str = st.nextToken();
        int num = Integer.parseInt(st.nextToken());
        int sum = 0;

        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);
            if(Character.isDigit(ch)){
                sum += (int) (Math.pow(num, str.length()-1-i) * (ch-'0'));
            }
            else{
                sum += (int) (Math.pow(num, str.length()-1-i) * (ch-'7'));
            }
        }

        System.out.println(sum);
    }
}