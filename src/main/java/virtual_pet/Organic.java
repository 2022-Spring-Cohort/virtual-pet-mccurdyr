package virtual_pet;
public abstract class Organic {
    //abstract fields
    protected String name;
    protected int hunger;
    protected int thirst;
    protected int cageFilth;


    //constructor
    public Organic(String name, int hunger, int thirst, int cageFilth) {
        this.name = name;
        this.hunger = hunger;
        this.thirst = thirst;
        this.cageFilth = cageFilth;
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

    public int getCageFilth() {
        return cageFilth;
    }

    //Tick and Untick
    public void tick() {
        hunger += 2;
        thirst += 2;
        cageFilth += 2;

        if (hunger > 20 ) {
            hunger = 20;
        }
        if (thirst > 20) {
            thirst = 20;
        }
        if (cageFilth > 20) {
            cageFilth = 20;
        }
    }
    public void unTick() {
        hunger -= 2;
        thirst -= 2;
        cageFilth -= 2;
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
    public void cleanCages() {
        cageFilth -= 5;
        if(cageFilth < 0 ) {
            cageFilth = 0;
        }
    }

    public void walk() {
        hunger += 2;
        thirst += 2;
    }

    //status
    public void status() {
        System.out.println("*******STATS*******" + "\nName: " + name + "\nThirst: " + thirst + "\nHunger: " + hunger);
    }


}
