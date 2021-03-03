import java.lang.Math;

public class Start {
    public static void main(String[] args) {      
        Credit credit = new Credit(74.2);
        Account a = new Account(16.5, credit);
        a.transact();
    }

    
}

class Debit {
    public double balance;
    public Debit(double balance) {
        this.balance = balance;
    }    
}

class Credit {
    public double balance;
    public Credit(double balance) {
        this.balance = balance;
    }    
}
