package machine;
import java.util.Scanner;

public class CoffeeMachine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int water = 400;
        int milk = 540;
        int beans = 120;
        int cups = 9;
        int money = 550;
        System.out.println("Write action (buy, fill, take, remaining, exit):");
        String input = scanner.next();
        System.out.println();
        while(!input.equals("exit")) {
            if(input.equals("buy")){
                System.out.println("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino, back - to main menu: ");
                String coffee = scanner.next();
                if(coffee.equals("1")) {
                    if(water < 250) {
                        System.out.println("Sorry, not enough water!");
                    } else if(beans < 16) {
                        System.out.println("Sorry, not enough coffee beans!");
                    } else if (cups < 1) {
                        System.out.println("Sorry, not enough disposable cups!");
                    } else {
                        System.out.println("I have enough resources, making you a coffee!\n");
                        water -= 250;
                        beans -= 16;
                        money += 4;
                        cups -= 1;
                    }
                } else if(coffee.equals("2")) {
                    if(water < 350) {
                        System.out.println("Sorry, not enough water!");
                    } else if(milk < 75) {
                        System.out.println("Sorry, not enough milk!");
                    } else if(beans < 20) {
                        System.out.println("Sorry, not enough coffee beans!");
                    } else if (cups < 1) {
                        System.out.println("Sorry, not enough disposable cups!");
                    } else {
                        System.out.println("I have enough resources, making you a coffee!\n");
                        water -= 350;
                        milk -= 75;
                        beans -= 20;
                        money += 7;
                        cups -= 1;
                    }
                } else if(coffee.equals("3")) {
                    if(water < 200) {
                        System.out.println("Sorry, not enough water!");
                    } else if(milk < 100) {
                        System.out.println("Sorry, not enough milk!");
                    } else if(beans < 12) {
                        System.out.println("Sorry, not enough coffee beans!");
                    } else if (cups < 1) {
                        System.out.println("Sorry, not enough disposable cups!");
                    } else {
                        System.out.println("I have enough resources, making you a coffee!\n");
                        water -= 200;
                        milk -= 100;
                        beans -= 12;
                        money += 6;
                        cups -= 1;
                    }
                }
            } else if(input.equals("fill")) {
                System.out.println("Write how many ml of water you want to add:");
                water += scanner.nextInt();
                System.out.println("Write how many ml of milk you want to add:");
                milk += scanner.nextInt();
                System.out.println("Write how many grams of coffee beans you want to add:");
                beans += scanner.nextInt();
                System.out.println("Write how many disposable cups of coffee you want to add:");
                cups += scanner.nextInt();
            } else if(input.equals("take")) {
                System.out.println("I gave you $" + money);
                money = 0;
            } else {
                print(water, milk, beans, cups, money);
            }
            System.out.println("Write action (buy, fill, take, remaining, exit):");
            input = scanner.next();
            System.out.println();
        }
    }

    public static void print(int water, int milk, int beans, int cups, int money) {
        System.out.println("The coffee machine has:");
        System.out.println(water + " ml of water");
        System.out.println(milk + " ml of milk");
        System.out.println(beans + " g of coffee beans");
        System.out.println(cups + " disposable cups");
        System.out.println("$" + money + " of money\n");
    }
}
