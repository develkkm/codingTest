import java.io.*;
import java.util.*;

class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringBuilder sb = new StringBuilder();
    static StringTokenizer st;

    public static void main(String[] args) throws IOException {
        st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        HashMap<String,ArrayList<String>> map = new HashMap<>();

        for (int i = 0; i < n; i++) {
            String name = br.readLine();
            int num = Integer.parseInt(br.readLine());
            ArrayList<String> list = new ArrayList<>();
            for (int j = 0; j < num; j++) {
                list.add(br.readLine());
            }

            list.sort(Comparator.naturalOrder());
            map.put(name,list);
        }

        for (int i = 0; i < m; i++) {
            String name = br.readLine();
            int num = Integer.parseInt(br.readLine());
            if(num == 1){
                for (String group : map.keySet()){
                    if(map.get(group).contains(name)){
                        sb.append(group).append("\n");
                        break;
                    }
                }
            }else{
                for(String member : map.get(name)){
                    sb.append(member).append("\n");
                }
            }
        }

        System.out.println(sb);
    }
}
