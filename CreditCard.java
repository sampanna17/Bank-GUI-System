
/**
 * Write a description of class CreditCard here.
 *
 * @author (22067519 Sampanna Piya)
 * @version (1.0.0)
 */
public class CreditCard extends BankCard
{
    //Attributes : private
    private int cvcNumber;
    private double creditLimit;
    private double interestRate;
    private String expirationDate;
    private int gracePeriod;
    private boolean isGranted;

    //Parameterized Constructor
    public CreditCard(double balanceAmount, int cardId, String bankAccount, String issuerBank, String clientName, int cvcNumber, double interestRate, String expirationDate){
        //call the parent class constructor
        super(balanceAmount, cardId, bankAccount, issuerBank);
        //setter method setclientName()
        setClientName(clientName);
        this.cvcNumber = cvcNumber;
        this.interestRate = interestRate;
        this.expirationDate = expirationDate;
        //set flag to false
        this.isGranted = false;
    }
    
    //getter for getCvcNumber
    public int getCvcNumber(){
        return cvcNumber;
    }
    
    //getter for getCreditLimit
    public double getCreditLimit(){
        return creditLimit;
    }
    
    //getter for getInterestRate
    public double getInterestRate(){
        return interestRate;
    }
    
    //getter  for getExpirationDate
    public String getExpirationDate(){
        return expirationDate;
    }
    
    //getter for getGracePeriod
    public int getGracePeriod(){
        return gracePeriod;
    }
    
    //getter for getIsGranted
    public boolean getIsGranted(){
        return isGranted;
    }
    //creating method for setCreditLimt
    public void setCreditLimit(double creditLimit, int gracePeriod){
        //using if else condition
        if (creditLimit <= 2.5 * getBalanceAmount()){
            this.creditLimit = creditLimit;
            this.gracePeriod = gracePeriod;
            //set flag to true
            this.isGranted = true;
        } else {
            System.out.println("Credit cannot be issued.");
        }
    }
    
    //creating method for cancelCreditCard
    public void setCancelCreditCard(){
            this.cvcNumber = 0;
            this.creditLimit = 0;
            this.gracePeriod = 0;
            this.isGranted = false;
    }
    
    //Display method
    public void display(){
        //calling the parent class display method
        super.display();
        if (isGranted = true){
            System.out.println("CVC number: " + cvcNumber);
            System.out.println("Credit limit: " + creditLimit);
            System.out.println("Interest rate: " + interestRate);
            System.out.println("Expiration date: " + expirationDate);
            System.out.println("Grace period: " + gracePeriod);
        } else {
            System.out.println("No credit has been granted yet.");
        }
    }
}

