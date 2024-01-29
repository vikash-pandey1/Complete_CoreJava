class InvalidAgeException extends Exception{
    InvalidAgeException(String str){
        System.out.println(str);
    }
}
public class throw_user {
    public static void main(String[] args) {
        try {
            vote(12);
        } catch (Exception e) {
            System.out.println(e);
        }
    }
    public static void vote(int age) throws InvalidAgeException{
        if(age<18){
        throw new InvalidAgeException("not eligible to vote");
        }
        else{
            System.out.println("you are eligible to vote");
        }
    }
    
}
