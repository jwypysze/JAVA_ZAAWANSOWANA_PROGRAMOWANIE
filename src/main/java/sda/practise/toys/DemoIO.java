package sda.practise.toys;

public class DemoIO {
    public static void main(String[] args) {

        ToyIOOperations toyIOOperations = new ToyIOOperations();
        String fileName = "ToysTexted";
        toyIOOperations.saveBearToFile(fileName,new Bear
                (TypesOfToys.BEAR,8,55,"medium","red",true));
        System.out.println("\nOdczyt z pliku");
        Toy toyRead = toyIOOperations.readBearFromFile(fileName);
        System.out.println(toyRead.toyInfo());


    }
}
