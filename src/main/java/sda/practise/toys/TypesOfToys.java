package sda.practise.toys;

public enum TypesOfToys {
    DOLL(1,"D","lalka"),
    BRICK(2,"B","klocek"),
    CAR(3,"C","pojazd"),
    BEAR(4,"B","pluszak"),
    FIGURE(5,"F","figura"),
    PUZZLE(6,"P","puzle");


    private int number;
    private String abbrv;
    private String polishTranslate;

    TypesOfToys(int number, String abbrv, String polishTranslate) {
        this.number = number;
        this.abbrv = abbrv;
        this.polishTranslate = polishTranslate;
    }

    public int getNumber() {
        return number;
    }

    public String getAbbrv() {
        return abbrv;
    }

    public String getPolishTranslate() {
        return polishTranslate;
    }
}
