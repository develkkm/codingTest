import java.io.*;
import java.util.*;

class Main{
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringBuilder sb = new StringBuilder();
    static StringTokenizer st;

    public static void main(String[] args) throws IOException{
        Set<String> set = new HashSet<>();
        int t = Integer.parseInt(br.readLine());
        int cnt = 0;

        while(t-->0){
            String str = br.readLine();
            if(str.equals("ENTER")) {
                cnt += set.size();
                set.clear();
            }
            else{
                set.add(str);
            }
        }

        if(!set.isEmpty()){
            cnt+=set.size();
        }

        System.out.println(cnt);
    }
}