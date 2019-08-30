package machine;

import java.util.*;

public class CoffeeMachine {

    public static void main(String[] args) {

        CoffeeMachineItself coffeeMachine = new CoffeeMachineItself(400, 540, 120, 9, 550);
        CoffeeMachineItself.CurrentState currentState = CoffeeMachineItself.CurrentState.CHOOSING_AN_ACTION;

        boolean exit = false;

        while (!exit){
            printMainMenu();
            Scanner scanner = new Scanner(System.in);
            String choice = scanner.nextLine();

            switch(choice){
                case "buy":
                    printBuyCoffeeMenu();

                    switch(scanner.next()){
                        case "1":
                            coffeeMachine.buyEspresso();
                            break;
                        case "2":
                            coffeeMachine.buyLatte();
                            break;
                        case "3":
                            coffeeMachine.buyCappuccino();
                            break;
                        case "back":
                            break;
                        default:
                            System.out.println("Wrong instructions. Try again.");
                            break;
                    }
                    break;
                case "fill":
                    coffeeMachine.fillCoffeeMachine();
                    break;
                case "take":
                    coffeeMachine.withdrawMoney();
                    break;
                case "remaining":
                    coffeeMachine.printCoffeeMachineInfo();
                    break;
                case "exit":
                    exit = true;
                    break;
                default:
                    System.out.println("Wrong instruction. Try again.");
                    break;
            }
        }

    }

    public static void printMainMenu(){
        System.out.println("Write action: buy, fill, take, remaining, exit:");
    }

    public static void printBuyCoffeeMenu(){
        System.out.println("What would you like to buy? \n" +
                "1 - espresso, \n" +
                "2 - latte, \n" +
                "3 - cappuccino, \n" +
                "back - to main menu");
    }



}
