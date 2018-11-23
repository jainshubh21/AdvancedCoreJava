import java.io.*;

public class WriteEmployeeObject 
{
	public static void main(String arg[])
	{
		try
		{
		FileOutputStream fos = new FileOutputStream("C:\\Users\\Admin\\Desktop\\Objecct.txt");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		Employee emp = new Employee();
		emp.empid=1001;
		emp.empName="shubham";
		emp.password="niit123";
		oos.writeObject(emp);
		System.out.println("Object has been written to the file");

		oos.close();
		//fos.close();
		}
		catch(Exception e)
		{
			System.out.println("Exception Arised: "+e);
		}
		
	}

}
