import java.io.*;
import java.util.*;

class Main{
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringBuilder sb = new StringBuilder();
    static StringTokenizer st;

    public static void main(String[] args) throws IOException {
        int n = Integer.parseInt(br.readLine());

        int[] arr = new int[n+1];
        st = new StringTokenizer(br.readLine());
        for (int i = 1; i < n+1; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        int k = Integer.parseInt(br.readLine());
        while(k-->0){
            st = new StringTokenizer(br.readLine());
            int s = Integer.parseInt(st.nextToken());
            int num = Integer.parseInt(st.nextToken());

            if(s == 1){
                for (int i = num; i <= n; i=i+num) {
                    if(arr[i] == 1) arr[i] = 0;
                    else arr[i] = 1;
                }
            }else{
                int start = num;
                int end = num;

                while(true){
                    if(start < 1 || end > n){
                        break;
                    }

                    if(arr[start] == arr[end]){
                        if(start == end){
                            if(arr[start] == 1) arr[start] = 0;
                            else arr[start] = 1;
                        }else{
                            if(arr[start] == 1) arr[start] = 0;
                            else arr[start] = 1;

                            if(arr[end] == 1) arr[end] = 0;
                            else arr[end] = 1;
                        }
                        start--;
                        end++;
                    }else{
                        break;
                    }
                }
            }
        }

        for (int i = 1; i < n+1; i++) {
            sb.append(arr[i]).append(" ");
            if(i%20==0) sb.append("\n");
        }

        System.out.println(sb);
    }
}
