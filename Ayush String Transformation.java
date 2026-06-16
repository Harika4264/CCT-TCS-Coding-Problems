import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        String A = sc.next();
        String B = sc.next();

        char[] a = A.toCharArray();
        char[] b = B.toCharArray();


        for (int i = 0; i < n; i++) {
            if (b[i] > a[i]) {
                System.out.println(-1);
                return;
            }
        }

        int operations = 0;

        for (char target = 'a'; target <= 'z'; target++) {

            boolean needOperation = false;

    
            for (int i = 0; i < n; i++) {
                if (b[i] == target && a[i] > target) {
                    needOperation = true;
                    break;
                }
            }

            if (needOperation) {

                boolean exists = false;

        
                for (int i = 0; i < n; i++) {
                    if (a[i] == target) {
                        exists = true;
                        break;
                    }
                }

                if (!exists) {
                    System.out.println(-1);
                    return;
                }

                operations++;

                
                for (int i = 0; i < n; i++) {
                    if (b[i] == target && a[i] > target) {
                        a[i] = target;
                    }
                }
            }
        }

        System.out.println(operations);
    }
}