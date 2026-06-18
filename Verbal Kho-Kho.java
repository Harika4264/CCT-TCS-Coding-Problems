import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Read number of friends
        int n = sc.nextInt();

        // Store digits understood by friends
        int[] d = new int[n];

        for (int i = 0; i < n; i++) {
            d[i] = sc.nextInt();
        }

        // Last friend's digit
        int lastDigit = d[n - 1];

        int count = 0;

        // Count friends whose digit is different
        for (int i = 0; i < n - 1; i++) {
            if (d[i] != lastDigit) {
                count++;
            }
        }

        System.out.println(count);

        sc.close();
    }
}