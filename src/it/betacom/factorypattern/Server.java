package it.betacom.factorypattern;

class Server extends Computer {
    public Server(int hd, int ram, String cpu) {
        super(hd, ram, cpu);
        if (ram < 32) {
            this.ram = 32; // Aggiungi la ram mancante
        }
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