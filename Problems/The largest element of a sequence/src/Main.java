import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int max = n;
        while (n != 0) {
            if (max < n) {
                max = n;
            }
            n = sc.nextInt();
        }
        System.out.println(max);
    }
}