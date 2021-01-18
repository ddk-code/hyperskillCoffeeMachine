import java.util.Arrays;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr = new int[scanner.nextInt()];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
        }
        int[] copy = Arrays.copyOf(arr, arr.length);
        Arrays.sort(copy);
        System.out.println(Arrays.equals(arr, copy));
    }
}