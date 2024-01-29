package conversion;

public class obj_str {
    public static void main(String[] args) {
        // obj_str obj = new obj_str();
        // String s = obj.toString();
        // String s1 = String.valueOf(obj);
        // System.out.println(s);
        // System.out.println(s1);
        String str = "nitin";
        StringBuilder s = new StringBuilder(str);
        s.reverse();
        String rev = s.toString();
        if(str.equals(rev)){
            System.out.println("palondrome");
        }
        else{
            System.out.println("not palindrome ");
        }

    }
}
