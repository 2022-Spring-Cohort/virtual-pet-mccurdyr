package virtual_pet;

public class Cat extends Organic {

    public Cat(String name, int hunger, int thirst, int cageFilth) {
        super(name, hunger, thirst, cageFilth);
    }



    @Override
    public String toString() {
        return "First Cat: " + name +
                "\nHunger: " + hunger + "/10" +
                "\nThirst: " + thirst + "/10" +
                "\n ";
    }


}
