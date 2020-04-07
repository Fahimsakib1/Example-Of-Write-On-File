package Example2;

public class Test {

	public static void main(String[] args) 
	
	{
		BankAccount A = new BankAccount ("11-22-33"," Fahim ", 8000.00);
		
		BankAccount B = new BankAccount ("44-55-66"," Sakib ", 5000.00);
		
		A.Details();
		A.Deposit(2000.00);
		A.Withdraw(1000.00);
		
		B.Details();
		
		A.Transfer(B, 1700.00);
		B.Deposit(1500.00);
		
		
		
		

	}

}
