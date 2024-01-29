import java.util.Scanner;

class Account{
    private int bal;
    public Account(int bal){
        this.bal=bal;
    }
    public boolean isSufficientBalance(int w){
        if(bal>=w)
        return (true);
        else
        return (false);
    }
    public void withdraw(int amt){
        bal = bal-amt;
        System.out.println("withdrawl money is "+amt);
        System.out.println("your current balance is "+bal);
    }
}
class Customer implements Runnable{
    private String name;
    private Account account;
    public Customer(Account account,String n){
        this.account=account;
        name =n;
    }
    public void run(){
        synchronized(account){
        Scanner sc = new Scanner(System.in);
        System.out.println(name+" ,Enter amount to withdraw");
        int amt = sc.nextInt();
        if(account.isSufficientBalance(amt)){
            System.out.println(name);
            account.withdraw(amt);
        }
        else
        System.out.println("insufficient balance ");
    }
    }
}
public class Synchronized_test {
    public static void main(String[] args) {
        Account a = new Account(1000);
        Customer c = new Customer(a,"vikash");
        Customer c1 = new Customer(a,"bk");
        Thread t1 = new Thread(c);
        Thread t2 = new Thread(c1);
        t1.start();
        t2.start();
    }
}
