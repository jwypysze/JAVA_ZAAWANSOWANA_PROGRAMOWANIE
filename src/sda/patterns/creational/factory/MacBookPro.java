package sda.patterns.creational.factory;

class MacBookPro extends MacBook {
    private int memory;
    private int disc;
    private int screenSize;

    MacBookPro(int memory, int disc) {
        this.memory = memory;
        this.disc = disc;
        this.screenSize = 14;
    }

    @Override
    public int getMemory() {
        return memory;
    }

    @Override
    public int getDisc() {
        return disc;
    }

    public int getScreenSize() {
        return screenSize;
    }
}
