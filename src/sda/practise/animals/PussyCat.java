package sda.practise.animals;

import sda.practise.animals.Cat;

public class PussyCat extends Cat {
    private String name;

    public PussyCat(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }
}
