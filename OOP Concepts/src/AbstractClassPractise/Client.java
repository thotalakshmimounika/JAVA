package AbstractClassPractise;

public class Client {
    public static void main(String[] args) {
        // Cannot instantiate Animal directly because it's abstract
        // Animal animal = new Animal(); // This would cause an error

        // Instantiate Dog and Cat which are concrete subclasses of Animal
        Animal dog = new Dog();
        dog.makeSound();
        dog.sleep();

        Animal cat = new Cat();
        cat.makeSound();
        cat.sleep();
    }
}
