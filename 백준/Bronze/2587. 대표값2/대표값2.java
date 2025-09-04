import java.io.*;
import java.util.*;

class Main{
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringBuilder sb = new StringBuilder();
    static StringTokenizer st;

    public static void main(String[] args) throws IOException {
        ArrayList<Integer> list = new ArrayList<>();
        int sum = 0;
        for(int i=0;i<5;i++){
            int n = Integer.parseInt(br.readLine());
            sum+=n;
            list.add(n);
        }

        Collections.sort(list);

        sb.append(sum/5).append("\n").append(list.get(2));
        System.out.println(sb);
    }
}