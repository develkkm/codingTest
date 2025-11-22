import java.io.*;
import java.util.*;

class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringBuilder sb = new StringBuilder();
    static StringTokenizer st;

    public static void main(String[] args) throws IOException {
        int n = Integer.parseInt(br.readLine());
        HashMap<String,Integer> map = new HashMap<>();

        for (int i = 0; i < n; i++) {
            String str = br.readLine();
            String[] arr = str.split("\\.");
            map.put(arr[1],map.getOrDefault(arr[1],0)+1);
        }

        List<Map.Entry<String,Integer>> list = new ArrayList<>(map.entrySet());

        list.sort(Map.Entry.comparingByKey());

        StringBuilder sb = new StringBuilder();
        for (Map.Entry<String, Integer> e : list) {
            sb.append(e.getKey()).append(" ").append(e.getValue()).append("\n");
        }
        System.out.print(sb);
    }
}
