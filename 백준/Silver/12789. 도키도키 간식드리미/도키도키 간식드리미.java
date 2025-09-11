import java.io.*;
import java.util.*;

class Main{
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;

    public static void main(String[] args) throws IOException{
        int N = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());

        Deque<Integer> stack = new ArrayDeque<>(); // 사이드 도로 (스택)
        int next = 1; // 받아야 할 다음 번호

        for (int i = 0; i < N; i++) {
            int cur = Integer.parseInt(st.nextToken());

            while (!stack.isEmpty() && stack.peekLast() == next) {
                stack.removeLast();
                next++;
            }

            if (cur == next) {
                next++;
            } else {
                stack.addLast(cur);
            }
        }

        while (!stack.isEmpty() && stack.peekLast() == next) {
            stack.removeLast();
            next++;
        }

        System.out.println(next == N + 1 ? "Nice" : "Sad");
    }
}
