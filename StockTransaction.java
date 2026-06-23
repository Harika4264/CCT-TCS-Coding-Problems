import java.util.Arrays;
import java.util.Scanner;

public class StockTransaction {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int k = sc.nextInt();

        int[] a = new int[n];

        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        Arrays.sort(a);

        int left = 0;
        int right = n - 1;

        while (left < right) {

            if (a[right] > k) {

                a[left] += k;
                a[right] -= k;
            }

            left++;
            right--;
        }

        Arrays.sort(a);

        System.out.println(a[n - 1] - a[0]);

        sc.close();
    }
}