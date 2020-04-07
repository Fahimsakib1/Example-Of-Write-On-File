package Example3;

import Example3.BankAccount;

public class Test {

	public static void main(String[] args) 
	
	{
		BankAccount A = new BankAccount ("11-22-33"," Fahim ", 8000.00);
		System.out.println(A);
		
		BankAccount B = new BankAccount ("44-55-66"," Sakib ", 5000.00);
		System.out.println(B);
		
		
		A.Deposit(2000.00);
		System.out.println(A);
		
		A.Withdraw(1000.00);
		System.out.println(A);
		
		
		A.Transfer(B, 1000.00);
		System.out.println(A);
		System.out.println(B);
		
		
		
		

	}

}
