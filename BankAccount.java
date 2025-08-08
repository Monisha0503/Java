public class Bank {
    private static int totalaccounts = 0;
    private int AccountNumber;
    private int Balance;

    //Constructor
    public Bank(int AccountNumber, int initialBalance) {
        this.AccountNumber = AccountNumber;
        this.Balance = initialBalance;
        totalaccounts++;
    }

    public void deposit(int amount) {
        int depositAmount = amount;//local variable
        Balance = +depositAmount;
        System.out.println("Deposit of" + depositAmount+"success to Account Number" + AccountNumber);
        System.out.println("Current Balance:" + Balance);
    }

    public static void DisplayTotalaccounts() {
        System.out.println("Total accounts created:" + totalaccounts);
    }
}

public class BankAccount
{
    public static void main(String[]args)
    {
        System.out.println("Monisha//2024503043");
        Bank account1=new Bank(101,1000);
        account1.deposit(500);
        Bank account2=new Bank(102,2000);
        account2.deposit(1000);
        Bank account3=new Bank(103,3000);
        account3.deposit(2000);
        Bank.DisplayTotalaccounts();
    }

}

