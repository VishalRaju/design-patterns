package com.creational.builder;

public class TestBuilder {

    public static void main(String[] args) {
        Computer computer = new Computer.ComputerBuilder("8GB", "2.7Ghz", "100TB")
                .setGraphicsCardEnabled(true).build();
        System.out.println(computer.toString());
    }

}
