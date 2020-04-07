package Example1;

public class Student {

	
	
	String name;
	String id;
	String cgpa;
	
	public Student(String name, String id, String cgpa) 
	
	{
		super();
		this.name = name;
		this.id = id;
		this.cgpa = cgpa;
		
	}
	
	public void show ()
	{
		System.out.println(" My Name : "+name);
		System.out.println(" Id : "+id);
		System.out.println(" My Cgpa : "+cgpa);
		WriteFile.WriteStudent(name, id, cgpa); 
		
	}
	//WriteFile.WriteStudent(name, id, cgpa); 
	//WriteFile.WriteStudent(String name, String id, String cgpa); 
	
	
	
	
}
