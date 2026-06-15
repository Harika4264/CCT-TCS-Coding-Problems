import java.util.*;

public class Main {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);

String day = sc.next().toLowerCase();
int n = sc.nextInt();

String[] days = {
"sun", "mon", "tue", "wed",
"thu", "fri", "sat"
};

int start = 0;

for(int i = 0; i < 7; i++) {
if(days[i].equals(day)) {
start = i;
break;
}
}

int count = 0;

for(int i = 0; i < n; i++) {
if((start + i) % 7 == 0) {
count++;
}
}

System.out.println(count);
}
}
