import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int start = sc.nextInt();
        int end = sc.nextInt() + 1;
        System.out.println(s.substring(start, end));
    }
}