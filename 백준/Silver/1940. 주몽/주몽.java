import java.io.*;
import java.util.*;

public class Main{
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringBuilder sb = new StringBuilder();
    static StringTokenizer st;

    public static void main(String[] args) throws IOException{
        int n = Integer.parseInt(br.readLine());
        int m = Integer.parseInt(br.readLine());
        ArrayList<Integer> list = new ArrayList<>();
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            list.add(Integer.parseInt(st.nextToken()));
        }

        Collections.sort(list);

        int start = 0;
        int end = n-1;
        int cnt = 0;

        while(start < end){
            int sum = list.get(start) + list.get(end);
            if(sum > m){
                end--;
            } else if(sum < m){
                start++;
            } else{
               cnt++;
               start++;
            }
        }
        System.out.println(cnt);
    }
}