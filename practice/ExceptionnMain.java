public class ExceptionnMain {
    public static void main(String[] args) {

        try {
           

            Exceptionnerror.divide(45, 0);
            
        } 
        catch (ArithmeticException e) {
            System.out.println(e);
        }
    }
}