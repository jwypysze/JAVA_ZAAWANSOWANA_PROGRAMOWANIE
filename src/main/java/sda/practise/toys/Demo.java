package sda.practise.toys;

import java.util.Collection;
import java.util.List;

public class Demo {
    public static void main(String[] args) {
        Toy doll1 = new Doll
                (TypesOfToys.DOLL,6,100,5,"blonde","red",false);
        Toy doll2 = new Doll
                (TypesOfToys.DOLL,6,185,3,"brown","blue",true);
        Toy bear1 = new Bear(TypesOfToys.BEAR,2,30,"big","cream",false);
        Toy bear2 = new Bear(TypesOfToys.BEAR,4,10,"small","brown",true);
        Toy brick1 = new Brick(TypesOfToys.BRICK,12,20,"medium","black","wood");
        Toy brick2 = new Brick(TypesOfToys.BRICK,6,15,"large","colourful","wood");
        Toy car1 = new Car
                (TypesOfToys.CAR,8,25000,"Ford Fiesta","white",
                        5,true,"small");

        Toy car2 = new Car
                (TypesOfToys.CAR,5,98000,
                        "Audi","black",3,false,"medium");

        Toy figure1 = new Figure(TypesOfToys.FIGURE,8,48,"big",6,true);
        Toy figure2 = new Figure(TypesOfToys.FIGURE,13,87,"large",10,true);
        Toy puzzle1 = new Puzzle
                (TypesOfToys.PUZZLE,12,222,20000,"forest","large");
        Toy puzzle2 = new Puzzle
                (TypesOfToys.PUZZLE,8,123,7500,"sea","medium");


        List<Toy> toys = List.of(doll1,doll2,bear1,bear2,brick1,brick2,car1,car2,figure1,figure2,puzzle1,puzzle2);

        System.out.println("\nZabawki przeznaczone dla osób w wieku 12 lat lub więcej");

        toys.stream()
                .filter(each -> each.getMinimumAge()>=12)
                .forEach(each -> System.out.println(each.toyInfo()));

        System.out.println("\nWszystkie puzzle i klocki");

        toys.stream()
                .filter(each -> each.getName().equals(TypesOfToys.PUZZLE)
                        || each.getName().equals(TypesOfToys.BRICK))
                .forEach(each -> System.out.println(each.toyInfo()));

        System.out.println("\nSuma wartości wszystkich lalek");

        int sumOfDollsPrices = toys.stream()
                .filter(each -> each.getName().equals(TypesOfToys.DOLL))
                .map(Toy::getPrice)
                .reduce(0,(wartoscBieżąca, kolejnyElement) -> wartoscBieżąca + kolejnyElement);
        System.out.println(sumOfDollsPrices);


    }
}
