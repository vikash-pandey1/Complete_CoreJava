class Real{
    int accountno ;
    String name;
    int amount;
    void enter(int ac,int a,String n){
        accountno =ac;
        amount =a;
        name =n;
    }
    void deposite(int amt){
        amount = amount+amt;
        System.out.println(amt+" deposited");
    }
    void withdraw(int wid){
        if(amount<wid){
            System.out.println("ensufficient");
        }
        else{
        amount = amount-wid;
        System.out.println(wid+" withdaw");
        }
    }
    void checkbalanse(){
        System.out.println("balance is:"+amount);
    }
    void display(){
        System.out.println(" bank info is: "+accountno+" "+name+" "+amount);
    }

}
public class realworld_method {
    public static void main(String[] args) {
        Real r = new Real();
        r.enter(10101, 100000, "pandat");
        r.display();
        r.deposite(100000);
        r.withdraw(200000);
        r.checkbalanse();
    }
}
