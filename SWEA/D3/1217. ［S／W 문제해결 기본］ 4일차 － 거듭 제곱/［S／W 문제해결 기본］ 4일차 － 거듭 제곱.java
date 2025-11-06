import java.util.Scanner;

public class Solution{

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        for (int t = 0; t < 10; t++) {
            int n = scanner.nextInt();
            int a = scanner.nextInt();
            int b = scanner.nextInt();

            int result = 1;

            for (int i = 0; i < b; i++) {
                result *= a;
            }
            System.out.println("#" + n + " " + result);
        }
    }
}