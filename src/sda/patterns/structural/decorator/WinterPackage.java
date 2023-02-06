package sda.patterns.structural.decorator;

public class WinterPackage extends CarDecorator {

    private boolean heatedMirrors;
    private boolean heatedSeats;

    public WinterPackage(Car car, boolean heatedMirrors, boolean heatedSeats) {
        super(car);
        this.heatedMirrors = heatedMirrors;
        this.heatedSeats = heatedSeats;
    }

    @Override
    public void assemble() {
        super.assemble();
        System.out.println("Adding winter features " + (heatedMirrors ? " with heated mirrors" : "") + (heatedSeats ? "with heated seats" : ""));
    }
}
