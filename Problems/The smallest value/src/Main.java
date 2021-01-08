import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long m = sc.nextLong();
        long i = 1;
        while (i < m) {
            if (fact(i) > m) {
                System.out.println(i);
                break;
            }
            ++i;
        }
    }

    public static long fact(long n) {
        if (n == 1) {
            return 1;
        } else {
            return n * fact(n - 1);
        }
    }
}