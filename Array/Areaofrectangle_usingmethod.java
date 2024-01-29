class Cons{
    int length;
    int width;
    void enter(int l,int w){
        length = l;
        width = w;

    }
    void display (){
        System.out.println(length*width);
    }
}
public class Areaofrectangle_usingmethod {
    public static void main(String[] args) {
     Cons p = new Cons();
    p.enter(2,3);
    p.display();
    }
}
