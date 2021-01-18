import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] a = new int[scanner.nextInt()];
        for (int i = 1; i < a.length; i++) {
            a[i] = scanner.nextInt();
        }
        a[0] = scanner.nextInt();
        for (int i : a) {
            System.out.print(i + " ");
        }
    }
}