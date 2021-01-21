import java.util.Arrays;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        int n = new Scanner(System.in).nextInt();
        char[][] arr = new char[n][n];
        fillWithDots(arr);
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (isStarFit(n, i, j)) {
                    arr[i][j] = '*';
                }
            }
        }
        printArray(arr);
    }

    public static boolean isStarFit(int size, int i, int j) {
        return i == j || i + j == size - 1 || i == size / 2 || j == size / 2;
    }

    public static void fillWithDots(char[][] arr) {
        for (char[] c : arr) {
            Arrays.fill(c, '.');
        }
    }

    public static void printArray(char[][] arr) {
        for (char[] chars : arr) {
            for (char aChar : chars) {
                System.out.print(aChar + " ");
            }
            System.out.println();
        }
    }
}