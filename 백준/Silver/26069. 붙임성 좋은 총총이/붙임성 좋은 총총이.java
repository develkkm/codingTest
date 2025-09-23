import java.io.*;
import java.util.*;

class Main{
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringBuilder sb = new StringBuilder();
    static StringTokenizer st;

    public static void main(String[] args) throws IOException{
        Set<String> set = new HashSet<>();
        int t = Integer.parseInt(br.readLine());
        set.add("ChongChong");

        while(t-->0){
            st = new StringTokenizer(br.readLine());
            String name1 = st.nextToken();
            String name2 = st.nextToken();

            if(set.contains(name1) || set.contains(name2)){
                set.add(name1);
                set.add(name2);
            }
        }

        System.out.println(set.size());
    }
}