import java.io.*;
import java.util.*;

class Main{
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringBuilder sb = new StringBuilder();
    static StringTokenizer st;
    static LinkedList<Integer> dq = new LinkedList<>();
    static int[] arr;
    static int cnt = 0;

    public static void main(String[] args) throws IOException{
        st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        for (int i = 1; i <= n ; i++) {
            dq.add(i);
        }

        st = new StringTokenizer(br.readLine());
        arr = new int[m];
        for (int i = 0; i < m; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        roundQ();

        System.out.println(cnt);
    }

    private static void roundQ() {
        for (int i = 0; i < arr.length; i++) {
            int middle;
            int targetIdx = dq.indexOf(arr[i]);

            if(dq.size() % 2 == 0){
                middle = dq.size() / 2 - 1;
            }
            else{
                middle = dq.size() / 2;
            }

            if(targetIdx <= middle){
                for (int j = 0; j < targetIdx; j++) {
                    dq.offerLast(dq.pollFirst());
                    cnt++;
                }
            }else{
                for (int j = 0; j < dq.size() - targetIdx; j++) {
                    dq.offerFirst(dq.pollLast());
                    cnt++;
                }
            }

            dq.pollFirst();
        }
    }
}