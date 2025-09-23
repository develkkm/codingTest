import java.io.*;
import java.util.*;

class Main{
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringBuilder sb = new StringBuilder();
    static StringTokenizer st;

    public static void main(String[] args) throws IOException{
        int n = Integer.parseInt(br.readLine());
        System.out.println(Fibo(n));
    }

    static int Fibo(int n){
        if(n == 0) return 0;
        if(n == 1) return 1;

        return Fibo(n-1) + Fibo(n-2);
    }

}