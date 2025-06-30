import java.util.Vector;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Account[] arr;
        arr = new Account[1003];
        int i = 0;
        for(i=0;i<3;i++) {
            arr[i] = new Account("1625", "Nibir", 20000);
            System.out.println(arr[i].toString());
        }
        int choice = 0;
        int path;
        String name;
        String id;
        int balance;
        Scanner sc = new Scanner(System.in);
        do{
            System.out.println("Press 1: Create New Account");
            System.out.println("Press 2: Debit Balance");
            System.out.println("Press 3: Credit Balance");
            System.out.println("Press 4: Transfer money");
            System.out.println("Press 5: View all account");
            System.out.println("Press 6: Exit");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Do you want to add balance now?");
                    System.out.println("Press 1: Yes");
                    System.out.println("Press 2: No");
                    path = sc.nextInt();
                    sc.nextLine();
                    if(path == 1) {
                        System.out.println("Enter name: ");
                        name = sc.nextLine();
                        System.out.println("Enter ID: ");
                        id = sc.nextLine();
                        System.out.println("Enter balance: ");
                        balance = sc.nextInt();
                        arr[i] = new Account(id, name, balance);
                        i++;
                    }
                    else{
                        System.out.println("Enter name: ");
                        name = sc.nextLine();
                        System.out.println("Enter ID: ");
                        id = sc.nextLine();
                        arr[i] = new Account(id, name);
                        i++;
                    }
                    System.out.println(arr[i-1].toString());
                    break;
                case 2:
                    sc.nextLine();
                    System.out.println("Enter account ID: ");
                    id = sc.nextLine();
                    System.out.println("Enter amount to debit: ");
                    int debitAmount;
                    Account debitAccount;
                    debitAmount = sc.nextInt();
                    for(Account target:arr) {
                        debitAccount = target;
                        if(debitAccount.getId().equals(id)) {
                            debitAccount.debit(debitAmount);
                            System.out.println(debitAccount.toString());
                            break;
                        }
                    }
                    break;
                case 3:
                    sc.nextLine();
                    int creditAmount;
                    Account creditAccount = null;
                    System.out.println("Enter account ID: ");
                    id = sc.nextLine();
                    System.out.println("Enter amount to credit: ");
                    creditAmount = sc.nextInt();
                    for(Account target:arr) {
                        creditAccount = target;
                        if(creditAccount.getId().equals(id)) {
                            target.credit(creditAmount);
                            System.out.println(creditAccount.toString());
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
                case 5:
                    for(int j=0;j<i;j++) {
                        System.out.println(arr[j].toString());
                    }
                default:
                    break;
            }
        }while(choice != 6);
    }
}