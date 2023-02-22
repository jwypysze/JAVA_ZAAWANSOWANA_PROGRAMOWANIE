package sda.practise.toys;

public class Doll extends Toy implements ToyInfo{

    private int numberOfDresses;
    private String hairColour;
    private String dressColour;
    private boolean isTalking;

    public Doll(TypesOfToys name, int minimumAge,
                int price, int numberOfDresses, String hairColour, String dressColour, boolean isTalking) {
        super(name, minimumAge, price);
        this.numberOfDresses = numberOfDresses;
        this.hairColour = hairColour;
        this.dressColour = dressColour;
        this.isTalking = isTalking;
    }
    @Override
    public String toyInfo(){
        return new StringBuilder(super.toyInfo())
                .append(", liczba sukienek w zestawie: ")
                .append(getNumberOfDresses())
                .append(", kolor włosów: ")
                .append(getHairColour())
                .append(", kolor sukienki:  ")
                .append(getDressColour())
                .append(", czy mówi: ")
                .append(isTalking())
                .toString();
    }

    public int getNumberOfDresses() {
        return numberOfDresses;
    }

    public String getHairColour() {
        return hairColour;
    }

    public String getDressColour() {
        return dressColour;
    }

    public boolean isTalking() {
        return isTalking;
    }
}
