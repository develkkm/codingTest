import java.io.*;
import java.util.*;

class Main{
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringBuilder sb = new StringBuilder();
    static StringTokenizer st;

    public static void main(String[] args) throws IOException{
        Map<String,Integer> map = new HashMap<>();
        st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        while(n-->0){
            String str = br.readLine();
            if(str.length() < m) continue;

            map.put(str,map.getOrDefault(str,0)+1);
        }

        List<String> list = new ArrayList<>(map.keySet());

        list.sort(
                Comparator.comparing((String w) -> map.get(w)).reversed()
                        .thenComparing(Comparator.comparingInt(String::length).reversed())
                        .thenComparing(Comparator.naturalOrder())
        );

        list.forEach((String str) -> sb.append(str).append("\n"));
        System.out.println(sb);
    }
}