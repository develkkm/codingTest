import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        sc.close();
        long remain = 0;
        for(int i = 0; i < a.length(); i++){
            remain = (remain * 10 + (a.charAt(i) - '0')) % 20000303;
        }
        
        System.out.print(remain);
        
    }
}