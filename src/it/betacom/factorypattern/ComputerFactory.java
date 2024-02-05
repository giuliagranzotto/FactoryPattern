package it.betacom.factorypattern;

public class ComputerFactory {
    public static Computer getComputer(int ram, String cpu, int hd, String tipoComputer) {
        if (tipoComputer.equalsIgnoreCase("Desktop")) {
            return new Desktop(hd, ram, cpu);
        } else if (tipoComputer.equalsIgnoreCase("Server")) {
            return new Server(hd, ram, cpu);
        } else if (tipoComputer.equalsIgnoreCase("Notebook")) {
            return new Notebook(hd, ram, cpu);
        }
        return null;
    }
}