package com.structural.flyway;

import java.util.Random;

public class CounterStrike {
    private static String[] playerType =
            {"Terrorist", "CounterTerrorist"};
    private static String[] weapons =
            {"AK-47", "Maverick", "Gut Knife", "Desert Eagle"};


    public static String getRandomPlayerType() {
        Random r = new Random();
        int randInt = r.nextInt(playerType.length);
        return playerType[randInt];
    }

    public static String getRandWeapon() {
        Random r = new Random();

        // Will return an integer between [0,5)
        int randInt = r.nextInt(weapons.length);

        // Return the weapon stored at index 'randInt'
        return weapons[randInt];
    }

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
         /* getPlayer() is called simply using the class
               name since the method is a static one */
            Player p = PlayerFactory.getPlayer(getRandomPlayerType());

            /* Assign a weapon chosen randomly uniformly
               from the weapon array  */
            p.assignWeapon(getRandWeapon());

            // Send this player on a mission
            p.mission();
        }
    }
}
