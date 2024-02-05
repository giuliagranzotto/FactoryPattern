package it.betacom.factorypattern;

public class Main {
    public static void main(String[] args) {
        Computer notebook = ComputerFactory.getComputer(8, "i7", 512, "Notebook");
        System.out.println(notebook);
    }
}