package sda.practise.toys;

import sda.practise.person.Gender;
import sda.practise.person.Person;

import java.io.*;
import java.util.Scanner;

public class ToyIOOperations {



    public void saveBearToFile(String filename, Bear bear) {

        File file = new File(filename);
        try {
            FileWriter writer = new FileWriter(file);
            String bearString = bear.getName() + "|" + bear.getMinimumAge() +
                    "|" + bear.getPrice() + "|" + bear.getSize() + "|" + bear.getColour() + "|" + bear.isDirty();
            writer.write(bearString);
            writer.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public void saveBrickToFile(String filename, Brick brick) {

        File file = new File(filename);
        try {
            FileWriter writer = new FileWriter(file);
            String brickString = brick.getName() + "|" + brick.getMinimumAge() +
                    "|" + brick.getPrice() + "|" + brick.getSize() + "|"
                    + brick.getColour() + "|" + brick.getMaterial();
            writer.write(brickString);
            writer.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public void saveCarToFile(String filename, Car car) {

        File file = new File(filename);
        try {
            FileWriter writer = new FileWriter(file);
            String carString = car.getName() + "|" + car.getMinimumAge() +
                    "|" + car.getPrice() + "|" + car.getModel() + "|" + car.getColour() + "|"
                    + car.getNumberOfDoors() + "|" + car.isUsed() + "|" + car.getSize();
            writer.write(carString);
            writer.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public void saveDollToFile(String filename, Doll doll) {

        File file = new File(filename);
        try {
            FileWriter writer = new FileWriter(file);
            String dollString = doll.getName() + "|" + doll.getMinimumAge() +
                    "|" + doll.getPrice() + "|" + doll.getNumberOfDresses() + "|" + doll.getHairColour() +
                    "|" + doll.getDressColour() + "|" + doll.isTalking();
            writer.write(dollString);
            writer.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public void saveFigureToFile(String filename, Figure figure) {

        File file = new File(filename);
        try {
            FileWriter writer = new FileWriter(file);
            String figureString = figure.getName() + "|" + figure.getMinimumAge() +
                    "|" + figure.getPrice() + "|" + figure.getSize() + "|" + figure.getNumberOfElements() +
                    "|" + figure.isMoving();
            writer.write(figureString);
            writer.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public void savePuzzleToFile(String filename, Puzzle puzzle) {

        File file = new File(filename);
        try {
            FileWriter writer = new FileWriter(file);
            String puzzleString = puzzle.getName().getPolishTranslate() + "|" + puzzle.getMinimumAge() +
                    "|" + puzzle.getPrice() + "|" + puzzle.getNumberOfElements() + "|" + puzzle.getTypeOfView()
                    + "|" + puzzle.getSize();
            writer.write(puzzleString);
            writer.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }


    public Bear readBearFromFile(String filename) {
        try {
            FileReader reader = new FileReader(filename);
            Scanner scanner = new Scanner(reader);
            String line = scanner.nextLine();
            String[] bearString = line.split("\\|");
            scanner.close();
            return new Bear(TypesOfToys.BEAR, Integer.parseInt(bearString[1]),
                    Integer.parseInt(bearString[2]),
                    bearString[3],bearString[4],Boolean.parseBoolean(bearString[5]));
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }


}
