import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        int n = new Scanner(System.in).nextInt();
        int temp = n;
        System.out.print(temp + " ");
        while (temp != 1) {
            if (temp % 2 == 1) {
                temp = temp * 3 + 1;
            } else {
                temp /= 2;
            }
            System.out.print(temp + " ");
        }
    }
}