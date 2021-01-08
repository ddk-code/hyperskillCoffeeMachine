import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        int perfect = 0;
        int larger = 0;
        int smaller = 0;
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int temp = n;
        for (int i = 0; i < n; i++) {
            temp = sc.nextInt();
            if (temp == 0) {
                ++perfect;
            } else if (temp == 1) {
                ++larger;
            } else if (temp == -1) {
                ++smaller;
            }
        }
        System.out.println(perfect + " " + larger + " " + smaller);
    }
}