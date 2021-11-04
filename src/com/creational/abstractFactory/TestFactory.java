package com.creational.abstractFactory;

public class TestFactory {

    public static void main(String[] args) {
        Computer pc = ComputerFactory.getComputer(new PCFactory("2 GB","500 GB","2.4 GHz"));
        Computer server = ComputerFactory.getComputer(new ServerFactory("16 GB","750 GB","2.7 GHz"));
        System.out.println(pc.toString());
        System.out.println(server.toString());
    }
}
