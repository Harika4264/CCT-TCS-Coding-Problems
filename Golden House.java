import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int k = sc.nextInt();

        int[] coins = new int[n];

        for (int i = 0; i < n; i++) {
            coins[i] = sc.nextInt();
        }

        int start = 0;
        int sum = 0;

        for (int end = 0; end < n; end++) {

            sum += coins[end];

            // Reduce window if sum becomes greater than K
            while (sum > k) {
                sum -= coins[start];
                start++;
            }

            // If sum equals K, print room numbers
            if (sum == k) {
                System.out.println((start + 1) + " " + (end + 1));
                return;
            }
        }

        sc.close();
    }
}