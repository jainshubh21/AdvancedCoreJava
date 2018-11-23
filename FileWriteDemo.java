import java.io.*;

public class FileWriteDemo 
{
	public static void main(String arg[])
	{
		try
		{
			FileOutputStream fos = new FileOutputStream("C:\\Users\\Admin\\Desktop\\MyContent.txt");
			String Content = "My Name is Shubham jain";
			for(int count = 0 ; count < Content.length() ; count++)
			{
				fos.write(Content.charAt(count));
			}
			System.out.println("Content Has been written to file");
			fos.close();
			
		}
		catch(Exception e)
		{
			System.out.println("Exception Arised:"+e);
		}
	}

}
