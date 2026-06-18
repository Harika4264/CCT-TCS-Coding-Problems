import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        long k = sc.nextLong();

        long[] price = new long[n];

        for (int i = 0; i < n; i++) {
            price[i] = sc.nextLong();
        }

        int start = 0;
        long sum = 0;
        int maxLength = 0;

        for (int end = 0; end < n; end++) {

            sum += price[end];

            // Make sure total cost is less than K
            while (sum >= k) {
                sum -= price[start];
                start++;
            }

            int length = end - start + 1;

            if (length > maxLength) {
                maxLength = length;
            }
        }

        System.out.println(maxLength);

        sc.close();
    }
}