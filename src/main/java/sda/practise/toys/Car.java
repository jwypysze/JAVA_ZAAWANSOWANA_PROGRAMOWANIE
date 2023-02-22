package sda.practise.toys;

public class Car extends Toy implements ToyInfo{

    private String model;
    private String colour;
    private int numberOfDoors;
    private boolean isUsed;
    private String size;

    public Car(TypesOfToys name,
               int minimumAge, int price, String model, String colour, int numberOfDoors,
               boolean isUsed, String size) {
        super(name, minimumAge, price);
        this.model = model;
        this.colour = colour;
        this.numberOfDoors = numberOfDoors;
        this.isUsed = isUsed;
        this.size = size;
    }

    @Override
    public String toyInfo(){
        return new StringBuilder(super.toyInfo())
                .append(", model: ")
                .append(getModel())
                .append(", kolor: ")
                .append(getColour())
                .append(", liczba drzwi: ")
                .append(getNumberOfDoors())
                .append(", czy jest używany: ")
                .append(isUsed())
                .append(", rozmiar: ")
                .append(getSize())
                .toString();
    }

    public String getModel() {
        return model;
    }

    public String getColour() {
        return colour;
    }

    public int getNumberOfDoors() {
        return numberOfDoors;
    }

    public boolean isUsed() {
        return isUsed;
    }

    public String getSize() {
        return size;
    }
}
