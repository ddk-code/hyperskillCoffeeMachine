package machine;

import java.util.Scanner;

public class CoffeeMachine {
    private int waterNow;
    private int milkNow;
    private int beansNow;
    private int disposableCupsNow;
    private int moneyNow;

    Coffee[] coffeeTypes = new Coffee[3];

    public CoffeeMachine(int waterNow, int milkNow, int beansNow, int disposableCupsNow, int moneyNow) {
        this.waterNow = waterNow;
        this.milkNow = milkNow;
        this.beansNow = beansNow;
        this.disposableCupsNow = disposableCupsNow;
        this.moneyNow = moneyNow;
    }

    public int getWaterNow() {
        return waterNow;
    }

    public void setWaterNow(int waterNow) {
        this.waterNow = waterNow;
    }

    public int getMilkNow() {
        return milkNow;
    }

    public void setMilkNow(int milkNow) {
        this.milkNow = milkNow;
    }

    public int getBeansNow() {
        return beansNow;
    }

    public void setBeansNow(int beansNow) {
        this.beansNow = beansNow;
    }

    public int getDisposableCupsNow() {
        return disposableCupsNow;
    }

    public void setDisposableCupsNow(int disposableCupsNow) {
        this.disposableCupsNow = disposableCupsNow;
    }

    public int getMoneyNow() {
        return moneyNow;
    }

    public void setMoneyNow(int moneyNow) {
        this.moneyNow = moneyNow;
    }

    public void printIngredientsNow() {
        System.out.println("The coffee machine has:");
        System.out.println(this.waterNow + " of water");
        System.out.println(this.milkNow + " of milk");
        System.out.println(this.beansNow + " of coffee beans");
        System.out.println(this.disposableCupsNow + " of disposable cups");
        System.out.println("$" + this.moneyNow + " of money");
    }

    public void initializationOfCoffeeTypes(Coffee type1, Coffee type2, Coffee type3) {
        this.coffeeTypes[0] = type1;
        this.coffeeTypes[1] = type2;
        this.coffeeTypes[2] = type3;
    }

    private int countPossibleCoffeeAmount(Coffee coffee) {
        if (coffee == null) {
            System.err.println("Coffee type can not be null. You need to initialize the coffee type");
            System.exit(0);
        }
        int cupsCount = 0;
        int water = this.waterNow / coffee.getWater();
        int milk = coffee.getMilk() != 0 ? this.milkNow / coffee.getMilk() : -1;
        int beans = this.beansNow / coffee.getBeans();
        int cups = this.disposableCupsNow;
        while (water != 0 && milk != 0 && beans != 0 && cups != 0) {
            --water;
            --beans;
            --cups;
            milk = milk < 0 ? milk : --milk;
            ++cupsCount;
        }
        return cupsCount;
    }


    private void isPossibleToMakeCoffee(int type) {
        if (this.waterNow < this.coffeeTypes[type - 1].getWater()) {
            System.out.println("Sorry, not enough water!");
        } else if (this.milkNow < this.coffeeTypes[type - 1].getMilk()) {
            System.out.println("Sorry, not enough milk!");
        } else if (this.beansNow < this.coffeeTypes[type - 1].getBeans()) {
            System.out.println("Sorry, not enough coffee beans!");
        } else if (this.disposableCupsNow < this.coffeeTypes[type - 1].getDisposableCup()) {
            System.out.println("Sorry, not enough disposable cups!\n");
        } else {
            System.out.println("I have enough resources, making you a coffee!");
            makeCoffee(type);
        }
    }

    public void makeCoffee(int type) {
        this.waterNow -= this.coffeeTypes[type - 1].getWater();
        this.milkNow -= this.coffeeTypes[type - 1].getMilk();
        this.beansNow -= this.coffeeTypes[type - 1].getBeans();
        this.disposableCupsNow -= this.coffeeTypes[type - 1].getDisposableCup();
        this.moneyNow += this.coffeeTypes[type - 1].getMoney();
    }

    public void fill(int water, int milk, int beans, int cups) {
        this.waterNow += water;
        this.milkNow += milk;
        this.beansNow += beans;
        this.disposableCupsNow += cups;
    }

    public static void main(String[] args) {
        CoffeeMachine coffeeMachine = new CoffeeMachine(400, 540, 120, 9, 550);

        Coffee espresso = new Coffee(1, 250, 0, 16, 4, 1);
        Coffee latte = new Coffee(2, 350, 75, 20, 7, 1);
        Coffee cappuccino = new Coffee(3, 200, 100, 12, 6, 1);
        coffeeMachine.initializationOfCoffeeTypes(espresso, latte, cappuccino);

        do {
            chooseAction(coffeeMachine);
        }  while (true);
    }


    public static void chooseAction(CoffeeMachine coffeeMachine) {
        System.out.println("\nWrite action (buy, fill, take, remaining, exit): ");
        String action = new Scanner(System.in).nextLine();
        switch (action) {
            case "buy":
                actionBuy(coffeeMachine);
                break;
            case "fill":
                actionFill(coffeeMachine);
                break;
            case "take":
                actionTake(coffeeMachine);
                break;
            case "remaining":
                coffeeMachine.printIngredientsNow();
                break;
            case "exit":
                System.exit(0);
            default:
                System.err.println("Wrong action");
                break;
        }
    }

    public static void actionBuy(CoffeeMachine coffeeMachine) {
        System.out.println("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino, back - to main menu:");
        String line = new Scanner(System.in).nextLine();
        if (line.equals("back")) {
            return;
        }
        int type = Integer.parseInt(line);
        if (type >= 1 && type <= 3) {
            coffeeMachine.isPossibleToMakeCoffee(type);
        } else {
            System.err.println("Wrong type of coffee!");
        }
    }

    public static void actionFill(CoffeeMachine coffeeMachine) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Write how many ml of water do you want to add:");
        int water = scanner.nextInt();
        System.out.println("Write how many ml of milk do you want to add:");
        int milk = scanner.nextInt();
        System.out.println("Write how many grams of coffee beans do you want to add:");
        int beans = scanner.nextInt();
        System.out.println("Write how many disposable cups of coffee do you want to add:");
        int cups = scanner.nextInt();
        coffeeMachine.fill(water, milk, beans, cups);
    }

    public static void actionTake(CoffeeMachine coffeeMachine) {
        System.out.println("I gave you $" + coffeeMachine.getMoneyNow());
        coffeeMachine.setMoneyNow(0);
    }
}
