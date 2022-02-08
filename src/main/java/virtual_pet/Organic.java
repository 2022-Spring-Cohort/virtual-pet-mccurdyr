package virtual_pet;
public abstract class Kingdom {
    //abstract fields
    protected String name;
    protected int hunger;
    protected int thirst;


    //constructor
    public Kingdom(String name, int hunger, int thirst) {
        this.name = name;
        this.hunger = hunger;
        this.thirst = thirst;
    }


    //setter

    public void setName(String name) {
        this.name = name;
    }


//getters

    public String getName() {
        return name;
    }

    public int getHunger() {
        return hunger;
    }

    public int getThirst() {
        return thirst;
    }

    //Tick and Untick
    public void tick() {
        hunger += 1;
        thirst += 1;

        if (hunger > 10 ) {
            hunger = 10;
        }
        if (thirst > 10) {
            thirst = 10;
        }
    }
    public void unTick() {
        hunger -= 1;
        thirst -= 1;
    }

    //care methods
    public void feed(){
        hunger -= 5;
        if (hunger < 0) {
            hunger = 0;
        }
    }
    public void water() {
        thirst -= 5;
        if (thirst < 0 ) {
            thirst = 0;
        }
    }

    //status
    public void status() {
        System.out.println("*******STATS*******" + "\nName: " + name + "\nThirst: " + thirst + "\nHunger: " + hunger);
    }


}
