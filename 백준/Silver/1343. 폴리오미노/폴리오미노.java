import java.io.*;
import java.util.*;

class Main{
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringBuilder sb = new StringBuilder();
    static StringTokenizer st;

    public static void main(String[] args) throws IOException {
        String str = br.readLine();

        int cntX = 0;
        StringBuilder ans = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i) == '.'){
                if(cntX % 2 == 1){
                    ans = new StringBuilder("-1");
                    cntX = 0;
                    break;
                }

                int cntA = cntX / 4;
                int cntB = cntX % 4 / 2;

                while(cntA-- > 0){
                    ans.append("AAAA");
                }

                while(cntB-- > 0){
                    ans.append("BB");
                }
                cntX = 0;
                ans.append(".");
            }else {
                cntX++;
            }
        }

        if(cntX>0){
            if(cntX % 2 == 1){
                System.out.println(-1);
                return;
            }
            
            int cntA = cntX / 4;
            int cntB = cntX % 4 / 2;

            while(cntA-- > 0){
                ans.append("AAAA");
            }

            while(cntB-- > 0){
                ans.append("BB");
            }
        }

        System.out.println(ans);
    }
}