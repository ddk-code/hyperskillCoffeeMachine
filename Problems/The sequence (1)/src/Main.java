import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        int n = new Scanner(System.in).nextInt();
        for (int i = 1;; i++) {
            for (int j = 0; j < i; j++) {
                if (n > 0) {
                    System.out.print(i + " ");
                    --n;
                }
            }
            if (n == 0) {
                break;
            }
        }
    }
}