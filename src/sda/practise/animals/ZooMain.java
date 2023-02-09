package sda.practise.animals;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.List;

public class ZooMain {

    public static void main(String[] args) {
        Animal pussyCat = new PussyCat("Puszek");
        Animal eagle = new Eagle("Bielik");

        List<Animal> animals = List.of(pussyCat, eagle);
        saveToFile("Zwierzęta", animals);
    }

    public static void saveToFile(String fileName, List objectList) {
        System.out.println("Trying to write to file" + fileName);
        Path path = Paths.get(fileName);
        int line = 0;
        try {
            for (Object o : objectList) {
                if (line == 0) {
                    Files.writeString(path, objectList.get(0).toString());
                    line ++;
                } else {
                    Files.writeString(path, "\n"+o.toString(), StandardOpenOption.APPEND);
                }
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
