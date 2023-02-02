package sda.patterns.creational.abstractFactory;

public class FordOrderPoint {
    public static Ford orderYourDreamedFord (FordFactory factory) {
        System.out.println("Zamawiamy nowego Forda");
        return factory.createFord();
    }
}
