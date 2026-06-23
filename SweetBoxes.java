import java.util.Scanner;
import java.util.HashSet;

public class SweetBoxes {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int players = sc.nextInt();

        int[] score = new int[players];

        for (int i = 0; i < players; i++) {

            int boxes = sc.nextInt();

            HashSet<Integer> set = new HashSet<>();

            for (int j = 0; j < boxes; j++) {
                set.add(sc.nextInt());
            }

            int points = boxes;
            int different = set.size();

            if (different == 4) {
                points += 1;
            } else if (different == 5) {
                points += 2;
            } else if (different >= 6) {
                points += 4;
            }

            score[i] = points;
        }

        int max = score[0];
        int winner = 0;
        int count = 1;

        for (int i = 1; i < players; i++) {

            if (score[i] > max) {
                max = score[i];
                winner = i;
                count = 1;
            } else if (score[i] == max) {
                count++;
            }
        }

        if (count > 1) {
            System.out.println("Tie");
        } else if (winner == 0) {
            System.out.println("Radha");
        } else {
            System.out.println(winner + 1);
        }

        sc.close();
    }
}