// Base class
class LivingBeing {
    void breathe() {
        System.out.println("LivingBeing is breathing.");
    }

    void response() {
        System.out.println("LivingBeing is responding to the environment.");
    }
}

// Derived class (Single Inheritance)
class Animal extends LivingBeing {
    void walk() {
        System.out.println("Animal is walking.");
    }

    void noOfLegs(int legs) {
        System.out.println("Animal has " + legs + " legs.");
    }
}

// Main class
public class SingleInheritanceDemo {
    public static void main(String[] args) {
        Animal a = new Animal();  // Animal object

        // Calling parent class methods (inherited)
        a.breathe();
        a.response();

        // Calling child class methods
        a.walk();
        a.noOfLegs(4);
    }
}