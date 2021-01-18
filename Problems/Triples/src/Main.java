import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr = new int[scanner.nextInt()];
        int result = 0;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
        }
        for (int i = 0; i < arr.length - 2; i++) {
            if (isTriple(arr[i], arr[i + 1], arr[i + 2])) {
                ++result;
            }
        }
        System.out.println(result);
    }

    public static boolean isTriple(int a, int b, int c) {
        return a + 1 == b && b + 1 == c;
    }
}