package charles2803;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import java.io.FileWriter;

public class FileHandle2
{
	public static void main(String args[]) throws IOException
	{
		System.out.println("FILE HANDLING");
		File obja=new File("D:\\java");
		if(obja.mkdir())
			System.out.println("Directory Created");
		
		File ob1=new File("D:\\java\\charles.txt");
		if(ob1.createNewFile())
			System.out.println("File Created");
		
		FileWriter ob=new FileWriter("D:\\java\\charles.txt");
		ob.write("ECHA RAGHUL");
		ob.close();
		System.out.println("File Updated");
		
		File obj=new File("D:\\java\\charles.txt");
		Scanner obj1=new Scanner(obj);
		while(obj1.hasNext()) // predefined method in Scanner class
			
		{
			String obj2=obj1.nextLine();
			System.out.println(obj2);
		}
		obj1.close();
			/*	if(obj.delete())
			System.out.println("Folder Dleted");			
		*/
	}

}
