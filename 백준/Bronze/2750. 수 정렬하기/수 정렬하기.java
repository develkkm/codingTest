import java.io.*;
import java.util.*;

class Main{
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringBuilder sb = new StringBuilder();
    static StringTokenizer st;

    public static void main(String[] args) throws IOException {
        int n = Integer.parseInt(br.readLine());
        ArrayList<Integer> list = new ArrayList<>();

        for(int i=0;i<n;i++){
            list.add(Integer.parseInt(br.readLine()));
        }

        Collections.sort(list);

        for(int i=0;i<n;i++){
            System.out.println(list.get(i));
        }
    }
}