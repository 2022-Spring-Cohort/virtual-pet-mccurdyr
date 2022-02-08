package virtual_pet;

public class RobotCat  extends Robotic {


    public RobotCat(String name, int oil, int wearAndTear) {
        super(name, oil, wearAndTear);
    }


    @Override
    public String toString() {
        return "First Robot Cat: " + name +
                "\nOil: " + oil + "/10" +
                "\nWear and Tear: " + wearAndTear + "/10" +
                "\n ";
    }
}
