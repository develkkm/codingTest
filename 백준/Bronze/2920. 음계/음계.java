import java.io.*;
import java.util.*;

public class Main{
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringBuilder sb = new StringBuilder();
    static StringTokenizer st;

    public static void main(String[] args) throws IOException{
        st = new StringTokenizer(br.readLine());
        int num = Integer.parseInt(st.nextToken());
        boolean flag = true;
        if(num == 8){
            for(int i=1;i<8;i++){
                if(Integer.parseInt(st.nextToken()) != num - i) {
                    sb.append("mixed");
                    flag = false;
                    break;
                }
            }
            if(flag)
                sb.append("descending");
        }
        else if(num == 1){
            for(int i=1;i<8;i++){
                if(Integer.parseInt(st.nextToken()) != num + i) {
                    sb.append("mixed");
                    flag = false;
                    break;
                }
            }
            if(flag)
                sb.append("ascending");
        }
        else sb.append("mixed");
        System.out.println(sb);
    }
}