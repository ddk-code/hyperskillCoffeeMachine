import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        String[] arr = line.split(" ");
        int rotation = scanner.nextInt() % arr.length;
        String[] rArr = new String[arr.length];
        int j = 0;
        for (int i = rotation; i < arr.length; i++) {
            rArr[i] = arr[j];
            ++j;
        }
        int i = 0;
        while (j < arr.length) {
            rArr[i] = arr[j];
            ++i;
            ++j;
        }
        printStringArray(rArr);
    }

    public static void printStringArray(String[] arr) {
        for (String s : arr) {
            System.out.print(s + " ");
        }
    }
}