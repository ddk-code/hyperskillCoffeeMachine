import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String temp = scanner.nextLine();
        String input = "";
        while (!"end".equals(temp)) {
            input += temp + "\n";
            temp = scanner.nextLine();
        }

        String[] lines = input.split("\n");
        int n = lines.length;
        int m = lines[0].split(" ").length;

        int[][] arr = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arr[i][j] = Integer.parseInt(lines[i].split(" ")[j]);
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(arr[i - 1 < 0 ? n - 1 : i - 1][j] + arr[i + 1 == n ? 0 : i + 1][j] +
                        arr[i][j - 1 < 0 ? m - 1 : j - 1] + arr[i][j + 1 == m ? 0 : j + 1] + " ");
            }
            System.out.println();
        }
    }
}