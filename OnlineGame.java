import java.util.Scanner;

public class OnlineGame {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] a = new int[n];
        int[] dp = new int[n];

        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
            dp[i] = 1;
        }

        int max = 1;

        for (int i = 1; i < n; i++) {

            for (int j = 0; j < i; j++) {

                if (a[i] > a[j] && dp[i] < dp[j] + 1) {
                    dp[i] = dp[j] + 1;
                }
            }

            if (dp[i] > max) {
                max = dp[i];
            }
        }

        System.out.println(max);

        sc.close();
    }
}