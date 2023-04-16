package Coursework;


/**
 * Write a description of class CreditCard here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class CreditCard extends BankCard
{
   private int cvcNumber;
   private double creditLimit;
   private double interestRate;
   private String expirationDate;
   private int gracePeriod;
   private boolean isGranted;
   
   public CreditCard(int cardID,String clientName,String issuerBank,String bankAccount,double balanceAmount,int cvcNumber,double interestRate,String expirationDate)
   {
       super(balanceAmount,cardID,bankAccount,issuerBank);
       setClientName(clientName);
       this.cvcNumber=cvcNumber;
       this.interestRate=interestRate;
       this.expirationDate=expirationDate;
       this.isGranted=false;

    }
    
    public int getCvcNumber()//accesser method
    {
        return this.cvcNumber;
    }
    
    public double getCreditLimit()//accesser method
    {
        return this.creditLimit;
    }
    
    public double getInterestRate()//accesser method
    {
        return this.interestRate;
    }
    
    public String getExpirationDate()//accesser method
    {
        return this.expirationDate;
    }
    
    public int getGracePeriod()//accesser method
    {
        return this.gracePeriod;
    }
    
    public boolean IsGranted()//accesser method
    {
        return this.isGranted;
    }
    
    public void setCreditLimit(double creditLimit,int gracePeriod)
    {
        if(creditLimit <= 2.5 * getBalanceAmount())
        {
            this.creditLimit=creditLimit;
            this.gracePeriod=gracePeriod;
            isGranted = true;
            System.out.println("Credit is granted");
        }
        else
        {
            System.out.println("Credit can't be issued. Please check balance requirement.");
        }
    }
    
    public void cancelCreditCard()
    {
        if(isGranted)
        {
            this.cvcNumber=0;
            this.creditLimit=0;
            this.gracePeriod=0;
            this.isGranted=false;
            System.out.println("Your Credit Card is cancelled.");
        }
    }
    
    public void display() //Display method for credit card class.
    {
        if(isGranted=!true)
        {
            super.display();
            System.out.println("CVC Number: " + cvcNumber);
            System.out.println("Interest Rate: " + interestRate);
            System.out.println("Expiration Date: " + expirationDate);
        }
        else
        {
            super.display();
            System.out.println("CVC Number: " + cvcNumber);
            System.out.println("Interest Rate: " + interestRate);
            System.out.println("Expiration Date: " + expirationDate);
            System.out.println("Grace Period: " + gracePeriod);
            System.out.println("Credit Limit: " + creditLimit);
            
        }
    }    
    
    
    
    
    
    
    
    
    
    
    
    

    
}
