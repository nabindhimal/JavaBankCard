package Coursework;


/**
 * Write a description of class DebitCard here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class DebitCard extends BankCard
{
    private int pinNumber;
    private double withdrawlAmount;
    private String dateOfWithdrawl;
    private boolean hasWithdrawn;
    
    public DebitCard(double balanceAmount,int cardID,String bankAccount,String issuerBank,String clientName,int pinNumber )
    {
        super(balanceAmount,cardID,bankAccount,issuerBank);
        super.setClientName(clientName);
        this.withdrawlAmount=0;
        this.dateOfWithdrawl="";
        this.pinNumber=pinNumber;
        this.hasWithdrawn=false;
    }
    
    public int getPinNumber()//accesser method
    {
        return this.pinNumber;
    }
    
    public double getWithdrawlAmount()//accesser method
    {
        return this.withdrawlAmount;
    }
    
    public String getDateOfWithdrawl()//accesser method
    {
        return this.dateOfWithdrawl;
    }
    
    public boolean getHasWithdrawn()//accesser method
    {
        return this.hasWithdrawn;
    }
    
    public void setWithdrawlAmount(double withdrawlAmount)//mutator method for withdrawl amount
    {
        this.withdrawlAmount=withdrawlAmount;
    }
    
    public void Withdraw(double withdrawlAmount,String dateOfWithdrawl,int pinNumber) //Withdraw method for deducting money on transactions.
    {
        if(this.pinNumber==pinNumber&&getBalanceAmount()>=withdrawlAmount)
        {
            System.out.println(withdrawlAmount+" has been withdrawn from your account.");
            System.out.println("Please take your card back.");
            setBalanceAmount(getBalanceAmount()-withdrawlAmount);
            this.hasWithdrawn=true;
            this.dateOfWithdrawl=dateOfWithdrawl;
            
        }
        else if(this.pinNumber!=pinNumber)
        {
            System.out.println("Invalid Pin Number");
        }
        else if(getBalanceAmount()<withdrawlAmount)
        {
            System.out.println("Insufficient Balance");
        }
        else
        {
            System.out.println("Please check your pin number or balance amount and try again.");
        }
        
        this.hasWithdrawn=false;
    }
    
    public void display() //Display method for debit card class.
    {
        super.display();
        {
            if(this.hasWithdrawn==true)
            {
                System.out.println("Your pin number is: "+this.pinNumber);
                System.out.println(this.withdrawlAmount+" has been withdrawn from your account at "+this.dateOfWithdrawl);
            }
            else
            {
               System.out.println("Your current balance is: "+getBalanceAmount()); 
            }
            }
        }    
    }

    
    
    
   
    
    
    
    
    
    
   

