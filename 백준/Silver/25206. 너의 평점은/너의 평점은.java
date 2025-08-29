import java.io.*;
import java.util.*;

class Main{
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringBuilder sb = new StringBuilder();
    static StringTokenizer st;

    public static void main(String[] args) throws IOException {
        double sum = 0.0;
        double wSum = 0;
        for(int i=0;i<20;i++){
            st = new StringTokenizer(br.readLine());
            String name = st.nextToken();
            double w = Double.parseDouble(st.nextToken());
            String score = st.nextToken();
            if(score.equals("P")) continue;
            wSum += w;
            switch (score){
                case "A+": sum += w * 4.5; break;
                case "A0": sum += w * 4.0; break;
                case "B+": sum += w * 3.5; break;
                case "B0": sum += w * 3.0; break;
                case "C+": sum += w * 2.5; break;
                case "C0": sum += w * 2.0; break;
                case "D+": sum += w * 1.5; break;
                case "D0": sum += w * 1; break;
                case "F": sum += w * 0;
            }
        }
        System.out.println(sum/wSum);
    }
}