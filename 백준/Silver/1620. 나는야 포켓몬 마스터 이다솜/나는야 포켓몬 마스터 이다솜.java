import java.io.*;
import java.util.*;

class Main{
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringBuilder sb = new StringBuilder();
    static StringTokenizer st;

    public static void main(String[] args) throws IOException{
        st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        HashMap<String,String> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            String name = br.readLine();
            String number = Integer.toString(i+1);
            map.put(name,number);
            map.put(number,name);
        }

        for(int i=0; i<m; i++) {
            sb.append(map.get(br.readLine()) + "\n");
        }

        System.out.println(sb);
    }
}