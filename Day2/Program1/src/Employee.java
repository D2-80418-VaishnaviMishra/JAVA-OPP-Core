
public class Employee {
	String firstName;
	String lastName;
	double salary;
	
	
public Employee() {
		
		
		this.firstName = "abc";
		
		this.lastName = "xyz";
		
		this.salary = 0.0;
		
		
	}

public Employee(String firstName, String lastName, double salary) {
	
	this.firstName = firstName;
	this.lastName = lastName;
	this.salary = salary;
	
	
}

	public String getFirstName() {
	return firstName;
}


public void setFirstName(String firstName) {
	this.firstName = firstName;
}


public String getLastName() {
	return lastName;
}


public void setLastName(String lastName) {
	this.lastName = lastName;
}

public double getSalary() {
	return salary;
}

public void setSalary(double salary) {
	this.salary = salary;
}

public void Accept(String First ,String Last ,double sal) {
	Employee e = new Employee();
	this.firstName = First;
	this.lastName = Last;
	if(sal> 0 ) {
		this.salary = sal;}
		
		
	
	
}



public void Display() {
	
	System.out.println("Name of the employee is "+firstName +" "+ lastName);
	if(this.salary > 0) {
	System.out.println("Salary is "+salary);}
	else
	{System.out.println("Enter Valid Salary");}
	
}







	public static void main(String[] args) {
		
		Employee e1 =  new Employee() ;
		//e1.Display();
		e1.setFirstName("Tarang");
		e1.setLastName("Singh");
		e1.setSalary(2000);
		e1.Display();
		Employee e2 = new Employee();
		//e2.Display();
		e2.Accept("Rohit", "Parihar", -5000); 
		e2.Display();
		e2.setSalary(-3000);
		e2.Display();
		
		
		

	}

}
