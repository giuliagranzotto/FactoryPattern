package it.betacom.factorypattern;

public abstract class Computer {
    protected int hd;
    protected int ram;
    protected String cpu;

    public Computer(int hd, int ram, String cpu) {
        this.hd = hd;
        this.ram = ram;
        this.cpu = cpu;
    }

    public abstract int getHD();

    public abstract int getRam();

    public abstract String getCPU();

    @Override
    public String toString() {
        return "hd=" + getHD() + ", ram=" + getRam() + ", cpu=" + getCPU();
    }
}
