import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int temp;
        int a = 0;
        int b = 0;
        int c = 0;
        int d = 0;
        for (int i = 0; i < n; i++) {
            temp = sc.nextInt();
            if (temp == 2) {
                ++d;
            } else if (temp == 3) {
                ++c;
            } else if (temp == 4) {
                ++b;
            } else if (temp == 5) {
                ++a;
            }
        }
        System.out.println(d + " " + c + " " + b + " " + a);
    }
}