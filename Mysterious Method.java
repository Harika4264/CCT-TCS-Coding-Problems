import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int r = sc.nextInt();

        if (r == 0) {
            System.out.println(0);
            return;
        }

        int sum = 0;

        // Sum of digits of N
        while (n > 0) {
            sum += n % 10;
            n /= 10;
        }

        // Repeat R times
        int total = sum * r;

        // Convert to single digit
        while (total >= 10) {
            int temp = 0;

            while (total > 0) {
                temp += total % 10;
                total /= 10;
            }

            total = temp;
        }

        System.out.println(total);
    }
}