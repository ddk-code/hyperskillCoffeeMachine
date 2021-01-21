import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int[][] arr = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arr[i][j] = scanner.nextInt();
            }
        }
        int k = scanner.nextInt();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (arr[i][j] == 0 && j + k <= m) {
                    int check = 0;
                    while (arr[i][j] == 0 && j < m && check != k) {
                        ++check;
                        ++j;
                        if (j == m) {
                            break;
                        }
                    }
                    if (check == k) {
                        System.out.println(i + 1);
                        return;
                    }
                }
            }
        }
        System.out.println(0);
    }
}