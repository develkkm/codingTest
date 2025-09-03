import java.io.*;
import java.util.*;

class Main{
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringBuilder sb = new StringBuilder();
    static StringTokenizer st;

    public static void main(String[] args) throws IOException{
        int n = Integer.parseInt(br.readLine());
        int result = 0;

            for(int i=n/2;i<n;i++){
                String str = Integer.toString(i);
                int sum = 0;
                for(int j=0;j<str.length();j++){
                    sum+=str.charAt(j)-'0';
                }
                if(i+sum == n){
                    result = i;
                    break;
                }
            }


        System.out.println(result);
    }
}