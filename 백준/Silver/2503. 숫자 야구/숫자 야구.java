import java.io.*;
import java.util.*;

class Main{
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringBuilder sb = new StringBuilder();
    static StringTokenizer st;
    static int[][] arr;

    public static void main(String[] args) throws IOException {
        int n = Integer.parseInt(br.readLine());

        arr = new int[n][3];
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < 3; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        int cnt = 0;
        int num = 123;
        while(num++ <= 999){
            if(isDuplicateNum(num) || hasZero(num))
                continue;

            if(baseball(num)) cnt++;
        }

        System.out.println(cnt);
    }

    private static boolean isDuplicateNum(int num) {
        int ones = num % 10;
        int tens = (num / 10) % 10;
        int hunds = num / 100;
        return ones == tens || tens == hunds || ones == hunds;
    }
    
    private static boolean hasZero(int num) {
        return String.valueOf(num).contains("0");
    }
    

    private static boolean baseball(int ans) {
        String str1 = String.valueOf(ans);
        int cnt = 0;

        for (int[] ints : arr) {
            String str2 = String.valueOf(ints[0]);
            int strike = 0;
            int ball = 0;

            for (int i = 0; i < 3; i++) {
                if (str1.charAt(i) == str2.charAt(i))
                    strike++;
                else if (str1.contains(str2.charAt(i) + ""))
                    ball++;
            }

            if (strike == ints[1] && ball == ints[2])
                cnt++;
        }

        return cnt == arr.length;
    }
}