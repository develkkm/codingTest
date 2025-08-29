import java.io.*;
import java.util.*;

class Main{
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringBuilder sb = new StringBuilder();
    static StringTokenizer st;

    public static void main(String[] args) throws IOException {
        String str = br.readLine().toLowerCase();
        int[] arr = new int[26];
        int max = Integer.MIN_VALUE;
        int idx = 0;
        boolean dup = false;
        for(int i=0;i<str.length();i++){
            arr[str.charAt(i)-'a'] ++;
        }

        for(int i=0;i<26;i++){
            if(arr[i] > max){
                max = arr[i];
                idx = i;
                dup = false;
            }
            else if(arr[i] == max) dup = true;
        }

        if(dup)
            System.out.println("?");
        else{
            System.out.println((char)(idx+'A'));
        }
    }
}