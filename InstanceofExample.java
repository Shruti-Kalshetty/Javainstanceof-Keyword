// Example program to demonstrate the use of 'instanceof' keyword in Java

class Animal {
    void sound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {
    void sound() {
        System.out.println("Dog barks");
    }
}

class Cat extends Animal {
    void sound() {
        System.out.println("Cat meows");
    }
}

public class InstanceofExample {
    public static void main(String[] args) {
        Animal animal = new Animal();
        Dog dog = new Dog();
        Cat cat = new Cat();

        // Using instanceof to check the type of the object
        System.out.println("animal instanceof Animal: " + (animal instanceof Animal)); // true
        System.out.println("dog instanceof Animal: " + (dog instanceof Animal)); // true
        System.out.println("cat instanceof Animal: " + (cat instanceof Animal)); // true

        System.out.println("dog instanceof Dog: " + (dog instanceof Dog)); // true
        System.out.println("cat instanceof Cat: " + (cat instanceof Cat)); // false

        // Checking with null
        System.out.println("animal instanceof Dog: " + (animal instanceof Dog)); // false
        System.out.println("null instanceof Animal: " + (null instanceof Animal)); // false
    }
}
