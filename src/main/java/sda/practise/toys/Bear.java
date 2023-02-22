package sda.practise.toys;

public class Bear extends Toy implements ToyInfo{

    private String size;
    private String colour;
    private boolean isDirty;


    public Bear(TypesOfToys name, int minimumAge, int price, String size, String colour, boolean isDirty) {
        super(name, minimumAge, price);
        this.size = size;
        this.colour = colour;
        this.isDirty = isDirty;
    }




    public String getSize() {
        return size;
    }

    public String getColour() {
        return colour;
    }

    public boolean isDirty() {
        return isDirty;
    }


    public String toyInfo() {
        return new StringBuilder(super.toyInfo())
                .append(", rozmiar: ")
                .append(getSize())
                .append(", kolor: ")
                .append(getColour())
                .append(", czy jest brudny: ")
                .append(isDirty())
                .toString();
    }


}