package Coursework;


/**
 * Write a description of class BankCard here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class BankCard
{
    // declearing instance variables
    private int cardID;
    private String clientName,issuerBank,bankAccount;
    private double balanceAmount;
    
    public BankCard(double balanceAmount,int cardID,String bankAccount,String issuerBank)
    {
       this.cardID=cardID;
       this.balanceAmount=balanceAmount;
       this.issuerBank=issuerBank;
       this.bankAccount=bankAccount;
       this.clientName="";
    }
    
    public int getCardID()//accesser method for cardid
    {
        return this.cardID;
    }
    
    public String getClientName()//accesser method for client name
    {
        return this.clientName;
    }
    
    public String getIssuerBank()//accesser method for issuer bank
    {
        return this.issuerBank;
    }
    
    public String getBankAccount()//accesser method for Bank Account
    {
        return this.bankAccount;
    }
    
    public double getBalanceAmount()//accesser method for balance amount
    {
        return this.balanceAmount;
    }
    
    public void setClientName(String clientName)//setter method for client name.
    {
        this.clientName=clientName;
    }
    
    public void setBalanceAmount(double balanceAmount)//setter method for client name.
    {
        this.balanceAmount=balanceAmount;
    }
    
    public void display()
    {
        if(clientName.equals(""))
        {
            System.out.println("Please enter the client name.");
        }
        else
        {
            System.out.println("Name: "+this.clientName);
            System.out.println("Issuer Bank: "+this.issuerBank);
            System.out.println("Card ID: "+this.cardID);
            System.out.println("Bank Account: "+this.bankAccount);
            System.out.println("Balance Amount: "+this.balanceAmount);
        }
    }
}
