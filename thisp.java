class person{
    int id;
    int fee;
    String name,course;
    person(int id,String name,String course){
        this.id = id;
        this.name = name;
        this.course = course;
    }
    person (int id,String name,String course,int fee){
        this(id,name,course);
        this.fee = fee;
    }
    void display(){
        System.out.println(id+" "+ name+" "+course+" "+fee);
    }
}

public class thisp {
    public static void main(String[] args) {
        person p = new person(63, "vikash", "b.tech");
        person p1 = new person(19, "bk", "b.tech", 180000);
        p.display();
        p1.display();
    }
}
