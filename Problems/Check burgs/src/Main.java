import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        String city = new Scanner(System.in).nextLine();
        System.out.println(city.length() >= 4 && city.endsWith("burg"));
    }
}