import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[][] arr = new int[n * n][n * n];
        for (int i = 0; i < n * n; i++) {
            for (int j = 0; j < n * n; j++) {
                arr[i][j] = scanner.nextInt();
            }
        }

        if (n == 1 && arr[0][0] == 1) {
            System.out.println("YES");
            return;
        }
        boolean res = true;
        for (int i = 0; i < n * n; i++) {
            res &= checkInARow(n, i, i, 0, n * n - 1, arr);
        }
        isResultAlreadyFalse(res);
        for (int i = 0; i < n * n; i++) {
            res &= checkInARow(n, 0, n * n - 1, i, i, arr);
        }
        isResultAlreadyFalse(res);
        for (int i = 0; i < n * n; i += n) {
            for (int j = 0; j < n * n; j += n) {
                res &= checkInARow(n, i, i + n - 1, j, j + n - 1, arr);
            }
        }
        System.out.println(res ? "YES" : "NO");
    }

    public static boolean checkInARow(int n, int fromI, int toI, int fromJ, int toJ, int[][] arr) {
        int count = 0;
        OUTER: for (int i = 1; i <= n * n; i++) {
            for (int j = fromI; j <= toI; j++) {
                for (int k = fromJ; k <= toJ; k++) {
                    if (arr[j][k] == i) {
                        ++count;
                        continue OUTER;
                    }
                }
            }
        }
        return count == n * n;
    }

    public static void isResultAlreadyFalse(boolean res) {
        if (!res) {
            System.out.println("NO");
            System.exit(0);
        }
    }
}