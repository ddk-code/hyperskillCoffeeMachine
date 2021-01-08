import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int h = scanner.nextInt();
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int numberOfDay = 1;
        int snailHere = a;
        while (snailHere < h) {
            snailHere -= b;
            snailHere += a;
            ++numberOfDay;
        }
        System.out.println(numberOfDay);
    }
}