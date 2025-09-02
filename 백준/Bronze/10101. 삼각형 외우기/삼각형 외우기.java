import java.io.*;
import java.util.*;

class Main{
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringBuilder sb = new StringBuilder();
    static StringTokenizer st;

    public static void main(String[] args) throws IOException{
        int d1 = Integer.parseInt(br.readLine());
        int d2 = Integer.parseInt(br.readLine());
        int d3 = Integer.parseInt(br.readLine());

        if(d1 == d2 && d2 == d3 && d1 == 60){
            sb.append("Equilateral");
        }
        else if(d1 + d2 + d3 == 180 && (d1 == d2 || d2 == d3 || d1 == d3)){
            sb.append("Isosceles");
        }
        else if(d1 + d2 + d3 == 180){
            sb.append("Scalene");
        }
        else{
            sb.append("Error");
        }

        System.out.println(sb);
    }
}