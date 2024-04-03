
/**
 * Write a description of class DebitCard here.
 *
 * @author (22067519 Sampanna Piya)
 * @version (1.0.0)
 */  
public class DebitCard extends BankCard 
{
    //attribute : private
    private int pinNumber;
    private int withdrawalAmount;
    private String dateOfWithdrawal;
    private boolean hasWithdrawn;
    
    //Parameterized Constructor [parameters order as BankCard]
    public DebitCard(double balanceAmount, int cardId, String bankAccount, String issuerBank, String clientName, int pinNumber) {
        //call the parent class constructor
        super(balanceAmount, cardId, bankAccount, issuerBank);
        //setter method setclientName()
        setClientName(clientName);
        this.pinNumber = pinNumber;
        //set flag to false
        hasWithdrawn = false;
    }

    //setter for setWithdrawlAmount
    public void setWithdrawalAmount(int withdrawalAmount){
        this.withdrawalAmount = withdrawalAmount;
    }
    
    //getter for PinNumber
    public int getPinNumber(){
        return pinNumber;
    }
    
    //getter for WithdrawlAmount
    public int getWithdrawalAmount(){
        return withdrawalAmount;
    }
    
    //getter for dateOfWithdrawl
    public String getDateOfWithdrawal(){
        return dateOfWithdrawal;
    }
    
    //getter for getHasWithdrawn
    public boolean getHasWithdrawn(){
        return hasWithdrawn;
    }

    //void withdraw(withDrawl amount, dateOf withdrawl, PIN number)
    public void withdraw(int withdrawalAmount, String dateOfWithdrawal, int pinNumber) {
        if (this.pinNumber == pinNumber && super.getBalanceAmount() >= withdrawalAmount) {
            this.setBalance(this.getBalanceAmount() - withdrawalAmount);
            this.withdrawalAmount = withdrawalAmount;
            this.dateOfWithdrawal = dateOfWithdrawal;
            //set the flag to true
            hasWithdrawn = true;
            //calculate remaining balance
            System.out.println("Withdrawal successful. New balance: " + this.getBalanceAmount());
        } else if (this.pinNumber != pinNumber){
            // display error message
            System.out.println("Invalid pin number. Please Enter valid PIN number.");
        } else {
            // display error message
            System.out.println("Insufficient balance. Withdrawal failed.");
        }
    }

    //display method
    public void display() {
        //calling the parent class display method 
        super.display();
        System.out.println("Pin number: " + pinNumber);
        //using if then else condition
        if (hasWithdrawn) {
            System.out.println("Withdrawal amount: " + withdrawalAmount);
            System.out.println("Date of withdrawal: " + dateOfWithdrawal);
        } else {
            // display error message
            System.out.println("No withdrawal has been made yet."+ getBalanceAmount());
        }
    }
}   

    
    
    
    
    
    

