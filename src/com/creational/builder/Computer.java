package com.creational.builder;

public class Computer {

    //required parameters
    private String RAM;

    private String CPU;

    private String HDD;

    //optional parameters
    private Boolean isGraphicsCardEnabled;
    private Boolean isBluetoothEnabled;

    private Computer(ComputerBuilder builder) {
        this.CPU = builder.CPU;
        this.HDD = builder.HDD;
        this.RAM = builder.RAM;
        this.isBluetoothEnabled = builder.isBluetoothEnabled;
        this.isGraphicsCardEnabled = builder.isGraphicsCardEnabled;
    }

    @Override
    public String toString() {
        return "Computer{" +
                "RAM='" + RAM + '\'' +
                ", CPU='" + CPU + '\'' +
                ", HDD='" + HDD + '\'' +
                ", isGraphicsCardEnabled=" + isGraphicsCardEnabled +
                ", isBluetoothEnabled=" + isBluetoothEnabled +
                '}';
    }

    public String getRAM() {
        return RAM;
    }

    public String getCPU() {
        return CPU;
    }

    public String getHDD() {
        return HDD;
    }

    public Boolean isGraphicsCardEnabled() {
        return isGraphicsCardEnabled;
    }

    public Boolean isBluetoothEnabled() {
        return isBluetoothEnabled;
    }

    public static class ComputerBuilder {
        //required parameters
        private String RAM;

        private String CPU;

        private String HDD;

        //optional parameters
        private Boolean isGraphicsCardEnabled;
        private Boolean isBluetoothEnabled;

        public ComputerBuilder(String RAM, String CPU, String HDD) {
            this.RAM = RAM;
            this.CPU = CPU;
            this.HDD = HDD;
        }

        public ComputerBuilder setGraphicsCardEnabled(Boolean graphicsCardEnabled) {
            isGraphicsCardEnabled = graphicsCardEnabled;
            return this;
        }

        public ComputerBuilder setBluetoothEnabled(Boolean bluetoothEnabled) {
            isBluetoothEnabled = bluetoothEnabled;
            return this;
        }

        public Computer build() {
            return new Computer(this);
        }
    }
}
