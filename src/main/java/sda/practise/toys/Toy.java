package sda.practise.toys;

public class Toy implements ToyInfo{
    private TypesOfToys name;
    private int minimumAge;
    private int price;

    public Toy(TypesOfToys name, int minimumAge, int price) {
        this.name = name;
        this.minimumAge = minimumAge;
        this.price = price;
    }

    public TypesOfToys getName() {
        return name;
    }

    public int getMinimumAge() {
        return minimumAge;
    }

    public int getPrice() {
        return price;
    }

    @Override
    public String toyInfo() {
        return new StringBuilder("Zabawka: ")
                .append(getName())
                .append(" ")
                .append(", minimalny wiek: ")
                .append(getMinimumAge())
                .append(", cena: ")
                .append(getPrice())
                .toString();
    }
}
