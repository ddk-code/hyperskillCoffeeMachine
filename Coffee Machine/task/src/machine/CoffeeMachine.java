package machine;

import java.util.Scanner;

public class CoffeeMachine {
    public static void main(String[] args) {
//        System.out.println("Write how many cups of coffee you will need: ");
//        int cups = new Scanner(System.in).nextInt();
//        System.out.println("For " + cups + " cups of coffee you will need:");
//        System.out.println(cups * 200 + " ml of water");
//        System.out.println(cups * 50 + " ml of milk");
//        System.out.println(cups * 15 + " g of coffee beans");

        Scanner scanner = new Scanner(System.in);
        System.out.println("Write how many ml of water the coffee machine has:");
        int water = scanner.nextInt();
        System.out.println("Write how many ml of milk the coffee machine has:");
        int milk = scanner.nextInt();
        System.out.println("Write how many grams of coffee beans the coffee machine has:");
        int coffee = scanner.nextInt();
        System.out.println("Write how many cups of coffee you will need:");
        int cupsNeeded = scanner.nextInt();
        int maximumCups = maximumPossibleCups(water, milk, coffee);
        if (maximumCups >= cupsNeeded) {
            System.out.print("Yes, I can make that amount of coffee");
            if (maximumCups > cupsNeeded) {
                System.out.print(" (and even " + (maximumCups - cupsNeeded) + " more than that)");
            }
            System.out.println();
        } else {
            System.out.println("No, I can make only " + maximumCups + " cup(s) of coffee");
        }

    }

    public static int maximumPossibleCups(int water, int milk, int coffee) {
        int cupsCount = 0;
        water /= 200;
        milk /= 50;
        coffee /= 15;
        while (water != 0 && milk != 0 && coffee != 0) {
            --water;
            --milk;
            --coffee;
            ++cupsCount;
        }
        return cupsCount;
    }
}
