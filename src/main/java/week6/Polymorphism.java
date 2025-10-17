package three;
class Animal
{
    void move()
    {
        System.out.println("Animal is Moving...");
    }
    void move(String Direction)
    {
        System.out.println("Animal moves with Direction"+Direction);
    }
    void move(int Distance)
    {
        System.out.println("Animal walk with Distance"+Distance+"meters");
    }
    void move(String Direction,int Distance)
    {
        System.out.println("Animals moves"+Distance+"meters towards"+Direction);
    }

}
class Dog extends Animal{
    void move()
    {
        System.out.println("Dog is runs around...");
    }
    void move(String Direction)
    {
        System.out.println(" Dog runs towards Direction "+Direction);
    }
    void move(int Distance)
    {
        System.out.println(" Dog runs "+Distance+" meters ");
    }
    void move(String Direction,int Distance)
    {
        System.out.println(" Dog runs "+Distance+" meters towards "+Direction);
    }

}
class Cat extends Animal {
    void move()
    {
        System.out.println("cat walks gracefully...");
    }
    void move(String Direction)
    {
        System.out.println(" cat walks towards Direction"+Direction);
    }
    void move(int Distance)
    {
        System.out.println("cat walks "+Distance+"meters");
    }
    void move(String Direction,int Distance)
    {
        System.out.println("cat walks"+Distance+"meters towards"+Direction);
    }




}
class Bird extends Animal{
    void move()
    {
        System.out.println("bird flies ...");
    }
    void move(String Direction)
    {
        System.out.println(" bird flies towards Direction"+Direction);
    }
    void move(int Distance)
    {
        System.out.println("bird flies "+Distance+"meters");
    }
    void move(String Direction,int Distance)
    {
        System.out.println("bird flies"+Distance+"meters towards"+Direction);
    }


}
class Polymorphism
{
    public static void main(String[]args)
    {
        System.out.println("Monisha//2024503043");
        System.out.println("Polymorphism:");
        System.out.println("_______Run Time Polymorphism__________");

                Animal[] animals={new Dog(),new Cat(),new Bird()};
                        for (Animal a:animals) {
                            a.move();
                        }
        System.out.println("_______Compile Time Polymorphism__________");
                        Dog obj=new Dog();
                        obj.move();
                        obj.move("east");
                        obj.move(20);
                        obj.move("east",20);

    }
}