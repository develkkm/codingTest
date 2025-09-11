import java.io.*;
import java.util.*;

class Main{
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringBuilder sb = new StringBuilder();
    static StringTokenizer st;

    public static void main(String[] args) throws IOException{
        int t = Integer.parseInt(br.readLine());
        Deque<Integer> q = new ArrayDeque<>();
        for (int i = 1; i <=t ; i++) {
            q.addLast(i);
        }

        while(q.size()>1){
            q.removeFirst();
            q.addLast(q.removeFirst());
        }

        System.out.println(q.getFirst());
    }
}