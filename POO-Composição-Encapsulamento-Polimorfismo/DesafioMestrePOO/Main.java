package com.AllanRibeiro;

import java.util.function.DoubleToIntFunction;

public class Main {

    public static void main(String[] args) {
        Hamburguer hb = new Hamburguer("Basic","Sausage",3.56,"white");
        double price = hb.itemizeHamburguer();

        hb.addHamburguerAddition1("Tomato",0.27);
        hb.addHamburguerAddition2("Lettuce", 0.75);
        hb.addHamburguerAddition3("Cheese", 1.13);
        System.out.println("Total Burguer price is " + hb.itemizeHamburguer());

        HealthyBurguer healthyBurguer = new HealthyBurguer("Bacon", 5.67);
        healthyBurguer.addHamburguerAddition1("Egg", 5.43);
        healthyBurguer.addHealthAddition1("Lentils", 3.41);
        System.out.println("Total Burguer price is " + healthyBurguer.itemizeHamburguer());

        DeluxeBurguer deluxeBurguer = new DeluxeBurguer();
        deluxeBurguer.addHamburguerAddition3("Should not do this", 50.53);
        deluxeBurguer.itemizeHamburguer();


    }
}
