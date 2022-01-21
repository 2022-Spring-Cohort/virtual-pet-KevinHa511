package virtual_pet;

import java.util.Scanner;

public class VirtualPetApp {

    private static Dog Diesel = new Dog("Diesel", 3, 10, 10, 10, 10);

    public static void main(String[] args) {
        System.out.println("Welcome to the virtual Pet game!");
        getStatus();
        System.out.println("Please select the following");
        GiveRules();


        while (maxiumumLimit()) {

            Scanner scanner1 = new Scanner(System.in);
            int playerChoice = Integer.valueOf(scanner1.next());
            if (playerChoice == 1) {
                Diesel.feedDog();
                System.out.println("Thanks for feeding me Hooooooman!");


            } else if (playerChoice == 2) {
                Diesel.waterDog();
                System.out.println("Wow I was thirsty!");
            } else if (playerChoice == 0) {
                GiveRules();
            } else if (playerChoice == 9) {
                System.out.println("...Hi");
            } else if (playerChoice == 3) {
                getStatus();
            } else if (playerChoice == 4) {
                Diesel.sleepDog();
                System.out.println("Ohhhh I needed that nap!");
            } else if (playerChoice == 5) {
                Diesel.playDog();
                System.out.println("Squirrel!!!");
            }
            if (playerChoice != 0) {
                Diesel.tick();
                getStatus();

            }
            System.out.println("What would you like to do?");
        }
        System.out.println("Sorry Diesel died.");


    }

    private static void GiveRules() {
        System.out.println("0 - Press zero for instructions.");
        System.out.println("1 - Feed Diesel some food.");
        System.out.println("2 - Give Diesel some water.");
        System.out.println("3 - To get Diesel's status.");
        System.out.println("4 - To have Diesel sleep.");
        System.out.println("5 - To play with Diesel.");
        System.out.println("9 - To do nothing.");
    }

    private static void getStatus() {
        System.out.println("Diesel's hunger level is " + Diesel.getHungry());
        System.out.println("Diesel's thirst level is " + Diesel.getThirsty());
        System.out.println("Diesel's Stamina level is " + Diesel.getStamina());
        System.out.println("Diesel's Happiness level is " + Diesel.getHappiness());

    }


    private static boolean maxiumumLimit() {
        return Diesel.getHungry() < 20 && Diesel.getThirsty() < 20;
    }


}
