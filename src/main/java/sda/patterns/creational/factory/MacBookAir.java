package sda.patterns.creational.factory;

class MacBookAir extends MacBook {
    private int memory;
    private int disc;
    private int screenSize;

    MacBookAir(int memory, int disc, int screenSize) {
        this.memory = memory;
        this.disc = disc;
        this.screenSize = screenSize;
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
