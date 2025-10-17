public class ObjectPassing {
    String AccountHolder;
    double Balance;

    ObjectPassing(String Name, double Amount) {
        this.AccountHolder = Name;
        this.Balance = Amount;

    }

    void CompareBalance(ObjectPassing other) {
        if (this.Balance > other.Balance) {
            System.out.println(this.AccountHolder + " Has more Balance than " + other.AccountHolder);

        } else if (this.Balance < other.Balance) {
            System.out.println(this.AccountHolder + " Has less Balance than " + other.AccountHolder);

        } else {
            System.out.println("Both have Equal Balance");

        }
    }

    ObjectPassing returnAccount() {
        return this;
    }

    void display() {
        System.out.println("Account Holder Name:" + AccountHolder + "\nBalance:$" + Balance);

    }

    public static void main(String[] args) {
        System.out.println("Monisha/20245032043");


        ObjectPassing acc1 = new ObjectPassing("Selva", 1000);
        ObjectPassing acc2 = new ObjectPassing("Moshik", 3000);

        ObjectPassing Result = acc1.returnAccount();
        Result. display();
        acc1.CompareBalance(acc2);
    }
}






