public class RegularAccount extends Account{
    public RegularAccount(String id, String name, String type){
        super(id, name, type);
    }
    public RegularAccount(String id, String name, int balance, String type) {
        super(id, name, balance, type);
    }
    @Override
    public int transferTo(Account another, int amount) {
        this.debit(amount);
        another.credit(amount);
        return super.getBalance();
    }
}
