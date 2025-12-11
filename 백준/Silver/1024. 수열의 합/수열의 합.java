import java.io.*;
import java.util.*;

class Main{
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringBuilder sb = new StringBuilder();
    static StringTokenizer st;

    public static void main(String[] args) throws IOException{
        st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int l = Integer.parseInt(st.nextToken());

        for (int i = l; i <= 100; i++) {
            int tmp = n - (i * (i-1) / 2);

            if(tmp < 0){
                break;
            }

            if(tmp % i == 0){
                int x = tmp / i;

                if(x>=0){
                    for (int j = 0; j < i; j++) {
                        System.out.print(x+j + " ");
                    }
                    return;
                }
            }

        }
        System.out.println(-1);
    }
}