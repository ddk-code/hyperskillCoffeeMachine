import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int companies = scanner.nextInt();
        if (companies == 1) {
            System.out.println(1);
            return;
        }
        int[] incomes = new int[companies];
        int[] percents = new int[companies];
        double[] taxes = new double[companies];

        fillArray(incomes, scanner);
        fillArray(percents, scanner);

        for (int i = 0; i < taxes.length; i++) {
            taxes[i] = (double) incomes[i] /  100 * percents[i];
        }
        System.out.println(findIndexByValue(taxes, findMaximum(taxes)) + 1);
    }

    public static void fillArray(int[] array, Scanner scanner) {
        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }
    }

    public static double findMaximum(double[] arr) {
        double max = arr[0];
        for (double i : arr) {
            if (max < i) {
                max = i;
            }
        }
        return max;
    }

    public static int findIndexByValue(double[] arr, double value) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == value) {
                return i;
            }
        }
        return -1;
    }
}