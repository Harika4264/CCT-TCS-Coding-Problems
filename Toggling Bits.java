import java.util.*;

public class Main {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);

int n = sc.nextInt();

int bits = Integer.toBinaryString(n).length();
int mask = (1 << bits) - 1;

System.out.println(n ^ mask);
}
}

