package two;
class LivingBeing{
    void Breath()
    {
        System.out.println("Living being is breathing.....");

    }
    void Response()
    {
        System.out.println("Living being is able to respond to all!");
    }
}
class Animal extends LivingBeing{
    void walk()
    {
        System.out.println("Animals can walk");

    }
    void NoOfLegs()
    {
        System.out.println("All Animals are having four legs");
    }
}
class Cat extends Animal {
    void Meow() {
        System.out.println("Cat sounds like Meow");
    }
}
class Dog extends Cat{
    void bark()
    {
        System.out.println("Dog Sounds like Woof");
    }

}
public class MultiLevelInheritance
{
    public static void main(String[]args){
        System.out.println("Monisha//2024503043");
        System.out.println("MultilevelInheritance:");

        Dog obj=new Dog();
        obj.Breath();
        obj.Response();
        obj.walk();
        obj.NoOfLegs();
        obj.Meow();
        obj.bark();
    }
}