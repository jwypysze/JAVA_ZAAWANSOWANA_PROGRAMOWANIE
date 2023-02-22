package sda.practise.toys;

public class Brick extends Toy implements ToyInfo{

    private String size;
    private String colour;
    private String material;

    public Brick(TypesOfToys name, int minimumAge, int price, String size, String colour, String material) {
        super(name, minimumAge, price);
        this.size = size;
        this.colour = colour;
        this.material = material;
    }

    public String getSize() {
        return size;
    }

    public String getColour() {
        return colour;
    }

    public String getMaterial() {
        return material;
    }

    @Override
    public String toyInfo(){
        return new StringBuilder("Zabawka: ")
                .append(TypesOfToys.BRICK.getPolishTranslate())
                .append(" ")
                .append(", minimalny wiek: ")
                .append(getMinimumAge())
                .append(", cena: ")
                .append(getPrice())
                .append(", rozmiar: ")
                .append(getSize())
                .append(", kolor: ")
                .append(getColour())
                .append(", materiał: ")
                .append(getMaterial())
                .toString();
    }
}
