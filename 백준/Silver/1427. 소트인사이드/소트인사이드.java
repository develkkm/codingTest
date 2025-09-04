import java.io.*;
import java.util.*;

class Main{
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringBuilder sb = new StringBuilder();
    static StringTokenizer st;

    public static void main(String[] args) throws IOException {
        String str = br.readLine();
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=0;i<str.length();i++){
            list.add(str.charAt(i)-'0');
        }

        Collections.sort(list);

        for(int i : list){
            sb.append(i);
        }
        System.out.println(sb.reverse());
    }
}