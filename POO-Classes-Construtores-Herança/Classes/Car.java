package com.AllanRibeiro;

public class Car {

    private int door;
    private int wheels;
    private String model;
    private String engine;
    private String color;

    public void setModel(String model){
        String validModel = model.toLowerCase();

        if (validModel.equals("carrera") || validModel.equals("comodor")) {
            this.model = model;
        }
        else {
            this.model = "Unknown";
        }
    }

    public String getModel(){
        return this.model;
    }

}
