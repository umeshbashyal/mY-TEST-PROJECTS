

public class BankAccountMain {
    public static void main(String[] args) {
        BankAccount b1=new BankAccount();
        
        b1.setAccountNumber(9870974);
        b1.deposit(5000);
        b1.withdrawl(2000);

        System.out.println("the remaining balance is"+b1.getBalance());













    }

    
}