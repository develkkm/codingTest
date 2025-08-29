import java.io.*;
import java.util.*;

class Main{
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringBuilder sb = new StringBuilder();
    static StringTokenizer st;

    public static void main(String[] args) throws IOException {
        double max = -1;
        int t = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        double[] arr = new double[t];
        double sum = 0;

        for(int i=0;i<t;i++){
            arr[i] = Integer.parseInt(st.nextToken());
            if(arr[i] > max) max = arr[i];
        }

        for(int i=0;i<t;i++){
            arr[i] = arr[i] / max * 100;
            sum += arr[i];
        }


        System.out.println(sum/t);
    }
}