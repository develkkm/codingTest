import java.io.*;
import java.util.*;

class Main{
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringBuilder sb = new StringBuilder();
    static StringTokenizer st;

    public static void main(String[] args) throws IOException{
        while(true){
            ArrayList<Integer> list = new ArrayList<>();
            int num = 0;
            int n = Integer.parseInt(br.readLine());
            if(n==-1) break;

            for(int i=1;i<n;i++){
                if(n % i == 0){
                    list.add(i);
                    num += i;
                }
            }

            if(num == n){
                sb.append(n).append(" = ");
                for(int i=0;i<list.size()-1;i++){
                    sb.append(list.get(i)).append(" + ");
                }
                sb.append(list.get(list.size()-1));
            }
            else{
                sb.append(n).append(" is NOT perfect.");
            }
            sb.append("\n");
        }
        System.out.println(sb);
    }
}