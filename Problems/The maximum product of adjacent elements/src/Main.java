import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int result = 1;
        int temp;
        int prev = scanner.nextInt();
        for (int i = 1; i < size; i++) {
            temp = scanner.nextInt();
            if (prev * temp > result) {
                result = prev * temp;
            }
            prev = temp;
        }
        System.out.println(result);
    }
}
