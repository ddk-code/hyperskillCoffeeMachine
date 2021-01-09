import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String d = sc.nextLine();
        System.out.println(s.trim().replace(" ", "").equals(d.trim().replace(" ", "")));
    }
}