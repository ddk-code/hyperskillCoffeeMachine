import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        boolean b = scanner.nextBoolean();
        System.out.println((n >= 10 && n <= 20 && !b) ||
                (n >= 15 && n <= 25 && b));
    }
}