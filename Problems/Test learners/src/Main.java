import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        int i = new Scanner(System.in).nextInt();
        switch (i) {
            case 1:
                System.out.println("Yes!");
                break;
            case 2:
            case 3:
            case 4:
                System.out.println("No!");
                break;
            default:
                System.out.println("Unknown number");
                break;
        }
    }
}