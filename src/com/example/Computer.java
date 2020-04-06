package com.example;

public class Computer {
    private CdDrive cdDrive = new CdDrive();
    private Processor processor;
    private Ram ram;
    private HardDrive hardDrive;

    public Computer(){
        System.out.println("Induced constructor 'Computer'.");
        this.processor = new Processor();
        this.ram = new Ram();
        this.hardDrive = new HardDrive();
    }
}
