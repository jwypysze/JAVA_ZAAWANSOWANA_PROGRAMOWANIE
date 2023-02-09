package sda.practise;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Person implements Comparable<Person> {
    private String name;
    private String surname;
    private int age;
    private Gender gender;
    private int noOfChildren;
    private List<Person> children;

    public Person(String name, String surname, int age, Gender gender, int noOfChildren) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.gender = gender;
        this.noOfChildren = noOfChildren;
        children = new ArrayList<>();
    }

    public Person(String name, String surname, int age, String gender, int noOfChildren) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.gender = Gender.findByAbbrv(gender);
        this.noOfChildren = noOfChildren;
        children = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getAge() {
        return age;
    }

    public Gender getGender() {
        return gender;
    }

    public int getNoOfChildren() {
        return noOfChildren;
    }

    public boolean addChild(Person child) {
        return children.add(child);
    }

    public List<Person> getChildren() {
        return children;
    }

    public String personInfo(boolean showNoOfChildren) {
        return new StringBuilder("Person: ")
                .append(name)
                .append(" ")
                .append(surname)
                .append(", age: ")
                .append(age)
                .append(", gender: ")
                .append(gender.getTranslationEn())
                .append(showNoOfChildren ? ", children: " : "")
                .append(showNoOfChildren ? noOfChildren : "")
                .toString();
    }

    public String personInfoWithChildren() {
        String childrenConcat = "";
        for (Person child : children) {
            childrenConcat += child.personInfo(false) + "\n\t";
        }

        return personInfo(true) + "\n\t" + childrenConcat;
    }

    @Override
    public int compareTo(Person p) {
        return (this.surname+this.name).compareTo(p.getSurname()+p.getName());
    }
}
