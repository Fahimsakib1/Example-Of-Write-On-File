package Example1;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class WriteFile

{
     
	
public static void WriteStudent(String n, String i, String c)
	
	{
	
	File file = new File("src\\StudentDetails.txt");
	//Print Writer
	//PrintWriter out;
	try {
		PrintWriter out = new PrintWriter(file);
		out.println(" My Name : "+n);
		out.println("Id  "+i);
		out.println(" My Cgpa "+c);
		out.close();
	} catch (FileNotFoundException e) 
	{
		e.printStackTrace();
	}
	
	}
}
