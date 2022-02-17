package virtual_pet;
import java.util.Scanner;
public class VirtualPetApp {

    Scanner petScan = new Scanner(System.in);

    public static void main(String[] args) {
        VirtualPetApp myApp = new VirtualPetApp();
        myApp.gameLoop();
    }

    public void gameLoop() {
        String userChoice = "";
        vPetShelter1 myShelter = new vPetShelter1();
        do{
            System.out.println("Hello welcome to the Virtual Pet game!! \n");
            System.out.println("Here is the status of all the pets.");
            System.out.println(myShelter.getPets());
            shelterStatus(myShelter);
            System.out.println("What would you like to do next?.");
            System.out.println("1. Feed the pets.");
            System.out.println("2. Give all the pets a drink of water.");
            System.out.println("3. Play with a pet.");
            System.out.println("4. surrender a pet.");
            System.out.println("5. Adopt a pet.");
            System.out.println("6. Play with all the pets");
            System.out.println("7. Feed a specific pet");
            System.out.println("8. Water a specific pet");
            System.out.println("9. Walk a pet");
            System.out.println("10. Quit");
            userChoice = petScan.nextLine();

            switch (userChoice) {

                case "1":
                    myShelter.feedAllPets();
                    System.out.println("All pets have been fed!");
                    break;

                case "2":
                    myShelter.GiveWaterToAll();
                    System.out.println("All pets have fluid!");
                    break;

                case "3":
                    System.out.println("What is the name of the pet you would like to play with?");
                    String petName = petScan.nextLine();
                    VirtualPets myPet = myShelter.getPetByName(petName);
                    myPet.playPet();
                    System.out.println(myPet.getName() + "had a great time!");
                    break;

                case "4":
                    System.out.println("What is the pets name?");
                    String name = petScan.nextLine();
                    System.out.println("What is the pets description?");
                    String description = petScan.nextLine();
                    System.out.println("Do you want an organic pet or a robotic pet?");
                    String roboticOrganicResponse = petScan.nextLine();
                    if (roboticOrganicResponse.equalsIgnoreCase("robotic")) {
                        System.out.println("Do you want a cat or a dog?");
                        String catOrDogResponse = petScan.nextLine();
                        if (catOrDogResponse.equalsIgnoreCase("cat")) {
                            RoboPets myRoboCat = new RoboCat(name, description, 50,50,50);
                            myShelter.surrenderPet(myRoboCat);

                        }
                        else if (catOrDogResponse.equalsIgnoreCase("dog")) {
                            RoboPets myRoboDog = new RoboDog(name, description, 50,50,50);
                            myShelter.surrenderPet(myRoboDog);
                        }
                    }

                    else if (roboticOrganicResponse.equalsIgnoreCase("organic")) {
                        System.out.println("Do you want a cat or a dog?");
                        String roboCatOrDogResponse = petScan.nextLine();

                        if (roboCatOrDogResponse.equalsIgnoreCase("cat")) {
                            OrganicPets myCat = new OrganicCat(name, description, 50, 50,50,50);
                            myShelter.surrenderPet(myCat);
                            System.out.println(myShelter.getPets());
                        }
                        else if (roboCatOrDogResponse.equalsIgnoreCase("dog")) {
                            OrganicPets myDog = new OrganicDog(name, description, 50,50,50,50);
                            myShelter.surrenderPet(myDog);
                        }
                    }
                    break;

                case "5":
                    System.out.println("What pet do you want to adopt?");
                    String adoptName = petScan.nextLine();
                    myShelter.adoptPet(myShelter.getPetByName(adoptName));
                    break;

                case "6":
                    myShelter.playAll();
                    System.out.println("All the pets had a dang ole good time!");
                    break;

                case "7":
                    System.out.println("What pet would you like to feed");
                    String feedName = petScan.nextLine();
                    VirtualPets myPetFeed = myShelter.getPetByName(feedName);
                    myPetFeed.energize();
                    System.out.println(myPetFeed.getName() + " feels energized!");
                    break;

                case "8":
                    System.out.println("What pet would you like to give fluid?");
                    String fluidName = petScan.nextLine();
                    VirtualPets myPetFluid = myShelter.getPetByName(fluidName);
                    myPetFluid.fluid();
                    System.out.println(myPetFluid.getName() + " feels lubricated!");
                    break;

                case "9":
                    System.out.println("What pet would you like to walk?");
                    String walkName = petScan.nextLine();
                    VirtualPets myPetWalk = myShelter.getPetByName(walkName);
                    myPetWalk.walk();
                    System.out.println(myPetWalk.getName() + " went on a walk!");
                    break;

                default:
                    System.out.println("Please enter a valid response.");

            }

            myShelter.tick();
        }

        while (userChoice != "10");

    }

    private void shelterStatus(vPetShelter1 shelter) {
        for(VirtualPets pet: shelter.getPets()){
            System.out.println("Pet: "+ pet.getName());
        }
    }
}




