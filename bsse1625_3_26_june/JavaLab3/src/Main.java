import java.util.Vector;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Account[] arr;
        arr = new Account[1003];
        int i = 0;
        for(i=0;i<3;i++) {
            arr[i] = new RegularAccount("1625", "Nibir", 20000, "Regular");
            System.out.println(arr[i].toString());
        }
        int choice = 0;
        int path;
        String name;
        String id;
        int balance;
        String type;
        int typeNumber;
        Scanner sc = new Scanner(System.in);
        do{
            System.out.println("Press 1: Create New Account");
            System.out.println("Press 2: Debit Balance");
            System.out.println("Press 3: Credit Balance");
            System.out.println("Press 4: Transfer money");
            System.out.println("Press 5: Exit");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Do you want to add balance now?");
                    System.out.println("Press 1: Yes");
                    System.out.println("Press 2: No");
                    path = sc.nextInt();
                    sc.nextLine();
                    System.out.println("Enter account type: ");
                    System.out.println("1. Regular");
                    System.out.println("2. Savings");
                    System.out.println("3. Deposit Premium");
                    typeNumber = sc.nextInt();
                    sc.nextLine();
                    typeNumber--;
                    if(path == 1) {
                        System.out.println("Enter name: ");
                        name = sc.nextLine();
                        System.out.println("Enter ID: ");
                        id = sc.nextLine();
                        System.out.println("Enter balance: ");
                        balance = sc.nextInt();
                        if(typeNumber == 0) {
                            type = "Regular";
                            arr[i] = new RegularAccount(id, name, balance, type);
                        }
                        else if(typeNumber == 1) {
                            type = "Savings";
                            arr[i] = new SavingsAccount(id, name, balance, type);
                        }
                        else{
                            type = "Deposit Premium";
                            arr[i] = new DepositPremiumAccount(id, name, balance, type);
                        }
                        i++;
                    }
                    else{
                        System.out.println("Enter name: ");
                        name = sc.nextLine();
                        System.out.println("Enter ID: ");
                        id = sc.nextLine();
                        if(typeNumber == 0) {
                            type = "Regular";
                            arr[i] = new RegularAccount(id, name, type);
                        }
                        else if(typeNumber == 1) {
                            type = "Savings";
                            arr[i] = new SavingsAccount(id, name, type);
                        }
                        else{
                            type = "Deposit Premium";
                            arr[i] = new DepositPremiumAccount(id, name, type);
                        }
                        i++;
                    }
                    System.out.println(arr[i-1].toString());
                    break;
                case 2:
                    sc.nextLine();
                    int debitAmount;
                    System.out.println("Enter account ID: ");
                    id = sc.nextLine();
                    System.out.println("Enter amount to debit: ");
                    debitAmount = sc.nextInt();
                    for(Account target:arr) {
                        if(target.getId().equals(id)) {
                            target.debit(debitAmount);
                            System.out.println(target.toString());
                            break;
                        }
                    }
                    break;
                case 3:
                    sc.nextLine();
                    int creditAmount;
                    System.out.println("Enter account ID: ");
                    id = sc.nextLine();
                    System.out.println("Enter amount to credit: ");
                    creditAmount = sc.nextInt();
                    for(Account target:arr) {
                        if(target.getId().equals(id)) {
                            target.credit(creditAmount);
                            System.out.println(target.toString());
                            break;
                        }
                    }
                    break;
                case 4:
                    sc.nextLine();
                    String sourceId;
                    Account srcAccount = null, desAccount = null;
                    String destinationId;
                    int amountToTransfer;
                    boolean srcFound = false, desFound = false;
                    System.out.println("Enter source account id: ");
                    sourceId = sc.nextLine();
                    System.out.println("Enter destination account id: ");
                    destinationId = sc.nextLine();
                    System.out.println("Enter amount to transfer: ");
                    amountToTransfer = sc.nextInt();
                    for(Account target:arr) {
                        if(target.getId().equals(sourceId)) {
                            srcAccount = target;
                            srcFound = true;
                            break;
                        }
                    }
                    if(!srcFound) {
                        System.out.println("Source Account not found");
                        break;
                    }
                    for(Account target:arr) {
                        if(target.getId().equals(destinationId)) {
                            desAccount = target;
                            desFound = true;
                            break;
                        }
                    }
                    if(!desFound) {
                        System.out.println("Destination Account not found");
                        break;
                    }
                    srcAccount.transferTo(desAccount, amountToTransfer);
                    System.out.println(srcAccount.toString());
                    System.out.println(desAccount.toString());
                    break;
                default:
                    break;
            }
        }while(choice != 5);
    }
}