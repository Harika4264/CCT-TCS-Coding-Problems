import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] a = new int[n];

        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        int d = sc.nextInt();
        int x = sc.nextInt(); 

        int count = 0;

        for (int i = 0; i < n; i++) {
            if (d % 2 == 0) { 
                if (a[i] % 2 != 0) {
                    count++;
                }
            } else { 
                if (a[i] % 2 == 0) {
                    count++;
                }
            }
        }

        System.out.println(count * x);
    }
}