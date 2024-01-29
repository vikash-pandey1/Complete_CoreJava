class Student{
    int id;
    int salary;
    String name;
    public void enter(int s,int i, String n){
        salary =s;
        name = n;
        id = i;
    }
    public void display(){
        System.out.println(name+" "+salary+" "+id);
    }
}
public class objusing_constru {
    public static void main(String[] args) {
        Student s = new Student();
        Student p = new Student();
        Student q = new Student();
        s.enter(80000, 19, "bk");
        p.enter(100000, 64,"vinay" );
        q.enter(150000, 63, "pandey");
        s.display();
        p.display();
        q.display();
    }
}
