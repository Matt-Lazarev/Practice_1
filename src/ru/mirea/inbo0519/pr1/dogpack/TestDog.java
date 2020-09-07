package ru.mirea.inbo0519.pr1.dogpack;

public class TestDog {
    public static void main(String[] args)
    {
        Dog dog1 = new Dog("Rax", 5);
        System.out.println(dog1);
        System.out.println("to human age: " + dog1.toHuman());

        Dog dog2 = new Dog("Mike");
        dog2.setAge(3);
        System.out.println(dog2);
        System.out.println("to human age: " + dog2.toHuman());

    }

}
