import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int ascendingOrder = 1;
        int descendingOrder = 1;
        int count = 1;
        int temp;
        while (sc.hasNext()) {
            temp = n;
            n = sc.nextInt();
            if (n == 0) {
                break;
            }
            ++count;
            if (temp < n) {
                ascendingOrder++;
                descendingOrder = 0;
            } else if (temp > n) {
                ascendingOrder = 0;
                descendingOrder++;
            } else {
                ascendingOrder++;
                descendingOrder++;
            }
        }
        System.out.println(count - ascendingOrder == 0 || count - descendingOrder == 0);
    }
}