package com.structural.flyway;

public class Terrorist implements Player {
    //Intrinsic attribute
    private final String TASK;

    //Extrinsic attribute
    private String weapon;

    public Terrorist() {
        TASK = "PLANT A BOMB";
    }

    @Override
    public void assignWeapon(String weapon) {
        this.weapon = weapon;
    }

    @Override
    public void mission() {
        System.out.println("Terrorist with weapon "
                + weapon + "|" + " Task is " + TASK);
    }
}
