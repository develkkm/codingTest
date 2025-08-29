import java.io.*;
import java.util.*;

class Main{
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringBuilder sb = new StringBuilder();
    static StringTokenizer st;

    public static void main(String[] args) throws IOException {
        String s = br.readLine().trim().toLowerCase();
        s = s.replaceAll("dz=|c=|c-|d-|lj|nj|s=|z=", "a");
        System.out.println(s.length());
    }
}