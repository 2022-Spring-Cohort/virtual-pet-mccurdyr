package virtual_pet;

import java.util.Scanner;

public class Game {

    PetShelter myShelter = new PetShelter();




    public void play(){
        Organic firstDog = new Dog("Charlie", 5, 5, 0);
        Organic secondDog = new Dog("Lassie", 5, 5, 0);
        Robotic firstRobotDog = new RobotDog("Sparky-001",5, 5);
        Robotic secondRobotDog = new RobotDog("Zippy-002", 5, 5);
        Organic firstCat = new Cat("Whiskers", 5, 5, 0);
        Organic secondCat = new Cat("Lily", 5, 5, 0);
        Robotic firstRobotCat = new RobotCat("S.C.R.A.T.C.H.", 5, 5);
        Robotic secondRobotCat = new RobotCat("B.I.T.E.", 5, 5);

//Create animals
        myShelter.addPet(firstDog);
        myShelter.addPet(secondDog);
        myShelter.addPet(firstCat);
        myShelter.addPet(secondCat);
        myShelter.addRobotPet(firstRobotDog);
        myShelter.addRobotPet(secondRobotDog);
        myShelter.addRobotPet(firstRobotCat);
        myShelter.addRobotPet(secondRobotCat);


        System.out.println("Welcome to the world of pet shop ownership!" +
                "\nHere's some animals! You can name your first two.");
//Name the animal
        //firstDog.setName();
        System.out.println("Enter name of your first dog.");
        Scanner dogNameDecision = new Scanner(System.in);
        String dogName = dogNameDecision.nextLine();
        firstDog.setName(dogName);
        System.out.println("Enter the name of your second dog.");
        String dogTwoName = dogNameDecision.nextLine();
        secondDog.setName(dogTwoName);



//play the game
        System.out.println("There are your dogs' statuses. Keep them fed and watered!");
        System.out.println("Type \"help\" to see a list of commands. " +
                "Type \"view\" to see how all the dogs are doing!");

        Scanner playerInput = new Scanner(System.in);
        while (true) {
            displayStats(myShelter);
//            String choice = playerInput.nextLine();
//            System.out.println(choice);



//here lies the menu functionality
            System.out.println("What will you do?");
            String choice = playerInput.nextLine();
            if (choice.equalsIgnoreCase("view")) {
                for (Organic currentPet: myShelter.getBackRoom()) {
                    currentPet.status();
                    currentPet.unTick();
                }
                for (Robotic currentPet: myShelter.getChargingStation()) {
                    currentPet.status();
                    currentPet.unTick();
                }
            }
            else if (choice.equalsIgnoreCase("help")) {
                System.out.println("Type \"view\" to see stats. \nType \"feed\" to feed the pets. " +
                        "\nType \"water\" to water them." +
                        "\nType \"adopt\" to adopt a dog out." +
                        "\nType \"admit\" to take a stray off the streets!" +
                        "\nType \"clean\" to clean your live animals' cages." +
                        "\nType \"oil\" to change the robots' oil." +
                        "\nType \"tuneup\" to take the robots to the mechanic." +
                        "\nType \"walk\" to take everyone on a walk!");

                for (Organic currentPet: myShelter.getBackRoom()) {
                    currentPet.unTick();
                }
                for (Robotic currentPet: myShelter.getChargingStation()) {
                    currentPet.unTick();
                }
            }
            else if (choice.equalsIgnoreCase("feed")) {
                myShelter.feedAllPets();
                System.out.println("All \"live\" animals have been fed!");
            }
            else if (choice.equalsIgnoreCase("water")) {
                myShelter.waterAllPets();
                System.out.println("The dogs have been watered!");
            }
            else if (choice.equalsIgnoreCase("adopt")) {
                System.out.println("Which pet do you wanna adopt?");
                String dogChoice = playerInput.nextLine();
                myShelter.adoptPet(dogChoice);
            }
            else if (choice.equalsIgnoreCase("admit")) {
                System.out.println("You took in a stray off the streets!");
                myShelter.takePetIntoShelter();
            }
            else if (choice.equalsIgnoreCase("cages")) {
                System.out.println("You cleaned all the \"real\" animals' cages!");
                myShelter.cleanPetCages();
            }
            else if (choice.equalsIgnoreCase("oil")) {
                for (Robotic currentPet : myShelter.getChargingStation()) {
                    currentPet.oilChange();
                }
            }
            else if (choice.equalsIgnoreCase("tuneup")) {
                for (Robotic currentPet : myShelter.getChargingStation()) {
                    currentPet.tuneUp();
                }
            }
            else if (choice.equalsIgnoreCase("walk")) {
                for (Organic currentPet : myShelter.getBackRoom()) {
                    currentPet.walk();
                }
                for (Robotic currentPet : myShelter.getChargingStation()) {
                    currentPet.tick();
                }

            }


        //ticks
            for (Organic currentPet: myShelter.getBackRoom()) {
                currentPet.tick();
            }
            for (Robotic currentPet: myShelter.getChargingStation()) {
                currentPet.tick();
            }




        }
































    }

    private void displayStats(PetShelter myShelter) {
        System.out.println("****Stats****");
        for (Organic currentPet: myShelter.getBackRoom()) {
            System.out.println(currentPet.getName() + ": Hunger = "+ currentPet.getHunger() + ": Thirst = " + currentPet.getThirst() + ": Cage Filth = " + currentPet.getCageFilth());
        }
        for (Robotic currentPet: myShelter.getChargingStation()) {
            System.out.println(currentPet.getName() + ": Oil Level = "+ currentPet.getOil() + ": Wear and Tear = " + currentPet.getWearAndTear());
        }
        System.out.println("***************");
    }
}
