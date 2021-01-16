package machine;

public class Coffee {
    final private int type;
    final private int water;
    final private int milk;
    final private int beans;
    final private int money;
    final private  int disposableCup;

    public Coffee(int type, int water, int milk, int coffeeBeans, int money, int disposableCup) {
        this.type = type;
        this.water = water;
        this.milk = milk;
        this.beans = coffeeBeans;
        this.money = money;
        this.disposableCup = disposableCup;
    }

    public int getType() {
        return type;
    }

    public int getWater() {
        return water;
    }

    public int getMilk() {
        return milk;
    }

    public int getBeans() {
        return beans;
    }

    public int getMoney() {
        return money;
    }

    public int getDisposableCup() {
        return disposableCup;
    }
}
