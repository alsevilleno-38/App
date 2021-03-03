public class Account {
    public Debit debit;
    public Credit credit;
    public Account(double balance, Credit credit) {
        // This is composition.
        Debit debit = new Debit(balance);
        debit.balance = balance;
        this.debit = debit;
        // This is association
        this.credit = credit;
    }
    public void transact() {
        System.out.println("My debit balance is " + this.debit.balance);
        System.out.println("My credit balance is " + this.credit.balance);
        
    }
}
