package com.AllanRibeiro;

public class Main {

    public static void main(String[] args) {

        Wall wall1 = new Wall("West");
        Wall wall2 = new Wall("South");
        Wall wall3 = new Wall("North");
        Wall wall4 = new Wall("East");

        Ceilling ceilling = new Ceilling(12,55);

        Bed bed = new Bed("mordern", 4,2,2,1);

        Lamp lamp = new Lamp("Classic", false,75);

        Bedroom bedroom = new Bedroom("Tim's",wall1,wall2,wall3,wall4,ceilling,
                                        bed, lamp );
        bedroom.makeBed();
        bedroom.getLamp().turnOn();
    }
}
