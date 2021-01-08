import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int duration = scanner.nextInt();
        System.out.println(duration * scanner.nextInt() +
                scanner.nextInt() * 2 +
                --duration * scanner.nextInt());
    }
}