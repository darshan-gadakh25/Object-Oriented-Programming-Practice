abstract class Animal {
    abstract void makeSound();
}

class Dog extends Animal {
    void makeSound() {
        System.out.println("Dog → Bark");
    }
}

class Cat extends Animal {
    void makeSound() {
        System.out.println("Cat → Meow");
    }
}

public class AnimalMain {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.makeSound();
        Cat c = new Cat();
        c.makeSound();
    }
}
