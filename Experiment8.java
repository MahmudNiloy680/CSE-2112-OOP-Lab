import java.util.Scanner;
class Animal {
    void sound() {
        System.out.println("Animal makes a sound.");
    }
}
class Dog extends Animal {
    @Override
    void sound() {
        System.out.println("Dog says: Woof Woof!");
    }
}
class Cat extends Animal {
    @Override
    void sound() {
        System.out.println("Cat says: Meow Meow!");
    }
}
public class Experiment8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Animal myAnimal;
        System.out.println("Select Animal: 1. Dog 2. Cat");
        int choice = sc.nextInt();
        sc.close();
        if(choice == 1) {
            myAnimal = new Dog();
        } else {
            myAnimal = new Cat();
        }
        myAnimal.sound();
    }
}