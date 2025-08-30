import java.io.*;
import java.util.*;

class Main{

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringBuilder sb = new StringBuilder();
    static StringTokenizer st ;

    public static void main(String[] args) throws IOException{
        while(true) {
            StringTokenizer st = new StringTokenizer(br.readLine()," ");

            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            int z = Integer.parseInt(st.nextToken());

            if(x == 0 || y == 0 || z == 0) break;


            if((x * x + y * y) == z * z) {
                sb.append("right").append('\n');
            }
            else if(x * x == (y * y + z * z)) {
                sb.append("right").append('\n');
            }
            else if(y * y == (z * z + x * x)) {
                sb.append("right").append('\n');
            }
            else {
                sb.append("wrong").append('\n');
            }

        }
        System.out.println(sb);
    } 
}
