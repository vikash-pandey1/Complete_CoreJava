package exception_with_method_override;

class invalidageexcepiton extends Exception{
    public invalidageexcepiton(String str){
        super(str);
    }
}
public class costom_exp {
        static void validata(int age) throws invalidageexcepiton{
            if(age<=18){
                throw  new invalidageexcepiton("age is not valid to vote")
            }
            else{
                System.out.println("welcome to vote");
            }
        }
        public static void main(String[] args) {
            try {
                validata(12);
            } catch (invalidageexcepiton e) {
                System.out.println("caught the exception");
                System.out.println(e);
            }
            System.out.println("rest of the code");
        }
    }
