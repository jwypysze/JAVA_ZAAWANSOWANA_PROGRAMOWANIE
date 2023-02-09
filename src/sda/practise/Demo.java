package sda.practise;

import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Demo {
    public static void main(String[] args) {
        Person person1 = new Person("Jan", "Kowalski", 33, Gender.MALE, 4);
        Person person2 = new Person("Janina", "Nowak", 18, Gender.FEMALE, 0);
        Person person3 = new Person("Andrzej", "Zduń", 45, Gender.MALE, 2);

        List<Person> people = List.of(person1, person2, person3);
        System.out.println("People older then 30");
        people.stream()
                .filter(each -> each.getAge() > 30)
                .forEach(each -> System.out.println(each.personInfo(true)));

        System.out.println("\nPeople with 2 or 3 children");
        people.stream()
                .filter(person -> person.getNoOfChildren() == 3 || person.getNoOfChildren() ==2)
                .forEach(each -> System.out.println(each.personInfo(false)));


        Person person4 = new Person("Jan", "Ząbal", 24, "m", 0);
        Person person5 = new Person("Elżbieta", "Grysik", 15, "f", 0);
        Person person6 = new Person("Wiesława", "Stalowa", 65, "f", 5);

        List<Person> morePeople = List.of(person4, person5, person6);
        System.out.println("\nNew people print");
        morePeople.forEach(person -> System.out.println(person.personInfo(false)));

        person3.addChild(new Person("Patryk", "Zduń", 7, "m", 0));
        person3.addChild(new Person("Weronika", "Zduń", 12, "f", 0));

        System.out.println("\nPerson with children:");
        System.out.println(person3.personInfoWithChildren());

        System.out.println("\nList all the people sorted:");
        Stream.of(people, morePeople)
                .flatMap(Collection::stream)
                .sorted()
                .forEach(each -> System.out.println(each.personInfo(false)));

        System.out.println("\nList all the people sorted by age:");
        Stream.of(people, morePeople)
                .flatMap(Collection::stream)
                //.sorted(new PersonByAgeComparator())
                .sorted(new PersonByAgeComparator().reversed())
                .forEach(each -> System.out.println(each.personInfo(false)));

        person1.addChild(new Person("Mikołaj", "Kowalski", 7, "m", 0));
        person1.addChild(new Person("Klaudia", "Kowalska", 5, "f", 0));
        person1.addChild(new Person("Zuzia", "Kowalska", 3, "f", 0));
        person1.addChild(new Person("Norbert", "Kowalski", 11, "m", 0));

        person6.addChild(new Person("Kasia", "Stalowa", 15, "f", 0));
        person6.addChild(new Person("Ola", "Stalowa", 13, "f", 0));
        person6.addChild(new Person("Kamil", "Stalowy", 2, "m", 0));
        person6.addChild(new Person("Kuba", "Stalowy", 3, "m", 0));
        person6.addChild(new Person("Nina", "Stalowa", 10, "f", 0));

        List<Person> allPeople = Stream.of(people, morePeople)
                .flatMap(Collection::stream)
                .collect(Collectors.toList());

        System.out.println("\nPrint all the children of all the people: ");
        allPeople.stream()
                .filter(each -> each.getNoOfChildren() != 0) //wyfiltruj tych co mają dzieci
                .map(Person::getChildren) //dla każdej osoby w streamie pobierz listę dzieci i dalej posługuj się listą dzieci
                //map zrobiło przekształcenie Person na List<Person> children
                //po map() mamy Stream(List<Person>) czyli strumień list dzieci
                //flatmap zamienia nam to na Stream(Person)
                .flatMap(Collection::stream)
                //no i teraz mamy płaską strukturę Stream(Person) i możemy każdą osobę wrzucić na drukarkę
                .forEach(child -> System.out.println(child.personInfo(false)));
    }
}
