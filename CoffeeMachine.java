package machine;

import java.util.Scanner;

public class CoffeeMachine {
    public static void whatTheMachineHas() {
        System.out.println("The coffee machine has:");
        System.out.println(coffeeMachineIngredients.getWater() + " of water");
        System.out.println(coffeeMachineIngredients.getMilk() + " of milk");
        System.out.println(coffeeMachineIngredients.getCoffeeBeans() + " of coffee beans");
        System.out.println(coffeeMachineIngredients.getDisposableCups() + " of disposable cups");
        System.out.println(coffeeMachineIngredients.getMoney() + " of money\n");
    }

    public static void buyAction() {
        Scanner scanner = new Scanner(System.in);
        int espressoWater = 250;
        int espressoCoffeeBeans = 16;
        int espressoMoney = 4;
        int latteWater = 350;
        int latteMilk = 75;
        int latteCoffeeBeans = 20;
        int latteMoney = 7;
        int cappuccinoWater = 200;
        int cappuccinoMilk = 100;
        int cappuccinoCoffeeBeans = 12;
        int cappuccinoMoney = 6;
        System.out.println("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino, back - to main menu:");
        System.out.print("> ");
        String whatCoffee = scanner.next();

        switch (whatCoffee) {
            case "1":
                if (coffeeMachineIngredients.getWater() < espressoWater ) {
                    System.out.println("Sorry, not enough water!\n");
                } else if (coffeeMachineIngredients.getCoffeeBeans() < espressoCoffeeBeans) {
                    System.out.println("Sorry, not enough coffee beans!\n");
                } else if (coffeeMachineIngredients.getDisposableCups() < 1) {
                    System.out.println("Sorry, not enough disposable cups!\n");
                } else {
                    coffeeMachineIngredients.setWater(coffeeMachineIngredients.getWater() - espressoWater);
                    coffeeMachineIngredients.setCoffeeBeans(coffeeMachineIngredients.getCoffeeBeans() - espressoCoffeeBeans);
                    coffeeMachineIngredients.setDisposableCups(coffeeMachineIngredients.getDisposableCups() - 1);
                    coffeeMachineIngredients.setMoney(coffeeMachineIngredients.getMoney() + espressoMoney);
                    System.out.println("I have enough resources, making you a espresso!\n");
                }
                break;
            case "2":
                if (coffeeMachineIngredients.getWater() < latteWater) {
                    System.out.println("Sorry, not enough water!\n");
                } else if (coffeeMachineIngredients.getMilk() < latteMilk) {
                    System.out.println("Sorry, not enough milk!\n");
                } else if (coffeeMachineIngredients.getCoffeeBeans() < latteCoffeeBeans) {
                    System.out.println("Sorry, not enough coffee beans!\n");
                } else if (coffeeMachineIngredients.getDisposableCups() < 1) {
                    System.out.println("Sorry, not enough disposable cups!\n");
                } else {
                    coffeeMachineIngredients.setWater(coffeeMachineIngredients.getWater() - latteWater);
                    coffeeMachineIngredients.setMilk(coffeeMachineIngredients.getMilk() - latteMilk);
                    coffeeMachineIngredients.setCoffeeBeans(coffeeMachineIngredients.getCoffeeBeans() - latteCoffeeBeans);
                    coffeeMachineIngredients.setDisposableCups(coffeeMachineIngredients.getDisposableCups() - 1);
                    coffeeMachineIngredients.setMoney(coffeeMachineIngredients.getMoney() + latteMoney);
                    System.out.println("I have enough resources, making you a coffee latte!\n");
                    break;
                }
            case "3":
                if (coffeeMachineIngredients.getWater() < cappuccinoWater) {
                    System.out.println("Sorry, not enough water!\n");
                } else if (coffeeMachineIngredients.getMilk() < cappuccinoMilk) {
                    System.out.println("Sorry, not enough milk!\n");
                } else if (coffeeMachineIngredients.getCoffeeBeans() < cappuccinoCoffeeBeans) {
                    System.out.println("Sorry, not enough coffee beans!\n");
                } else if (coffeeMachineIngredients.getDisposableCups() < 1) {
                    System.out.println("Sorry, not enough disposable cups!\n");
                } else {
                    coffeeMachineIngredients.setWater(coffeeMachineIngredients.getWater() - cappuccinoWater);
                    coffeeMachineIngredients.setMilk(coffeeMachineIngredients.getMilk() - cappuccinoMilk);
                    coffeeMachineIngredients.setCoffeeBeans(coffeeMachineIngredients.getCoffeeBeans() - cappuccinoCoffeeBeans);
                    coffeeMachineIngredients.setDisposableCups(coffeeMachineIngredients.getDisposableCups() - 1);
                    coffeeMachineIngredients.setMoney(coffeeMachineIngredients.getMoney() + cappuccinoMoney);
                    System.out.println("I have enough resources, making you a cappuccino!\n");
                    break;
                }
            case "back":
                mainMenu();
                break;
                default:
                    System.out.println("Wrong choose!");
        }
    }

    public static void fillAction() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Write how many ml of water do you want to add:");
        System.out.print("> ");
        int fillWater = scanner.nextInt();
        coffeeMachineIngredients.setWater(coffeeMachineIngredients.getWater() + fillWater);

        System.out.println("Write how many ml of milk do you want to add:");
        System.out.print("> ");
        int fillMilk = scanner.nextInt();
        coffeeMachineIngredients.setMilk(coffeeMachineIngredients.getMilk() + fillMilk);

        System.out.println("Write how many grams of coffee beans do you want to add:");
        System.out.print("> ");
        int fillCoffeeBeans = scanner.nextInt();
        coffeeMachineIngredients.setCoffeeBeans(coffeeMachineIngredients.getCoffeeBeans() + fillCoffeeBeans);

        System.out.println("Write how many disposable cups of coffee do you want to add:");
        System.out.print("> ");
        int fillDisposableCups = scanner.nextInt();
        coffeeMachineIngredients.setDisposableCups(coffeeMachineIngredients.getDisposableCups() + fillDisposableCups);
    }

    public static void takeAction() {
        int moneyTaken = coffeeMachineIngredients.getMoney();
        System.out.println("I gave you " + moneyTaken + "\n");
        coffeeMachineIngredients.setMoney(coffeeMachineIngredients.getMoney() - moneyTaken);
    }

    public static void mainMenu() {
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("Write action (buy, fill, take, remaining, exit)");
            System.out.print("> ");
            String action = scanner.nextLine();
            switch (action) {
                case "buy":
                    buyAction();
                    break;
                case "fill":
                    fillAction();
                    break;
                case "take":
                    takeAction();
                    break;
                case "remaining":
                    whatTheMachineHas();
                    break;
                case "exit":
                    System.exit(0);
                    break;
                default:
                    System.out.println("Wrong choose!");
            }
        } while (true);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean exit = false;

        mainMenu();
    }
}