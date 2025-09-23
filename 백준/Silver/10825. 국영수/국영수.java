import java.io.*;
import java.util.*;

class Main{
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringBuilder sb = new StringBuilder();
    static StringTokenizer st;

    public static void main(String[] args) throws IOException{
        int t = Integer.parseInt(br.readLine());
        Map<String,int[]> map = new HashMap<>();

        for (int i = 0; i < t; i++) {
            st = new StringTokenizer(br.readLine());
            String name = st.nextToken();
            int[] arr = new int[3];
            for (int j = 0; j < 3; j++) {
                arr[j] = Integer.parseInt(st.nextToken());
            }

            map.put(name,arr);
        }

        ArrayList<String> list = new ArrayList<>(map.keySet());

        list.sort(Comparator.comparing((String s) -> map.get(s)[0]).reversed()
                .thenComparing((String s) -> map.get(s)[1])
                .thenComparing(Comparator.comparing((String s) -> map.get(s)[2]).reversed())
                .thenComparing(Comparator.naturalOrder()));

        for (String s : list) {
            sb.append(s).append("\n");
        }

        System.out.println(sb);
    }
}