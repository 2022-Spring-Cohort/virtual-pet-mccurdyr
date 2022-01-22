package virtual_pet;

import java.util.Random;
import java.util.Scanner;

public class Chimp {
    //attributes
    private String name;
    private int hunger;
    private int thirst;
    private int dirt;
    private int mood;

    //constructors
    public Chimp(String name, int hunger, int thirst, int dirt, int mood) {
        this.name = name;
        this.hunger = hunger;
        this.thirst = thirst;
        this.dirt = dirt;
        this.mood = mood;
    }
    //accessors
    public String getName() {
        System.out.println("What do you wanna name your chimp?");
        Scanner chimpName = new Scanner(System.in);
        name = chimpName.nextLine();
        return name;
    }
    public int getHunger() {
        return hunger;
    }
    public int getThirst() {
        return thirst;
    }
    public int getDirt() {
        return dirt;
    }
    public int getMood() {
        return mood;
    }

//tick and untick
    public void tick() {
        hunger -= 1;
        thirst -= 1;
        dirt += 1;
        mood -= 1;

        if (hunger > 10) {
            hunger = 10;
        }
        if (thirst > 10) {
            thirst = 10;
        }
        if (dirt > 10) {
            dirt = 10;
        }
    }
    public void unTick() {
        hunger += 1;
        thirst += 1;
        dirt -= 1;
        mood += 1;
    }
//random number generator
    public int randomNum() {
        int randomNumber;
        randomNumber = new Random().nextInt((10 - 1 + 1) +1);
        return randomNumber;


    }

//interaction methods
    public void status() {
        System.out.println("Name: " + name + "\nStomach fullness: " + this.getHunger() +
                "\nHydration: " + this.getThirst() + "\nDirt: " + this.getDirt() +
                "\nMood: " + this.getMood());
    }
    public void menu() {
        System.out.println("Take care of me! Type the following commands to take care of me." +
                "\n-Feed \n-Water \n-Wash \n-Play");
    }

    public void feed() {
        hunger += 3;
        if (hunger > 10) {
            hunger = 10;
        }
        System.out.println("OOOOH! :D");
        System.out.println("Stomach fullness is at " + getHunger());
    }
    public void water() {
        thirst += 3;
        if (thirst > 10) {
            thirst = 10;
        }
        System.out.println("*sluuuuurp*");
        System.out.println("Hydration has been increased to " + getThirst());
    }
    public void wash() {
        dirt -= 5;
        if (dirt < 0 ) {
            dirt = 0;
        }
        System.out.println("Have fun with the hair.");
        System.out.println("Filth has been reduced to " + getDirt());
    }
    public void mood() {
        mood += 5;
        if (mood > 10) {
            mood = 10;
        }
        System.out.println("OOOH OOH EEEE :D");
        System.out.println("Mood has increased to " + getMood());
    }















}




