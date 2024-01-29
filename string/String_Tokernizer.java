import java.util.StringTokenizer;

public class String_Tokernizer {
    public static void main(String[] args) {
        /*StringTokenizer st = new StringTokenizer("welcome to string tokenerizer class");
        while(st.hasMoreTokens()){      // use of string nextToken() method without  String delim
            System.out.println(st.nextToken());
        }*/
        /*StringTokenizer st = new StringTokenizer("welcome,to,nextToken,delim,method");
        System.out.println("nextToken is: "+st.nextToken(",,"));*/    // use of nextToken method(string delim)
        /*StringTokenizer object */
        /*StringTokenizer st = new StringTokenizer("welcome to hasmoreTokens method"," ");
        while(st.hasMoreTokens())             // check if the string has more token
        {
            System.out.println(st.nextToken()); // use 
        }*/
        /*StringTokenizer st = new StringTokenizer("welcome to hasmoreElements method"," ");
        while(st.hasMoreElements()){
            System.out.println(st.nextToken());
        }*/
        /*StringTokenizer st = new StringTokenizer("welcome to nextElements method","  ");
        while(st.hasMoreTokens()){
            System.out.println(st.nextElement());
        }*/
        StringTokenizer st = new StringTokenizer("welcome to count Tokens method");
            System.out.println(st.countTokens());

    }
}
