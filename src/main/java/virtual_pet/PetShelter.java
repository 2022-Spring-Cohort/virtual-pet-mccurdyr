package virtual_pet;

import java.util.ArrayList;
//"all" methods should be here

public class PetShelter {


    public ArrayList<Organic> backRoom;
    public ArrayList<Robotic> chargingStation;

    public PetShelter() {
        backRoom = new ArrayList<>();
        chargingStation = new ArrayList<>();
    }

    public void addRobotPet(Robotic pet) {
        chargingStation.add(pet);
    }

    public void addPet(Organic pet) {
        backRoom.add(pet);
    }
    public void adoptPet(String dogChoice) {
        Organic myPet = findAnimalByName(dogChoice);
        Robotic myBot = findBotByname(dogChoice);
        backRoom.remove(myPet);
        chargingStation.remove(myBot);
    }
    public void takePetIntoShelter() {
        Organic newDog = new Dog("Stray", 5, 5, 0);
        backRoom.add(newDog);
    }

    public void feedAllPets() {
        for (Organic currentPet : backRoom) {
            currentPet.feed();
        }
    }
    public void waterAllPets() {
        for (Organic currentPet : backRoom) {
            currentPet.water();
        }
    }
    public void cleanPetCages() {
        for (Organic currentPet : backRoom) {
            currentPet.cleanCages();
        }
    }

    public ArrayList<Organic> getBackRoom() {
        return backRoom;
    }
    public ArrayList<Robotic> getChargingStation() {
        return chargingStation;
    }

//    public void feedAnimalByName(String name){
//        feedAnimalInShelter(findAnimalByName(name));
//    }

    //    private void feedAnimalInShelter(Kingdom animal){
//        backRoom.get(backRoom.indexOf(animal)).feed();
//    }
    private Organic findAnimalByName(String name){
        for (Organic currentPet : backRoom) {
            if(currentPet.getName().equalsIgnoreCase(name)){
                return currentPet;
            }
        }
        return null;
    }
    private Robotic findBotByname(String name) {
        for (Robotic currentPet : chargingStation) {
            if(currentPet.getName().equalsIgnoreCase(name)){
                return currentPet;
            }
        }
        return null;
    }
}
