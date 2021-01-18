import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int min = scanner.nextInt();
        int temp;
        for (int i = 1; i < size; i++) {
            temp = scanner.nextInt();
            if (temp < min) {
                min = temp;
            }
        }
        System.out.println(min);
    }
}