///// Same as example 2 just string to string use kora hoice //////////

package Example3;

import Example3.BankAccount;

public class BankAccount 

{
    public String Accountnumber;
    public String AccountHolderName;
    public double Balance;
    
    
	public BankAccount(String accountnumber, String accountHolderName, double balance) 
	
	{
		super();
		
		Accountnumber = accountnumber;
		AccountHolderName = accountHolderName;
		Balance = balance;
	
		
	}
	

	
	public void Deposit(double ammount)
	{
		
		System.out.println(" You Have : " + Balance  + " Taka  In Your Account ");
		System.out.println(" Deposit Ammount Is : " + ammount + " Taka ");
		Balance = Balance + ammount;
		System.out.println(" After Deposit The Balance  Is : " + Balance  + " Taka ");
		System.out.println(" ");
		
	}
    
	public void Withdraw(double ammount)
	{
		System.out.println(" You Have Currently  : " + Balance  + " Taka  In Your Balance ");
		
		System.out.println(" How Much You Wanna Withdraw ? ");
		System.out.println(" You Wanna withdraw " + ammount + " Taka ");
		
		
		if (ammount> Balance )
		{
			
			System.out.println(" You cant withdraw " + ammount + " Taka Because You Have Less Balance Than withdrawal Ammount ");
			
		}
		
		else
		{
			Balance = Balance - ammount;
			System.out.println(" After Withdraw You Have : " + Balance  + " Taka  In Your Balance ");
			
		}
		System.out.println(" ");
		
	}
	
	public void Transfer(BankAccount other ,double ammount)
	
	{
		System.out.println(" *******************  Transferring From One Account To Another ******************* ");
		
		
		Balance = Balance- ammount;
		
		System.out.println(" After Transferrring " + ammount + " Taka From  Account " + Accountnumber+ " Your Current Balance is " + Balance + " Taka ");
		System.out.println(" ");
		
	}

	@Override
	public String toString()
	{
		return "BankAccount [Accountnumber=" + Accountnumber + ", AccountHolderName=" + AccountHolderName + ", Balance="
				+ Balance + "]";
		
	}
	
	
	
    
    
    
    
}
