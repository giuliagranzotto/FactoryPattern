package it.betacom.factorypattern;

class Notebook extends Computer {
    public Notebook(int hd, int ram, String cpu) {
        super(hd, ram, cpu);
    }

    @Override
    public int getHD() {
        return hd;
    }

    @Override
    public int getRam() {
        return ram;
    }

    @Override
    public String getCPU() {
        return cpu;
    }
}