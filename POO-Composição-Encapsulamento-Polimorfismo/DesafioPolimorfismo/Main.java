package com.AllanRibeiro;

class Car{

    private boolean engine;
    private int cylinders;
    private int wheels;
    private String name;

    public Car(int cylinders, String name) {
        this.engine = true;
        this.cylinders = cylinders;
        this.wheels = 4;
        this.name = name;
    }

    public void startEngine(){
        System.out.println("Car is starting engine");
    }

    public void accelerate(){
        System.out.println("Car is accelerating");
    }

    public void stop(){
        System.out.println("Car has stopped");
    }

    public boolean isEngine() {
        return engine;
    }

    public int getCylinders() {
        return cylinders;
    }

    public int getWheels() {
        return wheels;
    }

    public String getName() {
        return name;
    }
}

class Etios extends Car{


    public Etios(int cylinders, String name) {
        super(cylinders, name);
    }

    @Override
    public void startEngine() {
        System.out.println(getName() + " has started engine");
    }

    @Override
    public void accelerate() {
        System.out.println(getName() + " is accelerating");
    }

    @Override
    public void stop() {
        System.out.println(getName() + " has stopped");
    }
}

class Civic extends Car{

    public Civic(int cylinders, String name) {
        super(cylinders, name);
    }


    @Override
    public void startEngine() {
        System.out.println(getName() + " has started engine");
    }

    @Override
    public void accelerate() {
        System.out.println(getName() + " is accelerating");
    }

    @Override
    public void stop() {
        System.out.println(getName() + " has stopped");
    }
}

class Corolla extends Car{

    public Corolla(int cylinders, String name) {
        super(cylinders, name);
    }

    @Override
    public void startEngine() {
        System.out.println(getName() + " has started engine");
    }

    @Override
    public void accelerate() {
        System.out.println(getName() + " is accelerating");
    }

    @Override
    public void stop() {
        System.out.println(getName() + " has stopped");
    }
}


public class Main {

    public static void main(String[] args) {

        Etios etios = new Etios(4,
                            "Toyota Etios");

        etios.startEngine();
        etios.accelerate();
        etios.stop();

        Civic civic = new Civic(4,
                            "Honda Civic");
        civic.startEngine();
        civic.accelerate();
        civic.stop();

        Corolla corolla = new Corolla(4,
                                "Toyota Corolla");
        corolla.startEngine();
        corolla.accelerate();
        corolla.stop();

    }
}
