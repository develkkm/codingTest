import java.io.*;
import java.util.*;

class Main{
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringBuilder sb = new StringBuilder();
    static StringTokenizer st;

    public static void main(String[] args) throws IOException{
        int n = Integer.parseInt(br.readLine());
        System.out.println(fact(n));
    }

    static long fact(int n){
        if(n == 0) return 1;

        return n * fact(n-1);
    }
}