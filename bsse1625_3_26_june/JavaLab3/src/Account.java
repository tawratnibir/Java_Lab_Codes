public class Account {
    private String id;
    private String name;
    private int balance;
    private String accountType;
    public Account() {
        this.id = "";
        this.name = "";
        this.balance = 0;
        this.accountType = "";
    }
    public Account(String id, String name, String type) {
        this.id = id;
        this.name = name;
        this.balance = 0;
        this.accountType = type;
    }
    public Account(String id, String name, int balance, String type) {
        this.id = id;
        this.name = name;
        this.balance = balance;
        this.accountType = type;
    }
    public String getId() {
        return this.id;
    }
    public String getName() {
        return this.name;
    }
    public int getBalance() {
        return this.balance;
    }
    public int credit(int amount) {
        this.balance += amount;
        return this.balance;
    }
    public int debit(int amount) {
        if(amount <= this.balance) {
            this.balance -= amount;
        }
        else{
            System.out.println("Amount exceeded balance");
        }
        return this.balance;
    }
    public int transferTo(Account another, int amount) {
        if(amount <= this.balance) {
            this.balance -= amount;
            another.credit(amount);
        }
        else{
            System.out.println("Amount exceeded balance");
        }
        return this.balance;
    }
    public String getAccountType() {
        return accountType;
    }
    public String toString() {
        return "Account Information -> ID: " + getId() + " Type: " + getAccountType() + " Name: " + getName() + " Balance: " + getBalance();
    }
}
