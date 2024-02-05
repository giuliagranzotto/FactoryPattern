package it.betacom.factorypattern;

class Desktop extends Computer {
    public Desktop(int hd, int ram, String cpu) {
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