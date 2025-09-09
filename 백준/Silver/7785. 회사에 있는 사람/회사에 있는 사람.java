import java.io.*;
import java.util.*;

class Main{
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringBuilder sb = new StringBuilder();
    static StringTokenizer st;

    public static void main(String[] args) throws IOException{
        int t = Integer.parseInt(br.readLine());
        Map<String,Integer> map = new TreeMap<>(Comparator.reverseOrder());

        for (int i = 0; i < t; i++) {
            st = new StringTokenizer(br.readLine());
            String name = st.nextToken();
            String status = st.nextToken();
            if(status.equals("enter"))
                map.put(name,1);
            else
                map.remove(name);
        }

        ArrayList<String> list = new ArrayList<>(map.keySet());
        list.sort(Comparator.reverseOrder());


        for (int i = 0; i < list.size(); i++) {
            sb.append(list.get(i)).append("\n");
        }

        System.out.println(sb);
    }
}