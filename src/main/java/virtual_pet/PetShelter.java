package virtual_pet;

import java.util.ArrayList;
//"all" methods should be here

public class PetShelter {


    public ArrayList<Kingdom> backRoom;
    public PetShelter() {
        backRoom = new ArrayList<>();
    }
    public void addPet(Kingdom pet) {
        backRoom.add(pet);

    }
    public void adoptPet(String dogChoice) {
        Kingdom myPet = findAnimalByName(dogChoice);
        backRoom.remove(myPet);
    }
    public void takePetIntoShelter() {
        Kingdom newDog = new Dog("Stray", 5, 5);
        backRoom.add(newDog);
    }

    public void feedAllPets() {
        for (Kingdom currentPet : backRoom) {
            currentPet.feed();
        }
    }
    public void waterAllPets() {
        for (Kingdom currentPet : backRoom) {
            currentPet.water();
        }
    }

    public ArrayList<Kingdom> getBackRoom() {
        return backRoom;
    }
//    public void feedAnimalByName(String name){
//        feedAnimalInShelter(findAnimalByName(name));
//    }

    //    private void feedAnimalInShelter(Kingdom animal){
//        backRoom.get(backRoom.indexOf(animal)).feed();
//    }
    private Kingdom findAnimalByName(String name){
        for (Kingdom currentPet : backRoom) {
            if(currentPet.getName().equalsIgnoreCase(name)){
                return currentPet;
            }
        }
        return null;
    }
}
