import java.io.*;
import java.util.*;

class Main{
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringBuilder sb = new StringBuilder();
    static StringTokenizer st;
    static ArrayList<Integer> list = new ArrayList<>();

    public static void main(String[] args) throws IOException {
        st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int p = Integer.parseInt(st.nextToken());

        repeat(a,p);
    }

    private static void repeat(int a, int p){
        if(list.contains(a)){
            System.out.println(list.indexOf(a));
            return;
        }
        list.add(a);

        int sum = 0;
        while(a!=0){
            sum += (int) Math.pow(a % 10, p);
            a /= 10;
        }

        repeat(sum, p);
    }
}