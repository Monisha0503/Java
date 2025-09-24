// Step 1: Define an interface
interface Animal {
    void sound();  // abstract method
    void sleep();  // another abstract method
}

// Step 2: Implement the interface in a class
class Dog implements Animal {
    // Provide implementation for all interface methods
    public void sound() {
        System.out.println("Dog barks");
    }
    
    public void sleep() {
        System.out.println("Dog sleeps");
    }
}

// Step 3: Another class implementing the same interface
class Cat implements Animal {
    public void sound() {
        System.out.println("Cat meows");
    }
    
    public void sleep() {
        System.out.println("Cat sleeps");
    }
}

// Step 4: Main class to test
public class InterfaceExample {
    public static void main(String[] args) {
        // Create objects of Dog and Cat
        Animal dog = new Dog();
        Animal cat = new Cat();
        
        dog.sound();   // Dog barks
        dog.sleep();   // Dog sleeps
        
        cat.sound();   // Cat meows
        cat.sleep();   // Cat sleeps
    }
}