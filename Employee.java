import java.io.Serializable;

public class Employee implements Serializable
{
	int empid;
	String empName;
	transient String password;
	
	public Employee()
	{
		
	}
	
	public String toString()
	{
		return "Employee ID:"+empid+" Employee Name:"+empName+" Password:"+password;
	}

}
