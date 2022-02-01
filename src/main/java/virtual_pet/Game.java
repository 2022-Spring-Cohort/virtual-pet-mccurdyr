package virtual_pet;

import java.util.ArrayList;
import java.util.Scanner;

public class Game {

    PetShelter myShelter = new PetShelter();




    public void play(){
        Kingdom firstDog = new Dog("Charlie", 5, 5);
        Kingdom secondDog = new Dog("Lassie", 5, 5);

//Create animals
        myShelter.addPet(firstDog);
        myShelter.addPet(secondDog);

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
                firstDog.status();
                firstDog.unTick();
                secondDog.status();
                secondDog.unTick();
            }
            else if (choice.equalsIgnoreCase("help")) {
                System.out.println("Type \"view\" to see stats. \nType \"feed\" to feed the pets. " +
                        "\nType \"water\" to water them." +
                        "\nType \"adopt\" to adopt a dog out." +
                        "\nType \"admit\" to take a stray off the streets!");
                firstDog.unTick();
                secondDog.unTick();
            }
            else if (choice.equalsIgnoreCase("feed")) {
                myShelter.feedAllPets();
                System.out.println("The dogs have been fed!");
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





            firstDog.tick();
            secondDog.tick();



        }
































    }

    private void displayStats(PetShelter myShelter) {
        System.out.println("****Stats****");
        for (Kingdom currentPet: myShelter.getBackRoom()) {
            System.out.println(currentPet.getName() + ": Hunger = "+ currentPet.getHunger() + ": Thirst = " + currentPet.getThirst());
        }
        System.out.println("***************");
    }
}
