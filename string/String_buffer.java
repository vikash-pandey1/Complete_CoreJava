public class String_buffer {
    public static void main(String[] args) {
        StringBuffer bfr = new StringBuffer("vikash");
        //StringBuffer bfr2 = new StringBuffer("pandey");
        //bfr.append(bfr2);            //for join two string  
        //bfr.insert(0, "hello");          // for insert a string 
        //bfr.replace(0, 0, "kya baat h pandat ji");  // for replace word  between from to end 
        //bfr.delete(0, 5);   // for delete between from to end 
        //bfr.reverse();       // for reverse a string
        bfr.append("pandey ji you are ");
        System.out.println(bfr.capacity());
        bfr.ensureCapacity(50);
        System.out.println(bfr.capacity());
        System.out.println(bfr.charAt(3));
        System.out.println(bfr.length());
        System.out.println(bfr.substring(0));
        System.out.println(bfr.substring(0, 13));
    }
}
