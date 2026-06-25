import java.util.Scanner;

public class PyramidConstruction {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        int totalTerms = N * (N + 1) / 2;
        int[] arr = new int[totalTerms];

        for (int i = 1; i <= totalTerms; i++) {
            arr[i - 1] = i * (i + 1) * (i + 2);
        }

        int index = 0;

        for (int row = 1; row <= N; row++) {

            for (int col = 1; col <= row; col++) {
                System.out.printf("%05d ", arr[index++]);
            }

            System.out.println();
        }

        sc.close();
    }
}