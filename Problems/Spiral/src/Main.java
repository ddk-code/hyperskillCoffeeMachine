import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        int n = new Scanner(System.in).nextInt();
        if (n == 1) {
            System.out.println(1);
            return;
        }
        int[][] matrix = new int[n][n];
        int i = 0;
        int j = 0;
        int value = 1;

        for (int k = 0; value <= n * n; k++) {
            while (j < n - k - 1 && value <= n * n) {
                if (matrix[i][j] == 0) {
                    matrix[i][j] = value++;
                    ++j;
                } else {
                    break;
                }
            }
            while (i < n - k - 1 && value <= n * n) {
                if (matrix[i][j] == 0) {
                    matrix[i][j] = value++;
                    ++i;
                } else {
                    break;
                }
            }
            while (j > k && value <= n * n) {
                if (matrix[i][j] == 0) {
                    matrix[i][j] = value++;
                    --j;
                } else {
                    break;
                }
            }
            while (i > k && value <= n * n) {
                if (matrix[i][j] == 0) {
                    matrix[i][j] = value++;
                    --i;
                } else {
                    break;
                }
            }
            ++j;
            ++i;
            if (value == n * n) {
                matrix[i][j] = value;
                break;
            }
        }
        printIntMatrix(matrix);
    }

    public static void printIntMatrix(int[][] matrix) {
        for (int[] ints : matrix) {
            for (int aInt : ints) {
                System.out.print(aInt + " ");
            }
            System.out.println();
        }
    }
}