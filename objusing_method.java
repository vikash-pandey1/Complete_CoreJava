class student{
    int id;
    String name;
    void print(int i,String n){
        id=i;
        name=n;
    }
    public void display(){
        System.out.println(id+" "+name);
    }

}
public class objusing_method {
    public static void main(String[] args) {
        student s = new student();
        student s1 = new student();
        s.print(63, "vikash");
        s1.print(19, "bk");
        s.display();
        s1.display();
    }
}
