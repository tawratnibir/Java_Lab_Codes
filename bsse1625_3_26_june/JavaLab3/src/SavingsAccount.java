public class SavingsAccount extends Account{
    public SavingsAccount(String id, String name, String type){
        super(id, name, type);
    }
    public SavingsAccount(String id, String name, int balance, String type) {
        super(id, name, balance, type);
    }
    @Override
    public int credit(int amount) {
        super.credit(amount);
        super.credit((int)(amount * .025));
        return super.getBalance();
    }
    @Override
    public int debit(int amount) {
        if(super.getBalance() - amount <= 1000) {
            System.out.println("Insufficient balance to deposit!");
        }
        else{
            super.debit(amount);
        }
        return super.getBalance();
    }
    @Override
    public int transferTo(Account another, int amount) {
        this.debit(amount);
        another.credit(amount);
        return super.getBalance();
    }
}
