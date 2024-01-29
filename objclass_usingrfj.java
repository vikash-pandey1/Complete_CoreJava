class costom{
    int id;
    String name;
    public void printd(){
        System.out.println("my id is: "+id);
        System.out.println("my name is: "+ name);
    }
}
public class objclass_usingrfj {
    public static void main(String[] args) {
        costom vp = new costom();
        costom bk = new costom();
        bk.id=19;
        bk.name = "bk";
        vp.id=10;
        vp.name="vikash";
        vp.printd();
        bk.printd();

    }
}
