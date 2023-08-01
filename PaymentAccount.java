import java.util.Scanner;

public class PaymentAccount{
    //TO DO: DECLARE THE INSTANCE VARIABLES OF THIS CLASS
    private String accountNumber;
    private Double initialDeposit;
    private Double accountBalance;
    public static Double MINBALANCE = 150.00;
    Scanner input = new Scanner(System.in);



    //TO DO: DEFINE THE VARIOUS METHODS FOR THE CLASS
    public PaymentAccount(){
                //this is a default constructor
    }

    

    public PaymentAccount(String accNum, Double initial){
        this.accountNumber = accNum;
        this.initialDeposit = initial;

    }
    
    public String toString(){
        return "This payment's account number is "+this.accountNumber;
    }


    // Double newAmount = input.nextDouble();
    public Double deposit(Double newAmount){
        return this.accountBalance = newAmount+initialDeposit;
    }

    public class lowBalanceException extends Exception{
        public lowBalanceException(String errorMessage){
            super(errorMessage);
        }
   }

   String errorMessage;

    public Double withdraw(Double amount) throws lowBalanceException{
        
        if(this.accountBalance < MINBALANCE|| this.accountBalance - amount < MINBALANCE){
             throw new lowBalanceException(errorMessage);
            }
            return accountBalance - amount;

    }

    public void setAccountNumber(String account){
        this.accountNumber = account;

    }

   public String getAccountNumber(){
    return this.accountNumber;
   }

   public Double getAccountBalance(){
    return this.accountBalance;
   }
}