import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double m = sc.nextDouble();
        double p = sc.nextDouble();
        double k = sc.nextDouble();
        int y = 0;
        while (m < k) {
            ++y;
            m = m + m / 100 * p;
        }
        System.out.println(y);
    }
}