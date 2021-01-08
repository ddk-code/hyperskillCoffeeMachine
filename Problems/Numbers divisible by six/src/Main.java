import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int result = 0;
        int temp;
        for (int i = 0; i < n; i++) {
            temp = sc.nextInt();
            if (temp % 6 == 0) {
                result += temp;
            }
        }
        System.out.println(result);
    }
}
