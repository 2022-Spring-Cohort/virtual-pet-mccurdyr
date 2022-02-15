package virtual_pet;

public class Robotic {
    //Fields
    protected String name;
    protected int oil;
    protected int wearAndTear;
//constructor
    public Robotic(String name, int oil, int wearAndTear) {
        this.name = name;
        this.oil = oil;
        this.wearAndTear = wearAndTear;
    }


    public Robotic(String name) {
    }

    //Getters
    public String getName() {
        return name;
    }

    public int getOil() {
        return oil;
    }

    public int getWearAndTear() {
        return wearAndTear;
    }


    //tick and untick
    public void tick() {
        oil -= 2;
        wearAndTear -= 2;

        if (oil < 0) {
            oil = 0;
        }
        if (wearAndTear < 0) {
            wearAndTear = 0;
        }
    }
    public void unTick() {
        oil += 2;
        wearAndTear += 2;
    }

    public void oilChange() {
        System.out.println("You changed the oil, everyone's squeak-free!");
        oil += 8;
        if (oil > 20) {
            oil = 20;
        }
    }

    public void tuneUp() {
        wearAndTear += 8;
        if (wearAndTear > 20) {
            wearAndTear = 20;
        }
    }

    public void status() {
        System.out.println("*******STATS*******" + "\nName: " + name + "\nOil: " + oil + "\nWear and Tear: " + wearAndTear);
    }




}
