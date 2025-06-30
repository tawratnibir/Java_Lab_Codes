public class DepositPremiumAccount extends Account{
    int numberOfDeposit;
    public DepositPremiumAccount(String id, String name, String type){
        super(id, name, type);
        numberOfDeposit = 0;
    }
    public DepositPremiumAccount(String id, String name, int balance, String type) {
        super(id, name, balance, type);
        numberOfDeposit = 0;
    }
    public boolean withdrawValidity() {
        if(numberOfDeposit >= 5) {
            return true;
        }
        else{
            return false;
        }
    }
    @Override
    public int credit(int amount) {
        super.credit(amount);
        super.credit((int) (amount * .07));
        numberOfDeposit++;
        return super.getBalance();
    }
    @Override
    public int debit(int amount) {
        if(withdrawValidity()) {
            super.debit(amount);
            return super.getBalance();
        }
        else{
            System.out.println("Cannot withdraw yet!");
            System.out.println("You need to deposit " + (5 - numberOfDeposit) + " more times.");
            return super.getBalance();
        }
    }
    @Override
    public int transferTo(Account another, int amount) {
        this.debit(amount);
        another.credit(amount);
        return super.getBalance();
    }
}
