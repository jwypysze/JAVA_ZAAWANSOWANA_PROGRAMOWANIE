package sda.practise.animals;

import sda.practise.animals.Bird;

public class Eagle extends Bird {
    private String name;

    public Eagle(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }
}
