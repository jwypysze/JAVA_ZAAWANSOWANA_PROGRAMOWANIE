package sda.practise.toys;

public class Figure extends Toy implements ToyInfo{

    private String size;
    private int numberOfElements;
    private boolean isMoving;

    public Figure(TypesOfToys name, int minimumAge, int price, String size, int numberOfElements, boolean isMoving) {
        super(name, minimumAge, price);
        this.size = size;
        this.numberOfElements = numberOfElements;
        this.isMoving = isMoving;
    }

    @Override
    public String toyInfo(){
        return new StringBuilder(super.toyInfo())
                .append(", rozmiar: ")
                .append(getSize())
                .append(", liczba elementów: ")
                .append(getNumberOfElements())
                .append(", czy się porusza: ")
                .append(isMoving())
                .toString();
    }
    public String getSize() {
        return size;
    }

    public int getNumberOfElements() {
        return numberOfElements;
    }

    public boolean isMoving() {
        return isMoving;
    }
}
