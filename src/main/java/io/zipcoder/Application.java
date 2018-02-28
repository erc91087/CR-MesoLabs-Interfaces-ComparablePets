package io.zipcoder;


import io.zipcoder.pets.Cat;
import io.zipcoder.pets.Dog;
import io.zipcoder.pets.Pet;
import io.zipcoder.pets.Rabbit;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Application {
    List<Pet> pets = new ArrayList<Pet>();
    Integer numberOfPets;


    public Application() {
        numberOfPets = 0;
    }

    public int askForNumberOfPets() {
        Scanner userInput = new Scanner(System.in);
        System.out.println("How many pets do you have?");
        numberOfPets = userInput.nextInt();
        return numberOfPets;
    }

    public void askForPetInfo() {
        Scanner infoInput = new Scanner(System.in);
        for (int i = 0; i < numberOfPets; i++) {
            System.out.println("What kind of pet do you have?");
            String typeOfPet = infoInput.nextLine();

            System.out.println("What's the name of the pet?");
            String petName = infoInput.nextLine();
        }
    }

public String printPetList(List<Pet> pets){
        StringBuilder sb = new StringBuilder();
        for(Pet pet : pets) {
            sb.append((pet.getName()) + ": " + pet.speak() + "\n");
        }
        return sb.toString();
}

    public void addPet(String petType, String petName) {
        Pet thePet;
        if(petType.equalsIgnoreCase("dog")) {
            thePet = new Dog(petName);
            this.pets.add(thePet);
        }
        else if(petType.equalsIgnoreCase("cat")) {
            thePet = new Cat(petName);
            this.pets.add(thePet);
        }
        else if(petType.equalsIgnoreCase("rabbit")) {
            thePet = new Rabbit(petName);
            this.pets.add(thePet);
        }
    }

    public void sortPets(List<Pet> pets) {
        Collections.sort(pets);
    }
}
