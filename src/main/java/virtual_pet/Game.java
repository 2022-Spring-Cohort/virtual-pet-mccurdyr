package virtual_pet;
import java.util.Scanner;

public class Game {
    public Chimp lilR = new Chimp("", 5, 5, 5, 5);

    public String status = "status";
    public String menu = "menu";
    public String feed = "feed";
    public String water = "water";
    public String wash = "wash";
    public String play = "play";
    public String choice = "";
    public int randomNumber;



    public void play () {
        System.out.println("Welcome to the game!");
        System.out.println("Here's a chimp!");
        lilR.getName();
        System.out.println("Type \"status\" to see how I'm doing, or \"menu\" to see the menu.");



        while (true) {

            Scanner playerInput = new Scanner(System.in);

//            System.out.println(choice);


            //These decision variables
            String toughCall;
            String spank;





//these are the mood things
            if (lilR.getMood() <= 2) {

                lilR.randomNum();

                    if (randomNumber == 10 ) {

                        System.out.println("The monkey got a little bored, " +
                                "\nso he played with some stuff in the kitchen." +
                                "\nThe music was fun, but he broke all your dishes." +
                                "\nDo you spank the monkey?");

                        spank = playerInput.nextLine();
                            if (spank.equalsIgnoreCase("yes")) {
                                System.out.println("I'm no judge, but the chimp didn't love this. " +
                                        "The next thing you knew, you were blinded.");
                            } else if (spank.equalsIgnoreCase("no")) {
                                System.out.println("Violence is never the answer.");
                            }


                    }


                if (lilR.getMood() <= 0) {
                    System.out.println("***********\nYour chimp got too bored. It destroyed your home, leaving you" +
                            " with the" +
                            " cost of repairs. " +
                            "\nDo you call Animal Control?\n***********");
                    toughCall = playerInput.nextLine();
                    if (toughCall.equalsIgnoreCase("yes")) {
                        System.out.println("Unfortunately, they couldn't sedate your buddy. " +
                                "Maybe next time. X|");
                        break;
                    } else if (toughCall.equalsIgnoreCase("no")) {
                        System.out.println("Rather than watch your home be destroyed, you run in to " +
                                "try and stop the chimp. \nThe chimp didn't take kindly to this. >:( \nPlay again?");
                        break;
                    }

                }
            }

            if (lilR.getHunger() == 0) {
                System.out.println("Your chimp starved to death! Maybe don't play again?");
                break;
            }
            if (lilR.getThirst() == 0) {
                System.out.println("Your chimp died of dehydration! Brutal.");
                break;
            }
            if (lilR.getDirt() == 0) {
                System.out.println("You didn't clean your friend nearly enough. " +
                        "\nPoop is now your wallpaper, floor, and ceiling." +
                        "\nMaybe try again after you move?");
                break;
            }






















//here lies the menu functionality
        System.out.println("What will you do?");
        choice = playerInput.nextLine();
            if (choice.equalsIgnoreCase(status)) {
                lilR.status();
                lilR.unTick();
            }
            else if (choice.equalsIgnoreCase(menu)) {
                lilR.menu();
                lilR.unTick();
            }
            else if (choice.equalsIgnoreCase(feed)) {
                lilR.feed();
            }
            else if (choice.equalsIgnoreCase(water)) {
                lilR.water();
            }
            else if (choice.equalsIgnoreCase(wash)) {
                lilR.wash();
            }
            else if (choice.equalsIgnoreCase(play)) {
                lilR.mood();
            }






            lilR.tick();

        }













    }


























}

