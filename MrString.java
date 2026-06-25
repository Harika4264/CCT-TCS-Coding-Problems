import java.util.Scanner;

public class MrString {

    static String[] words = {
            "zero","one","two","three","four","five",
            "six","seven","eight","nine","ten"
    };

    static int countVowels(String s) {
        int count = 0;

        for (char ch : s.toCharArray()) {
            if ("aeiou".indexOf(ch) != -1)
                count++;
        }

        return count;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        int D = 0;

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            D += countVowels(words[arr[i]]);
        }

        int pairs = 0;

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {

                if (arr[i] + arr[j] == D)
                    pairs++;
            }
        }

        if (pairs > 100)
            System.out.println("greater 100");
        else
            System.out.println(words[pairs]);

        sc.close();
    }
}