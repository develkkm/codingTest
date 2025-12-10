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

        for (int i = 1; i <= n; i++) {
            dq.add(i);
        }

        arr = new int[m];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < m; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        minqueue();

        System.out.println(cnt);
    }

    private static void minqueue() {

        for (int i = 0; i < arr.length; i++) {
            int popIndex = dq.indexOf(arr[i]);
            int middleIndex;

            if(dq.size() % 2 == 0){
                middleIndex = dq.size() / 2 - 1;
            }
            else{
                middleIndex = dq.size() / 2;
            }

            if(popIndex <= middleIndex){
                for (int j = 0; j < popIndex; j++) {
                    dq.offerLast(dq.pollFirst());
                    cnt++;
                }
            }
            else{
                for (int j = 0; j < dq.size()-popIndex; j++) {
                    dq.offerFirst(dq.pollLast());
                    cnt++;
                }
            }
            dq.pollFirst();
        }
    }
}