package machine;

import java.util.Scanner;

public class InputLine {
    static Scanner scanner = new Scanner(System.in);

    public static String line() {
        return scanner.nextLine();
    }
}
