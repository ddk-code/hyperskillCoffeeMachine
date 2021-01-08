import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        int n = new Scanner(System.in).nextInt();
        if ((n / 1000 == n % 10) && (n / 100) % 10 == ((n / 10) % 10)) {
            System.out.println(1);
        } else {
            System.out.println(2);
        }
    }
}