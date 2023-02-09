package sda.practise.animals;

public abstract class Animal {
    public String move() {
        return "Animal " + getName() + " is moving";
    }

    public String sound() {
        return "Animal " + getName() + " makes a noise";
    }

    public abstract String getName();
}
