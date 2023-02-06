package sda.patterns.structural.flyweight;

import java.util.HashSet;
import java.util.Set;

public class MustangBaseFactory {

    private static Set<FordMustangBase> fordMustangBaseSet = new HashSet<>();

    public static FordMustangBase getMustangBase(String color, String engine) {
        FordMustangBase fordMustangBase;
        System.out.println(MustangBaseFactory.class + " getMustangBase");

        if(fordMustangBaseSet.size() > 0) {
            fordMustangBase = fordMustangBaseSet.stream()
                    //filter - "przepuść" tylko elementy strumienia spełniające warunek zdefiniowany w "filter"
                    .filter(each -> color.equalsIgnoreCase(each.getColor()) && engine.equalsIgnoreCase(each.getEngine()))
                    //peek - wykonaj akcję nie zmieniając obiektu na którym "stream aktualnie stoi", metoda
                    //w założeniu powstałą do logowania co się dzieje w trakcie działania streama, np. jakie
                    //elementy przeszły przez filter
                    .peek(found -> System.out.println("found: " + found.getColor() + ", " + found.getEngine()))
                    //findAny - znajdź dowolny element strumienia który przeszedł wszystkie poprzednie kroki
                    //podobne - findFirst - zwraca pierwszy element strumienia który przejdzie poprzednie kroki
                    .findAny()
                    //jeśli findAny nic nie zwróci to zadziała orElseGet(uwaga, tu jest SUPPLIER)
                    .orElseGet(() -> getNew(color, engine));
        } else {
            System.out.println("Set pusty - dokładamy pierwszy element");
            fordMustangBase = new FordMustangBase(color, engine);
        }
        fordMustangBaseSet.add(fordMustangBase);
        return fordMustangBase;
    }

    private static FordMustangBase getNew(String color, String engine) {
        System.out.println("Zadziałało or-Else");
        return new FordMustangBase(color, engine);
    }

    public static Set<FordMustangBase> getFordMustangBaseSet() {
        return fordMustangBaseSet;
    }
}
