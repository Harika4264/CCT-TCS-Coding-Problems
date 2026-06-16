import java.util.Scanner;

public class Main {


    static long gcd(long a, long b) {
        while (b != 0) {
            long temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    
    static long lcm(long a, long b) {
        return (a / gcd(a, b)) * b;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] board = new int[n];

        for (int i = 0; i < n; i++) {
            board[i] = sc.nextInt();
        }

        boolean[] visited = new boolean[n];
        long answer = 1;

        for (int i = 0; i < n; i++) {
            if (!visited[i]) {
                int length = 0;
                int current = i;

                while (!visited[current]) {
                    visited[current] = true;
                    current = board[current] - 1; 
                    length++;
                }

                answer = lcm(answer, length);
            }
        }

        System.out.println(answer);
    }
}