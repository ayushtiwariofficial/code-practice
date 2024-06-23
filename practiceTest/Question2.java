package practiceTest;
abstract class Animal{
    public abstract void makeSound();
}

class Dog extends Animal{
    public void makeSound()
    {
        System.out.println("Dog makes sound: Woof");
    }
}

class Cat extends Animal{
    public void makeSound(){
        System.out.println("Cat makes sound: Meow");
    }
}

public class Question2 {
    
    public static void main(String[] args) {
        Dog pug = new Dog();
        Cat cat = new Cat();

        pug.makeSound();
        cat.makeSound();


    }
}
