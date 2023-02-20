package sda.patterns.structural.flyweight;

public class FordMustang {
    private FordMustangBase fordMustangBase;
    private String radio;

    public FordMustang(String color, String engine, String radio) {
        System.out.println(this.getClass() + " - konstruktor");
        fordMustangBase = MustangBaseFactory.getMustangBase(color, engine);
        this.radio = radio;
    }

    public String getCarInfo() {
        return new StringBuilder("FordMustang: ")
                .append("\n\t kolor : ").append(fordMustangBase.getColor())
                .append("\n\t silnik: ").append(fordMustangBase.getEngine())
                .append("\n\t radio: ").append(radio)
                .toString();
    }
}
