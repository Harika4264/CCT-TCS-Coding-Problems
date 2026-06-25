import java.util.Scanner;

public class EMI {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double P = sc.nextDouble();
        int T = sc.nextInt(); // not directly used

        double totalA = 0, totalB = 0;

        int N1 = sc.nextInt();

        for (int i = 0; i < N1; i++) {

            int years = sc.nextInt();
            double rate = sc.nextDouble();

            double r = rate / (12 * 100);
            int months = years * 12;

            double emi = (P * r) /
                    (1 - (1 / Math.pow(1 + r, months)));

            totalA += emi * months;
        }

        int N2 = sc.nextInt();

        for (int i = 0; i < N2; i++) {

            int years = sc.nextInt();
            double rate = sc.nextDouble();

            double r = rate / (12 * 100);
            int months = years * 12;

            double emi = (P * r) /
                    (1 - (1 / Math.pow(1 + r, months)));

            totalB += emi * months;
        }

        if (totalA < totalB)
            System.out.println("Bank A");
        else
            System.out.println("Bank B");

        sc.close();
    }
}