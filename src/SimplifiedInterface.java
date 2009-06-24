import java.util.Scanner;

import TourneyRegistry.TourneyRegistry;


public class SimplifiedInterface
{

	public static void main(String [] args)
	{
		TourneyRegistry registry=new TourneyRegistry();
		
		Scanner in=new Scanner(System.in);
		String inputString;					
		System.out.println("Welcome to the Hockey Tourniment. Please enter a command:");
		do 
		{
			inputString=in.nextLine();
			if (!inputString.equalsIgnoreCase("exit"))
			{
				System.out.println(registry.runCommand(inputString));
			}
		} while (!inputString.equalsIgnoreCase("exit"));
	}//end main
	
	
}//end class
