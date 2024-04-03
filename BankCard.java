
/**
 * Write a description of class BankCard here.
 *
 * @author (22067519 Sampanna Piya)
 * @version (1.0.0)
 */
public class BankCard
{
    //attributes : private
    private int cardId;
    private String clientName;
    private String issuerBank;
    private String bankAccount;
    private double balanceAmount;

    //Parameterized constructor
    public BankCard(double balanceAmount, int cardId, String bankAccount, String issuerBank){
        this.balanceAmount = balanceAmount; // assign the value of balanceAmount parameter to the balanceAmount attribute
        this.cardId = cardId; // assign the value of cardId parameter to the cardId attribute
        this.bankAccount = bankAccount; // assign the value of bankAccount parameter to the bankAccount attribute
        this.issuerBank = issuerBank; // assign the value of issuerBank parameter to the issuerBank attribute
        this.clientName = ""; // initialize the clientName attribute to an empty string
    }

    //setter setclientname for accepting client name
    public void setClientName(String clientName){
        this.clientName = clientName;
    }

    //setter setbalance for accepting new balance
    public void setBalance(double balanceAmount){
        this.balanceAmount = balanceAmount;
    }

    //getter for balanceAmount 
    public double getBalanceAmount(){
        return this.balanceAmount;
    }

    //getter for cardId
    public int getCardId(){
        return this.cardId;
    }

    //getter for bankAccount
    public String getBankAccount(){
        return this.bankAccount;
    }

    //getter for issuerBank
    public String getIssuerBank(){
        return this.issuerBank;
    }
    
    public String getClientName(){
        return this.clientName;
    }

    //display method
    public void display (){
        if(this.clientName == ""){
            System.out.println("Invalid name entered. Please try again later");
        }
        else{
        System.out.println("ClientName: " + clientName);
        }
        System.out.println("CardId: " + cardId);
        System.out.println("IssuerBank: " + issuerBank);
        System.out.println("BankAccount: " + bankAccount);
        System.out.println("BalanceAmount: " + balanceAmount);
    }
}