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

        ArrayDeque<long []> dq = new ArrayDeque<>();
        dq.addLast(new long[]{n,0});

        Set<Long> visited = new HashSet<>();
        long cnt = -1;

        while(!dq.isEmpty()){
            long[] arr = dq.removeFirst();
            long num = arr[0];
            long grade = arr[1];

            if(num > m || visited.contains(num)) continue;
            visited.add(num);

            if(num == m){
                cnt = grade+1;
                break;
            }

            dq.addLast(new long[]{num*2,grade+1});
            dq.addLast(new long[]{Long.parseLong(num+"1"),grade+1});
        }

        System.out.println(cnt);
    }
}