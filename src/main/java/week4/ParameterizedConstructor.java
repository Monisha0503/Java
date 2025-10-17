public class ParameterizedConstructor {
    String AccountHolder;
    double Balance;
    int AccountNo;

    ParameterizedConstructor() {
        AccountHolder = "Unknown";
        AccountNo=0;
        Balance = 0;
    }

    //Single Parameterized Constructor
    ParameterizedConstructor(String AccountHolder) {

       this. AccountHolder= AccountHolder;


    }

    // Multiple Parameterized Constructor
    ParameterizedConstructor(String AccountHolder, int AccountNo,double Balance) {

       this. AccountHolder= AccountHolder;
       this. AccountNo = AccountNo;
       this.Balance=Balance;

    }

    void Display() {


        System.out.println("Account Holder Name:" + AccountHolder);

        System.out.println("Account Number:" + AccountNo);
        System.out.println("Balance:"+Balance);
    }


    public static void main(String[] args) {
        System.out.println("Monisha/2024503043");
        ParameterizedConstructor obj1 = new ParameterizedConstructor();

        ParameterizedConstructor obj2 = new ParameterizedConstructor("Moni");

        ParameterizedConstructor obj3 = new ParameterizedConstructor("Moni",123456789,2000);
        obj1.Display();
        obj2.Display();
        obj3.Display();
    }
}




