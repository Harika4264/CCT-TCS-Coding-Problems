import java.util.Scanner;

public class HistoricalPeriod {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int k = sc.nextInt();

        int[] a = new int[n];

        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        int max = Integer.MIN_VALUE;

        // First period
        for (int s1 = 0; s1 < n; s1++) {

            int sum1 = 0;

            for (int f1 = s1; f1 < n; f1++) {

                sum1 += a[f1];

                // Second period must start after gap > k
                int start2 = f1 + k + 2;

                if (start2 >= n)
                    continue;

                for (int s2 = start2; s2 < n; s2++) {

                    int sum2 = 0;

                    for (int f2 = s2; f2 < n; f2++) {

                        sum2 += a[f2];

                        int total = sum1 + sum2;

                        if (total > max) {
                            max = total;
                        }
                    }
                }
            }
        }

        System.out.println(max);

        sc.close();
    }
}