import java.util.Scanner;



public class PaymentAccounttest{
    public class lowBalanceException extends Exception{
        public lowBalanceException(String errorMessage){
            super(errorMessage);
        }
   }


 
    
    public static void main(String[] args) {

        PaymentAccount P1 = new PaymentAccount("AN22345", 30.00);
        PaymentAccount P2 = new PaymentAccount("GH12657", 678.00);
        PaymentAccount P3 = new PaymentAccount("AN23478", 167.00);
        PaymentAccount P4 = new PaymentAccount("AC05044", 999.00);



        System.out.println(P1);
        System.out.println(P2);
        System.out.println(P3);
        P1.deposit(50.00);
        P2.deposit(120.00);
        P3.deposit(410.00);

        System.out.println("The balance in this account is "+P1.getAccountBalance());
        System.out.println("The balance in this account is "+P2.getAccountBalance());
        System.out.println("The balance in this account is "+P3.getAccountBalance());
        System.out.println("The balance in this account is "+P4.getAccountBalance());
        
        try {
            P1.withdraw(30.00);
            System.out.println("Withdrawal successful");

        } catch (PaymentAccount.lowBalanceException e) {
            System.out.println("balance is too low to mmake this withdrawal");
        }


        try {
            P2.withdraw(50.00);
            System.out.println("Withdrawal successful");

        } catch (PaymentAccount.lowBalanceException e) {
            System.out.println("balance is too low to mmake this withdrawal");
        }

        try {
            P1.withdraw(3000.00);
            System.out.println("Withdrawal successful");

        } catch (PaymentAccount.lowBalanceException e) {
            System.out.println("balance is too low to mmake this withdrawal");
        }
          
          
          
    
}
}



        
        


    
