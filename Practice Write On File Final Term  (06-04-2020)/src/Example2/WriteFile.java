package Example2;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class WriteFile

{
     
	
public static void WriteBankAccount(String AccNumber, String name, double amount)
	
	{
	
	File file = new File("src\\BankAccountDetails.txt");
	//Print Writer
	//PrintWriter out;
	try {
		PrintWriter out = new PrintWriter(file);
		out.println(" Account Number Is   : "+AccNumber);
		out.println(" Account Holder Name  "+name);
		out.println(" Initial ammount "+amount + " Taka ");
		out.close();
	} catch (FileNotFoundException e) 
	{
		e.printStackTrace();
	}
	
	}



public static void WriteDeposit(double amount)

{

File file = new File("src\\ShowDepositDetails.txt");
//Print Writer
//PrintWriter out;
try {
	PrintWriter out = new PrintWriter(file);
	
	out.println(" Deposit  Ammount "+amount + " Taka ");
	out.close();
} catch (FileNotFoundException e) 
{
	e.printStackTrace();
}

}


public static void WriteWithdraw(double amount)

{

File file = new File("src\\WithdrawDetails.txt");
//Print Writer
//PrintWriter out;
try {
	PrintWriter out = new PrintWriter(file);
	
	out.println(" Withdraw  Ammount "+amount + " Taka ");
	out.close();
} catch (FileNotFoundException e) 
{
	e.printStackTrace();
}

}

public static void WriteTransfer(double amount)

{

File file = new File("src\\TransferDetails.txt");
//Print Writer
//PrintWriter out;
try {
	PrintWriter out = new PrintWriter(file);
	
	out.println(" Transferring  Ammount "+amount + " Taka ");
	out.close();
} catch (FileNotFoundException e) 
{
	e.printStackTrace();
}

}









}
