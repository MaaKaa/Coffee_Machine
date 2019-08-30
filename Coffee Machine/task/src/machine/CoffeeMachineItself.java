package machine;

import java.util.Scanner;

public class CoffeeMachineItself {
    private int water;
    private int milk;
    private int coffeeBeans;
    private int disposableCups;
    private int money;

    public enum CurrentState {
        CHOOSING_AN_ACTION, BUYING_COFFEE, FILLING, TAKING_MONEY, CHECKING_REMAINING,
    }


    public CoffeeMachineItself(int water, int milk, int coffeeBeans, int disposableCups, int money) {
        this.water = water;
        this.milk = milk;
        this.coffeeBeans = coffeeBeans;
        this.disposableCups = disposableCups;
        this.money = money;
    }

    public int getWater() {
        return water;
    }

    public void setWater(int water) {
        this.water = water;
    }

    public int getMilk() {
        return milk;
    }

    public void setMilk(int milk) {
        this.milk = milk;
    }

    public int getCoffeeBeans() {
        return coffeeBeans;
    }

    public void setCoffeeBeans(int coffeeBeans) {
        this.coffeeBeans = coffeeBeans;
    }

    public int getDisposableCups() {
        return disposableCups;
    }

    public void setDisposableCups(int disposableCups) {
        this.disposableCups = disposableCups;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public void buyEspresso(){
        if (this.getWater() < 250){
            System.out.println("Sorry, not enough water!");
        } else if (this.getCoffeeBeans() < 16){
            System.out.println("Sorry, not enough coffee beans!");
        } else if (this.getDisposableCups() < 1) {
            System.out.println("Sorry, not enough disposable cups!");
        } else {
            System.out.println("I have enough resources, making you a coffee!");
            water = water - 250;
            coffeeBeans = coffeeBeans - 16;
            disposableCups = disposableCups - 1;
            money = money + 4;
        }

    }

    public void buyLatte(){
        if (this.getWater() < 350){
            System.out.println("Sorry, not enough water!");
        } else if (this.getMilk() < 75){
            System.out.println("Sorry, not enough milk!");
        }else if (this.getCoffeeBeans() < 20){
            System.out.println("Sorry, not enough coffee beans!");
        } else if (this.getDisposableCups() < 1) {
            System.out.println("Sorry, not enough disposable cups!");
        } else {
            System.out.println("I have enough resources, making you a coffee!");
            water = water - 350;
            milk = milk - 75;
            coffeeBeans = coffeeBeans - 20;
            disposableCups =  disposableCups - 1;
            money = money + 7;
        }
    }

    public void buyCappuccino(){
        if (this.getWater() < 200){
            System.out.println("Sorry, not enough water!");
        } else if (this.getMilk() < 100){
            System.out.println("Sorry, not enough milk!");
        }else if (this.getCoffeeBeans() < 12){
            System.out.println("Sorry, not enough coffee beans!");
        } else if (this.getDisposableCups() < 1) {
            System.out.println("Sorry, not enough disposable cups!");
        } else {
            System.out.println("I have enough resources, making you a coffee!");
            water = water - 200;
            milk = milk - 100;
            coffeeBeans = coffeeBeans - 12;
            disposableCups = disposableCups - 1;
            money = money + 6;
        }
    }

    public void withdrawMoney(){
        System.out.println("I gave you: $" + this.getMoney());
        money = 0;
    }

    public void fillCoffeeMachine(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Write how many ml of water do you want to add:");
        int waterToAdd = scanner.nextInt();
        water = this.water + waterToAdd;
        System.out.println("Write how many ml of milk do you want to add");
        int milkToAdd = scanner.nextInt();
        milk = this.milk + milkToAdd;
        System.out.println("Write how many grams of coffee beans do you want to add");
        int coffeeBeansToAdd = scanner.nextInt();
        coffeeBeans = this.coffeeBeans + coffeeBeansToAdd;
        System.out.println("Write how many disposable cups of coffee do you want to add");
        int disposableCupsToAdd = scanner.nextInt();
        disposableCups = this.disposableCups + disposableCupsToAdd;
    }

    public void printCoffeeMachineInfo(){
        System.out.println("The coffee machine has: \n"
                + this.getWater() + " ml of water \n" + this.getMilk() + " ml of milk \n"
                + this.getCoffeeBeans() + " g of coffee beans \n"
                + this.getDisposableCups() + " of disposable cups \n"
                + "$" + this.getMoney() + " of money");
    }

    public void processUserInput(String userInput){

    }
}
