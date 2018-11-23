import java.io.*;

public class Deserialization 
{
	public static void main(String arg[])
	{
		try
		{	
		FileInputStream fis = new FileInputStream("C:\\Users\\Admin\\Desktop\\Objecct.txt");
		ObjectInputStream oos = new ObjectInputStream(fis);
		Employee obj = (Employee)oos.readObject();
		
		System.out.println(obj);
		oos.close();
		}
		catch(Exception e)
		{
			System.out.println("Exception Arised"+e);
		}
	}
	

}
