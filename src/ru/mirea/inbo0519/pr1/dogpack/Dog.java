package ru.mirea.inbo0519.pr1.dogpack;

public class Dog {
    private String name;
    private int age;

    public Dog(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Dog(String name) {
        this.name = name;
        this.age = 0;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int toHuman() {
        return this.age * 7;
    }

    @Override
    public String toString() {
        return "The dog: name = " + name + "   age = " + age;
    }
}
