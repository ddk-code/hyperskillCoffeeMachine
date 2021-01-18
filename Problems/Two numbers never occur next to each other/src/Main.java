import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr = new int[scanner.nextInt()];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
        }
        int n = scanner.nextInt();
        int m = scanner.nextInt();

        for (int i = 0; i < arr.length - 1; i++) {
            if (isNear(n, m, arr[i], arr[i + 1])) {
                System.out.println(false);
                return;
            }
        }
        System.out.println(true);
    }

    public static boolean isNear(int n, int m, int a, int b) {
        return a == n && b == m || a == m && b == n;
    }
}