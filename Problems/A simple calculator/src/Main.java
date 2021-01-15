import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        String line = new Scanner(System.in).nextLine();
        String[] array = line.split(" ");
        long a = Long.parseLong(array[0]);
        long b = Long.parseLong(array[2]);
        switch (array[1]) {
            case "+":
                System.out.println(a + b);
                break;
            case "*":
                System.out.println(a * b);
                break;
            case "-":
                System.out.println(a - b);
                break;
            case "/":
                if (b == 0) {
                    System.out.println("Division by 0!");
                } else {
                    System.out.println(a / b);
                }
                break;
            default:
                System.out.println("Unknown operator");
                break;
        }
    }
}