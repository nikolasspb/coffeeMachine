package machine;

import java.util.Scanner;

public class CoffeeMachine {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int water = 400;
        int milk = 540;
        int coffee = 120;
        int cups = 9;
        int money = 550;
        boolean repeat = true;
        while (repeat) {
            System.out.println("Write action (buy, fill, take, remaining, exit):");
            String answer = sc.nextLine();
            switch (answer) {
                case "buy":
                    System.out.println("\nWhat do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino, back - to main menu:");
                    String userChoice = sc.nextLine();
                    switch (userChoice) {
                        case "1":
                            if (water < 250) {
                                System.out.println("Sorry, not enough water!\n");
                            } else if (coffee < 16) {
                                System.out.println("Sorry, not enough coffee!\n");
                            } else if (cups < 1) {
                                System.out.println("Sorry, not enough cups!\n");
                            } else {
                                System.out.println("I have enough resources, making you a coffee!\n");
                                water -= 250;
                                coffee -= 16;
                                money += 4;
                                cups -= 1;
                            }
                            break;
                        case "2":
                            if (water < 350) {
                                System.out.println("Sorry, not enough water!\n");
                            } else if (milk < 75) {
                                System.out.println("Sorry, not enough milk!\n");
                            } else if (coffee < 20) {
                                System.out.println("Sorry, not enough coffee!\n");
                            } else if (cups < 1) {
                                System.out.println("Sorry, not enough cups!\n");
                            } else {
                                System.out.println("I have enough resources, making you a coffee!\n");
                                water -= 350;
                                milk -= 75;
                                coffee -= 20;
                                money += 7;
                                cups -= 1;
                            }
                            break;
                        case "3":
                            if (water < 200) {
                                System.out.println("Sorry, not enough water!\n");
                            } else if (milk < 100) {
                                System.out.println("Sorry, not enough milk!\n");
                            } else if (coffee < 12) {
                                System.out.println("Sorry, not enough coffee!\n");
                            } else if (cups < 1) {
                                System.out.println("Sorry, not enough cups!\n");
                            } else {
                                System.out.println("I have enough resources, making you a coffee!\n");
                                water -= 200;
                                milk -= 100;
                                coffee -= 12;
                                money += 6;
                                cups -= 1;
                            }
                            break;
                        case "back":
                            System.out.println();
                            break;
                        default:
                            System.out.println("Wrong choice");
                            break;
                    }
                    break;
                case "fill":
                    System.out.println("Write how many ml of water you want to add:");
                    water = water + Integer.parseInt(sc.nextLine());
                    System.out.println("Write how many ml of milk you want to add:");
                    milk = milk + Integer.parseInt(sc.nextLine());
                    System.out.println("Write how many grams of coffee beans you want to add:");
                    coffee = coffee + Integer.parseInt(sc.nextLine());
                    System.out.println("Write how many disposable cups of coffee you want to add:");
                    cups = cups + Integer.parseInt(sc.nextLine());
                    break;
                case "take":
                    System.out.println("I gave you $" + money);
                    money = 0;
                    break;
                case "remaining":
                    System.out.println();
                    printInfo(water, milk, coffee, cups, money);
                    break;
                case "exit":
                    repeat = false;
                    break;
                default:
                    System.out.println("Wrong choice");
                    break;
            }
        }
    }

    private static void printInfo(int water, int milk, int coffee, int cups, int money) {
        System.out.println("The coffee machine has:");
        System.out.println(water + " ml of water");
        System.out.println(milk + " ml of milk");
        System.out.println(coffee + " g of coffee beans");
        System.out.println(cups + " disposable cups");
        System.out.println("$" + money + " of money\n");
    }
}
