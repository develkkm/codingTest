import java.io.*;
import java.util.*;

class Main{
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringBuilder sb = new StringBuilder();
    static StringTokenizer st;

    public static void main(String[] args) throws IOException {
        int next = 0;
        for(int i=0;i<3;i++){
            String str = br.readLine();
            if(str.chars().allMatch(Character::isDigit)){
                int num = Integer.parseInt(str);
                next = num + 3 - i;
            }
        }

        if(next % 15 == 0 ) sb.append("FizzBuzz");
        else if(next % 5 == 0) sb.append("Buzz");
        else if(next % 3 == 0) sb.append("Fizz");
        else sb.append(next);

        System.out.println(sb);
    }
}