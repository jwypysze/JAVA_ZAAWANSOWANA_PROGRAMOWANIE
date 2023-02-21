package sda.practise.person;


import java.io.*;
import java.util.Scanner;

public class PersonIOOperations {

    public void savePersonToFile(String filename, Person person) {

        File file = new File(filename);
        try {
            FileWriter writer = new FileWriter(file);
            String personString = person.getName() + "|" + person.getSurname() + "|" + person.getAge() + "|" + person.getGender().getAbbrv() +
                    "|" + person.getNoOfChildren();
            writer.write(personString);
            writer.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public Person readPersonFromFile(String filename) {
        try {
            FileReader reader = new FileReader(filename);
            Scanner scanner = new Scanner(reader);
            String line = scanner.nextLine();
            String[] personString = line.split("\\|");
            scanner.close();
            return new Person(personString[0], personString[1], Integer.parseInt(personString[2]),
                    Gender.findByAbbrv(personString[3]), Integer.parseInt(personString[4]));
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    public void saveToSerializedStream(String filename, Person person) {

        try (FileOutputStream fout = new FileOutputStream(filename)) {
            ObjectOutputStream oos = new ObjectOutputStream(fout);
            oos.writeObject(person);
            oos.close();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public Person readFromSerializedStream(String filename) {
        Person person;

        try (FileInputStream fis = new FileInputStream(filename)) {
            ObjectInputStream ois = new ObjectInputStream(fis);
            person = (Person) ois.readObject();
            ois.close();

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }

        return person;
    }
}
