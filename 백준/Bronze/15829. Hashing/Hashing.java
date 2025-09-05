import java.io.*;
import java.math.BigInteger;
import java.util.*;

class Main{
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringBuilder sb = new StringBuilder();
    static StringTokenizer st;

    public static void main(String[] args) throws IOException{
        int n = Integer.parseInt(br.readLine());
        String str = br.readLine();
        int[] arr = new int[n];
        BigInteger result = BigInteger.valueOf(0);

        for (int i = 0; i < n; i++) {
            arr[i] = str.charAt(i) - 'a' + 1;
        }

        for (int i = 0; i < n; i++) {
            result = result.add(BigInteger.valueOf(arr[i]).multiply(BigInteger.valueOf(31).pow(i)));
        }

        System.out.println(result.remainder(BigInteger.valueOf(1234567891)));
    }
}