package com.AllanRibeiro;

public class Animal {
    //Attributes
    private String name;
    private int brain;
    private int body;
    private int size;
    private int weight;

    //Constructor
    public Animal(String name,int brain, int body, int size, int weight) {
        this.name = name;
        this.brain = brain;
        this.body = body;
        this.size = size;
        this.weight = weight;
    }

    public void eat(){
        System.out.println("Animal.eat() called");
    }

    public void move(int speed){
        System.out.println("Animal.move() called. is moving at " + speed);
    }


    //getter

    public int getBrain() {
        return brain;
    }

    public int getBody() {
        return body;
    }

    public int getSize() {
        return size;
    }

    public int getWeight() {
        return weight;
    }
}
