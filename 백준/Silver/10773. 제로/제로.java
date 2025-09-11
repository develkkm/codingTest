import java.io.*;
import java.util.*;

class Main{
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringBuilder sb = new StringBuilder();
    static StringTokenizer st;

    public static void main(String[] args) throws IOException{
        int t = Integer.parseInt(br.readLine());
        Deque<Integer> q = new ArrayDeque<>();
        while(t-->0){
            int n = Integer.parseInt(br.readLine());
            if(n==0) q.removeLast();
            else q.addLast(n);
        }

        int sum=0;
        for (Integer i : q) {
            sum+=i;
        }

        System.out.println(sum);
    }
}