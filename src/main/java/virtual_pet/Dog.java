package virtual_pet;

public class Dog  extends Kingdom {

    public Dog(String name, int hunger, int thirst) {
        super(name, hunger, thirst);
    }



    @Override
    public String toString() {
        return "First Dog: " + name +
                "\nHunger: " + hunger + "/10" +
                "\nThirst: " + thirst + "/10" +
                "\n ";
    }


}
