import java.util.Scanner;

public class FuelIndustry {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int k = sc.nextInt();

        int[] price = new int[n];
        int[] volume = new int[n];

        for (int i = 0; i < n; i++) {
            price[i] = sc.nextInt();
        }

        for (int i = 0; i < n; i++) {
            volume[i] = sc.nextInt();
        }

        int[] dp = new int[k + 1];

        for (int i = 0; i < n; i++) {

            for (int j = k; j >= price[i]; j--) {

                dp[j] = Math.max(dp[j],
                                 dp[j - price[i]] + volume[i]);
            }
        }

        System.out.println(dp[k]);

        sc.close();
    }
}