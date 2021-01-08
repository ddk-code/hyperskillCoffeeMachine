import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int time1 = scanner.nextInt() * 3600 + scanner.nextInt() * 60 + scanner.nextInt();
        int time2 = scanner.nextInt() * 3600 + scanner.nextInt() * 60 + scanner.nextInt();
        System.out.println(time2 - time1);
    }
}