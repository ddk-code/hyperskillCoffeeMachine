package machine;

enum MachineState {
    ON,
    CHOOSE_ACTION,
    CHOOSE_COFFEE,
    FILL_WATER,
    FILL_MILK,
    FILL_BEANS,
    FILL_CUPS
}

public class CoffeeMachine {
    private static int waterNow  = 400;
    private static int milkNow = 540;
    private static int beansNow = 120;
    private static int disposableCupsNow = 9;
    private static int moneyNow = 550;

    private static CoffeeTypes chosenCoffee;
    private static MachineState state = MachineState.ON;

    public static CoffeeTypes getChosenCoffee() {
        return chosenCoffee;
    }

    public static void setChosenCoffee(CoffeeTypes chosenCoffee) {
        CoffeeMachine.chosenCoffee = chosenCoffee;
    }

    public static MachineState getState() {
        return state;
    }

    public static void setState(MachineState state) {
        CoffeeMachine.state = state;
    }

    public static int getMoneyNow() {
        return moneyNow;
    }

    public static void setMoneyNow(int moneyNow) {
        CoffeeMachine.moneyNow = moneyNow;
    }

    public static void menu() {
        System.out.println();
        System.out.println("Write action (buy, fill, take, remaining, exit): ");
        state = MachineState.CHOOSE_ACTION;
    }

    public static void printIngredientsNow() {
        System.out.println();
        System.out.println("The coffee machine has:");
        System.out.println(waterNow + " of water");
        System.out.println(milkNow + " of milk");
        System.out.println(beansNow + " of coffee beans");
        System.out.println(disposableCupsNow + " of disposable cups");
        System.out.println("$" + moneyNow + " of money");
    }

    private static void isPossibleToMakeCoffee() {
        if (waterNow < chosenCoffee.water) {
            System.out.println("Sorry, not enough water!");
        } else if (milkNow < chosenCoffee.milk) {
            System.out.println("Sorry, not enough milk!");
        } else if (beansNow < chosenCoffee.beans) {
            System.out.println("Sorry, not enough coffee beans!");
        } else if (disposableCupsNow < chosenCoffee.cups) {
            System.out.println("Sorry, not enough disposable cups!\n");
        } else {
            System.out.println("I have enough resources, making you a coffee!");
            makeCoffee();
        }
    }

    public static void makeCoffee() {
        waterNow -= chosenCoffee.water;
        milkNow -= chosenCoffee.milk;
        beansNow -= chosenCoffee.beans;
        disposableCupsNow -= chosenCoffee.cups;
        moneyNow += chosenCoffee.money;
    }

    public static void main(String[] args) {

        do {
            if (state == MachineState.ON) {
                menu();
            }
        } while (readLine(InputLine.line()));
    }

    public static boolean readLine(String line) {
        switch (state) {
            case ON:
                menu();
                state = MachineState.CHOOSE_ACTION;
                break;
            case CHOOSE_ACTION:
                chooseAction(line);
                break;
            case CHOOSE_COFFEE:
                switch (line) {
                    case "1":
                        chosenCoffee = CoffeeTypes.ESPRESSO;
                        isPossibleToMakeCoffee();
                        state = MachineState.ON;
                        return true;
                    case "2":
                        chosenCoffee = CoffeeTypes.LATTE;
                        isPossibleToMakeCoffee();
                        state = MachineState.ON;
                        return true;
                    case "3":
                        chosenCoffee = CoffeeTypes.CAPPUCCINO;
                        isPossibleToMakeCoffee();
                        state = MachineState.ON;
                        return true;
                    case "back":
                        state = MachineState.ON;
                        return true;
                }
            case FILL_WATER:
                waterNow += Integer.parseInt(line);
                state = MachineState.FILL_MILK;
                System.out.println("Write how many ml of milk do you want to add:");
                break;
            case FILL_MILK:
                milkNow += Integer.parseInt(line);
                state = MachineState.FILL_BEANS;
                System.out.println("Write how many grams of coffee beans do you want to add:");
                break;
            case FILL_BEANS:
                beansNow += Integer.parseInt(line);
                state = MachineState.FILL_CUPS;
                System.out.println("Write how many disposable cups of coffee do you want to add:");
                break;
            case FILL_CUPS:
                disposableCupsNow += Integer.parseInt(line);
                state = MachineState.ON;
                break;
        }
        return true;
    }

    public static void chooseAction(String line) {
        switch (line) {
            case "buy":
                System.out.println("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino, back - to main menu:");
                state = MachineState.CHOOSE_COFFEE;
                break;
            case "fill":
                System.out.println("Write how many ml of water do you want to add:");
                state = MachineState.FILL_WATER;
                break;
            case "take":
                System.out.println("I gave you $" + getMoneyNow());
                setMoneyNow(0);
                state = MachineState.ON;
                break;
            case "remaining":
                printIngredientsNow();
                state = MachineState.ON;
                break;
            case "exit":
                System.exit(0);
            default:
                System.err.println("Wrong action");
                state = MachineState.ON;
                break;
        }
    }
}
