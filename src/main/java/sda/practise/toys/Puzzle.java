package sda.practise.toys;

public class Puzzle extends Toy implements ToyInfo{

    private int numberOfElements;
    private String typeOfView;
    private String size;

    public Puzzle(TypesOfToys name, int minimumAge, int price, int numberOfElements, String typeOfView, String size) {
        super(name, minimumAge, price);
        this.numberOfElements = numberOfElements;
        this.typeOfView = typeOfView;
        this.size = size;
    }
    @Override
    public String toyInfo(){
        return new StringBuilder(super.toyInfo())
                .append(", liczba elementów: ")
                .append(getNumberOfElements())
                .append(", rodzaj widoku: ")
                .append(getTypeOfView())
                .append(", rozmiar: ")
                .append(getSize())
                .toString();
    }
    public int getNumberOfElements() {
        return numberOfElements;
    }

    public String getTypeOfView() {
        return typeOfView;
    }

    public String getSize() {
        return size;
    }
}
