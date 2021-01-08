import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        int b = sc.nextInt();
        for (int i = 1; i <= b; i++) {
            if (h >= sc.nextInt()) {
                System.out.println("Will crash on bridge " + i);
                return;
            }
        }
        System.out.println("Will not crash");
    }
}