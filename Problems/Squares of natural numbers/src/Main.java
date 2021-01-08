import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        int n = new Scanner(System.in).nextInt();
        int i = 1;
        while (i * i <= n) {
            System.out.println(i * i);
            ++i;
        }
    }
}