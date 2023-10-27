package OOPs.Overriding;


class Animal {
    public void makeSound() {
        System.out.println("Animals make a soung");
    }
}

class Dog extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Dog is Barking..........");
    }
}

class Cat extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Cat is meowmeowmeow......mew..mew");
    }
    public static void main(String[] args) {
        Dog d = new Dog();
        Cat c = new Cat();
        d.makeSound();
        c.makeSound();
    }
}
public class Overriding_193 {
    /**
     193. *Method Overriding:* 🔄 Create a base class "Animal" with a method "makeSound." Create derived
     classes like "Dog" and "Cat" that override the "makeSound" method to provide their specific sounds. 🐶🐱\
     */
}
