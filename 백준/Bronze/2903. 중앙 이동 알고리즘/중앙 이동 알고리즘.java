import java.io.*;
import java.util.*;

class Main{

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringBuilder sb = new StringBuilder();
    static StringTokenizer st ;

    public static void main(String[] args) throws IOException{
        int n = Integer.parseInt(br.readLine());
        int f = 2;
        int idx = 0;
        while(idx < n){
            f += f-1;
            idx++;
        }

        System.out.println((int)Math.pow(f,2));
    }
}