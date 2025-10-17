public class thisKeyDemo {
    double Amount;
    thisKeyDemo(double Amount)
    {
        this.Amount=Amount;
    }
    void Show()
    {
        System.out.println("Amount:"+Amount);
    }
    public static void main(String[]args)
    {
        System.out.println("Monisha/2024503043");
        thisKeyDemo obj=new thisKeyDemo(10000.0);
        obj.Show();
    }
}
