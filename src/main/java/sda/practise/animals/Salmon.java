package sda.practise.animals;

import sda.practise.animals.Fish;

public class Salmon extends Fish {
    private String name;

    public Salmon(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }
}
