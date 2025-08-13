import java.io.*;
import java.util.*;

public class Main{
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringBuilder sb = new StringBuilder();
    static StringTokenizer st;

    public static void main(String[] args) throws IOException{
        Set<Integer> set = new HashSet<>();
        for(int i=0;i<10;i++){
            int num = Integer.parseInt(br.readLine());
            set.add(num%42);
        }
        System.out.println(set.size());
    }
}