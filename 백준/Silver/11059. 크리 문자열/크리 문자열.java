import java.io.*;
import java.util.*;

class Main{
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringBuilder sb = new StringBuilder();
    static StringTokenizer st;

    public static void main(String[] args) throws IOException{
        String str = br.readLine();

        int[] ps = new int[str.length()+1];

        for(int i=0;i<str.length();i++){
            ps[i+1] = ps[i] + (str.charAt(i)-'0');
        }

        int result = 0;
        for (int i = 2; i <= str.length(); i+=2) {
            for (int j = 0; j+i <= str.length() ; j++) {
                int mid = j + i / 2;
                int end = j + i;

                int sum1 = ps[mid] - ps[j];
                int sum2 = ps[end] - ps[mid];

                if(sum1 == sum2)
                    result = i;

            }
        }

        System.out.println(result);
    }
}