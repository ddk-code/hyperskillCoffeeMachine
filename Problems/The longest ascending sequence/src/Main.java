import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        if (size == 1) {
            System.out.println(1);
            return;
        }
        int result = 1;
        int counting = 1;
        int temp;
        int prev = scanner.nextInt();
        for (int i = 1; i < size; i++) {
            temp = scanner.nextInt();
            if (prev < temp) {
                ++counting;
            } else {
                if (result < counting) {
                    result = counting;
                }
                counting = 1;
            }
            prev = temp;
        }
        System.out.println(result > counting ? result : counting);
    }
}