
import java.util.*;
class InsufficientBalanceException extends Exception{
    public InsufficientBalanceException(String message){
        super(message);
    }
}
class CustomException{
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        try
        {
            double availableBalance=in.nextDouble();
            double withdrawalamount=in.nextDouble();
            processWithdrawal(availableBalance,withdrawalamount);
            System.out.println("Transaction successful.");
        }
        catch(InsufficientBalanceException e){
            System.out.println("Insufficient balance: "+e.getMessage());
        }
        catch(Exception e){
            System.out.println("An error occured: "+e.getMessage());
        }
    }

    public static void processWithdrawal(double availableBalance,double withdrawalamount)throws InsufficientBalanceException{
            if(withdrawalamount>availableBalance)
            {
                throw new InsufficientBalanceException("Insufficient balance to perform the withdrawal.");
            }
        }
}