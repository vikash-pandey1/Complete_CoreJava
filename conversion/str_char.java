package conversion;

public class str_char {
    public static void main(String[] args) {
        String s = "vikash";
        for(int i=0;i<s.length();i++){
            char c = s.charAt(i);
            System.out.println("char at "+i+"  index is "+c);
        }
    }
}
