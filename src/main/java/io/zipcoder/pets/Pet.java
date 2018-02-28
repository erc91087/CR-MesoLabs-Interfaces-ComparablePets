package io.zipcoder.pets;

import java.util.Comparator;

//
public abstract class Pet implements Comparable<Pet>, Comparator<Pet> {

    private String name;

    Pet(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }


    public abstract String speak();

    public int compareByName(Pet pet) {

        return name.compareTo(pet.getName());
    }


    @Override
    public int compare(Pet o1, Pet o2) {
        int compare = o1.getClass().getSimpleName().compareTo(o2.getClass().getSimpleName());
        if(compare != 0) {
            return compare;
        }else {
            compare = o1.getName().compareTo(o1.getName());
            return compare;
        }

    }

    @Override
    public int compareTo(Pet p1) {

        int compare = this.getName().compareTo(p1.getName());
       // int compareClass = this.getClass().getSimpleName().compareTo(p1.getClass().getSimpleName());

        if (compare != 0) {
            return compare;
        }else {
            compare = this.getClass().getSimpleName().compareTo(p1.getClass().getSimpleName());
            return compare;
        }




//        return this.getName().compareTo(p1.getName());
//         this.getClass().getSimpleName().compareTo(p1.getClass().getSimpleName());

    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.getClass().getSimpleName() + ": " + this.getName());
        return sb.toString();
    }
}
