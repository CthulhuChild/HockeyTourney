import java.util.Scanner;


public class SimplifiedInterface
{

	public static void main(String [] args)
	{
		Scanner in=new Scanner(System.in);
		String inputString;		
		System.out.println("Welcome to the Hockey Tourniment. Please enter a command:");
		
		do 
		{
			inputString=in.nextLine();
			if (!inputString.equalsIgnoreCase("exit"))
			{
				//call
			}
		} while (!inputString.equalsIgnoreCase("exit"));
	}
}
