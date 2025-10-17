public class ConstructorChaining {
    String AccountHolder;
    double Balance;
    ConstructorChaining()
    {
        this("Unknown",0.0);
    }
    ConstructorChaining(String Name)
    {
        this(Name,1000.0);

    }
    ConstructorChaining(String AccountHolder,double Balance)
    {
        this.AccountHolder=AccountHolder;
        this.Balance=Balance;

    }
    void Display()
    {
        System.out.println("Account Holder Name:"+AccountHolder+"\nBalance:$"+Balance);
    }
    public static void main(String[]args)
    {
        System.out.println("Monisha/2024503043");

        ConstructorChaining acc1=new ConstructorChaining();
        ConstructorChaining acc2=new ConstructorChaining("Abinaya",10000);
        ConstructorChaining acc3=new ConstructorChaining("nirav",2000);
        acc1.Display();
        acc2.Display();
        acc3.Display();
    }
}
