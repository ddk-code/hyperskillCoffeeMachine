import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        String line = new Scanner(System.in).nextLine();
        String[] arr = line.split(" ");
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i].compareTo(arr[i + 1]) > 0) {
                System.out.println(false);
                return;
            }
        }
        System.out.println(true);
    }
}