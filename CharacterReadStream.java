import java.io.*;
public class CharacterReadStream 
{
	public static void main(String arg[])
	{
		try
		{
			FileReader ofr = new FileReader("C:\\Users\\Admin\\Desktop\\MyContent.txt");
			char buff[] = new char[100];
			ofr.read(buff);
			String content = new String(buff);
			System.out.println(content);
			ofr.close();
					
				
		}
		catch(Exception e)
		{
			System.out.println("Exception Arised:"+e);
		}
	}

}
