import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();
        int L = sc.nextInt();

        int maxCount = 0;

        for (int i = 0; i < str.length(); i += L) {
            int count = 0;

            for (int j = i; j < i + L && j < str.length(); j++) {
                if (str.charAt(j) == 'a') {
                    count++;
                }
            }

            if (count > maxCount) {
                maxCount = count;
            }
        }

        System.out.println(maxCount);
    }
}