import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i = 0;
        int result = 0;
        int temp;
        while (i < n) {
            temp = sc.nextInt();
            if (temp > result && temp % 4 == 0) {
                result = temp;
            }
            i++;
        }
        System.out.println(result);
    }
}