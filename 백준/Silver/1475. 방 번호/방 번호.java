import java.io.*;
import java.util.*;

class Main{
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringBuilder sb = new StringBuilder();
    static StringTokenizer st;

    public static void main(String[] args) throws IOException{
        String str = br.readLine();

        int[] arr = new int[10];

        for (int i = 0; i < str.length(); i++) {
            arr[str.charAt(i)-'0']++;
        }

        int max = -1;

        for (int i = 0; i < 10; i++) {
            if(i != 6 && i != 9)
                max = Math.max(max,arr[i]);
        }

        int sn = arr[6] + arr[9];
        if(sn % 2 == 0){
            max = Math.max(max,sn/2);
        }else{
            max = Math.max(max, sn/2 + 1);
        }

        System.out.println(max);
    }
}