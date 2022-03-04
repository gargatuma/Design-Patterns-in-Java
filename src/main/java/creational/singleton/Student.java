package creational.singleton;

public class Student {
    private String name;
    private int age;
    private static Student student;

    protected Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

}