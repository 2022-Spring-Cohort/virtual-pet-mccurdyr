package virtual_pet;

public class Dog  extends Organic {

    public Dog(String name, int hunger, int thirst, int cageFilth) {
        super(name, hunger, thirst, cageFilth);
    }



    @Override
    public String toString() {
        return "First Dog: " + name +
                "\nHunger: " + hunger + "/10" +
                "\nThirst: " + thirst + "/10" +
                "\nCage Filth: " + cageFilth + "/10";
    }


}
