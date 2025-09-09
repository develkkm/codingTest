import java.io.*;
import java.util.*;

class Main{
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringBuilder sb = new StringBuilder();
    static StringTokenizer st;

    public static void main(String[] args) throws IOException {
        st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        Map<String,Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            map.put(br.readLine(),1);
        }

        for (int i = 0; i < m; i++) {
            String str = br.readLine();
            map.replace(str,2);
        }

        ArrayList<String> list = new ArrayList<>();

        for(Map.Entry<String,Integer> person : map.entrySet()){
            if(person.getValue() >= 2){
                list.add(person.getKey());
            }
        }

        Collections.sort(list);

        sb.append(list.size()).append("\n");
        for(String name : list){
            sb.append(name).append("\n");
        }

        System.out.println(sb);
    }
}