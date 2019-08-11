package com.AllanRibeiro;

public class Main {

    public static void main(String[] args) {
        //"Wrong" way of coding
//      Player player =  new Player();
//      player.name = "Allan";
//      player.health = 20;
//      player.weapon = "Sword";
//
//      int damage = 10;
//      player.loseHealth(damage);
//      System.out.println("Remaining health = " + player.healthRemaining());
//
//      damage = 11;
//      player.health = 200;
//      player.loseHealth(damage);
//      System.out.println("Remaining health = " + player.healthRemaining());

        //Encapsulation way
        EnhancedPlayer player = new EnhancedPlayer("Allan",200,
                                                    "Sword");
        System.out.println("Initial health is = " + player.getHealth());
    }
}
