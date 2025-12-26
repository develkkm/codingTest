import java.io.*;
import java.util.*;

class Main{
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;

    public static void main(String[] args) throws IOException {
        String str = br.readLine();

        List<String> list = new ArrayList<>();
        for (int i = 1; i < str.length(); i++) {
            for (int j = i+1; j < str.length(); j++) {
                StringBuilder sb = new StringBuilder();
                StringBuilder sb1 = new StringBuilder();
                StringBuilder sb2 = new StringBuilder();
                StringBuilder sb3 = new StringBuilder();
                
                sb1.append(str,0,i);
                sb2.append(str,i,j);
                sb3.append(str,j,str.length());

                sb.append(sb1.reverse()).append(sb2.reverse()).append(sb3.reverse());
                list.add(sb.toString());
            }
        }

        Collections.sort(list);

        System.out.println(list.get(0));
    }
}
