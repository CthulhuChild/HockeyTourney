package TourneyRegistry;


import java.util.Vector;


public class StringParser
{
	
	//parses an input string. 
	public String [] parseCommand(String inputCommand)
	{
		String [] splitString = inputCommand.split("\"");
		for (int x=0; x<splitString.length; x++)
			System.out.println(splitString[x]);
		return null;
	}//end parseCommand
	
}//end stringparser
