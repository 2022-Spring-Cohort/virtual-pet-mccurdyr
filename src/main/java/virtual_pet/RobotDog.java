package virtual_pet;

public class RobotDog extends Robotic {


    public RobotDog(String name, int oil, int wearAndTear) {
        super(name, oil, wearAndTear);
    }


    @Override
    public String toString() {
        return "First Robot Dog: " + name +
                "\nOil: " + oil + "/10" +
                "\nWear and Tear: " + wearAndTear + "/10" +
                "\n ";
    }
}
