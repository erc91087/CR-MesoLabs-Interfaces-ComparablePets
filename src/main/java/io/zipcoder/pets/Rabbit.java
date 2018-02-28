package io.zipcoder.pets;

public class Rabbit extends Pet{

    public Rabbit(String name) {
        super(name);
    }


    public String speak(){
        return "What's up, Doc?";
    }
}
