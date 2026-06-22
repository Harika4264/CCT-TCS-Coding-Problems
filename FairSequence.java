import java.util.Scanner;

public class FairSequence {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] a = new int[n];

        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        int maxLength = 0;
        int maxSum = Integer.MIN_VALUE;

        // Try every possible starting element
        for (int i = 0; i < n; i++) {

            int length = 1;
            int sum = a[i];
            int last = a[i];

            // Build fair sequence
            for (int j = i + 1; j < n; j++) {

                // Opposite signs
                if ((last > 0 && a[j] < 0) ||
                    (last < 0 && a[j] > 0)) {

                    length++;
                    sum += a[j];
                    last = a[j];
                }
            }

            // Update answer
            if (length > maxLength) {
                maxLength = length;
                maxSum = sum;
            } else if (length == maxLength && sum > maxSum) {
                maxSum = sum;
            }
        }

        System.out.println(maxSum);

        sc.close();
    }
}