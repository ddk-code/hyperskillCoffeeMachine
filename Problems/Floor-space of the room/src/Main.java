import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String roomType = sc.nextLine();
        double s = 0.0;
        switch (roomType) {
            case "triangle":
                s = findArea(sc.nextDouble(), sc.nextDouble(), sc.nextDouble());
                break;
            case "rectangle":
                s = findArea(sc.nextDouble(), sc.nextDouble());
                break;
            case "circle":
                s = findArea(sc.nextDouble());
                break;
            default:
                break;
        }
        System.out.println(s);
    }

    public static double findArea(double a, double b, double c) {
        double p = (a + b + c) / 2;
        return Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }

    public static double findArea(double a, double b) {
        return a * b;
    }

    public static double findArea(double r) {
        return 3.14 * Math.pow(r, 2);
    }
}