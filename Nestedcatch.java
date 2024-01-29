public class Nestedcatch {
    public static void main(String[] args) {
        try {
            int a[] = new int[5];
            System.out.println(a[10]);
        } 
        catch (ArithmeticException e) {
            System.out.println(e);
        }
        catch (IndexOutOfBoundsException e){
            System.out.println(e);
        }
        catch(NullPointerException e){
            System.out.println(e);
        }
        catch(Exception e){
            System.out.println("parent class exception ");
        }
        System.out.println("rest of the code ");
    }
}
