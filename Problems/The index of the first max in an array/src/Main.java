import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr = new int[scanner.nextInt()];
        if (arr.length == 1) {
            System.out.println(0);
            return;
        }
        arr[0] = scanner.nextInt();
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == max) {
                System.out.println(i);
                break;
            }
        }
    }
}