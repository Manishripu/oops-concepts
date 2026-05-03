package encapsulation;

public class BankAccount {

    private double balance;
    public BankAccount(double initialAmount){
        this.balance=initialAmount;
    }

    public void deposit(double amount){
        this.balance+=amount;
        System.out.println("Amount deposited: "+amount+" Final Balance: "+this.balance);
    }
    public void withdraw(double amount){
            if(this.balance<amount){
                System.out.println("Insufficient balance!!!");
                return;
            }
            this.balance-=amount;
            System.out.println("Amount withdrawn: "+amount+" Final Balance: "+this.balance);

    }
}
