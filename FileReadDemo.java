import java.io.*;
public class FileReadDemo 
{
	public static void main(String arg[])
	{
		try
		{
		FileInputStream fstream = new FileInputStream("C:\\Users\\Admin\\Desktop\\coverletter.txt");
		//int available = fstream.available();
		byte buff[] = new byte[1000];
		fstream.read(buff,0,1000);
		String content = new String(buff);
		System.out.println(content);
		fstream.close();
		}
		catch(Exception e)
		{
			System.out.println("Exception Arised:"+e);
		}
	}

}
