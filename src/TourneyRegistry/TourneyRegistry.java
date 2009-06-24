package TourneyRegistry;

import java.util.Vector;

public class TourneyRegistry
{

	StringParser parser;
	Vector<String> acceptedCommands;
	
	
	
	public TourneyRegistry()
	{
		parser=new StringParser();

	}//end constructor
	
	public String runCommand(String inputString)
	{
		String [] commandAndParameters;
		commandAndParameters=parser.parseCommand(inputString);
				
		String returnString="Invalid Command";
		if (commandAndParameters.length>0)
		{
			returnString="The command \""+commandAndParameters[0]+"\" was not recognized.";
			//sorry for the else if spam, but I've got to break into individual
			//command calls SOMEWHERE
			if (commandAndParameters[0].equalsIgnoreCase("help"))
			{
				returnString=executeHelp(commandAndParameters);
			}
			else if (commandAndParameters[0].equalsIgnoreCase("addteam"))
			{
				returnString=executeAddTeam(commandAndParameters);
			}
			else if (commandAndParameters[0].equalsIgnoreCase("addcoach"))
			{
				returnString=executeAddCoach(commandAndParameters);
			}
			else if (commandAndParameters[0].equalsIgnoreCase("addplayer"))
			{
				returnString=executeAddPlayer(commandAndParameters);
			}
			else if (commandAndParameters[0].equalsIgnoreCase("creategame"))
			{
				returnString=executeCreateGame(commandAndParameters);
			}
			else if (commandAndParameters[0].equalsIgnoreCase("setgameresult"))
			{
				returnString=executeSetGameResult(commandAndParameters);
			}
			else if (commandAndParameters[0].equalsIgnoreCase("report"))
			{
				returnString=executeReport(commandAndParameters);
			}
			
		}//end if length>0
			
		return returnString;
	}
	
	public String executeHelp(String [] commandAndParameters)
	{
		return null;
	}
	
	public String executeAddTeam(String [] commandAndParameters)
	{
		return null;
	}
	
	public String executeAddCoach(String [] commandAndParameters)
	{
		return null;
	}
	
	public String executeAddPlayer(String [] commandAndParameters)
	{
		return null;
	}
	
	public String executeCreateGame(String [] commandAndParameters)
	{
		return null;
	}
	
	public String executeSetGameResult(String [] commandAndParameters)
	{
		return null;
	}
	
	public String executeReport(String [] commandAndParameters)
	{
		return null;
	}
	
}//end class
