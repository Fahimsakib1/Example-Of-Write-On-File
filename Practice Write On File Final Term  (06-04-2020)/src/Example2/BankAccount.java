package Example2;

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
	
	public void Details ()
	{
		System.out.println(" Accountnumber : " + Accountnumber);
		System.out.println(" Account Holder Name : " + AccountHolderName);
		System.out.println(" Starting Balance is :  " + Balance);
		System.out.println(" ");
		WriteFile.WriteBankAccount(Accountnumber,AccountHolderName , Balance);
		
	}
	
	public void Deposit(double ammount)
	{
		
		System.out.println(" You Have : " + Balance  + " Taka  In Your Account ");
		System.out.println(" Deposit Ammount Is : " + ammount + " Taka ");
		Balance = Balance + ammount;
		System.out.println(" After Deposit The Balance  Is : " + Balance  + " Taka ");
		
		WriteFile.WriteDeposit(ammount);
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
		WriteFile.WriteWithdraw(ammount);
		
	}
	
	public void Transfer(BankAccount other ,double ammount)
	
	{
		System.out.println(" *******************  Transferring From One Account To Another ******************* ");
		
		
		Balance = Balance- ammount;
		
		System.out.println(" After Transferrring " + ammount + " Taka From  Account " + Accountnumber+ " Your Current Balance is " + Balance + " Taka ");
		
		WriteFile.WriteTransfer(ammount);
		System.out.println(" ");
		
	}
    
    
    
    
}
