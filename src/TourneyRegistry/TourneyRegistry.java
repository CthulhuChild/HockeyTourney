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
		String returnString="";
		returnString+="The following commands are available: \n\n";
		returnString+="addteam \"<Team Name>\"                              -> Adds a team to the tournament\n";
		returnString+="addcoach \"<Coach Name>\" \"<Team Name>\"              -> Adds a coach to the specified team\n";
		returnString+="addplayer \"<player Name>\" \"<Team Name>\"            -> Adds a player to the specified team\n";
		returnString+="creategame \"<1st team's name>\" \"<2nd team's name>\" -> Creates a match between the specified teams\n";
		returnString+="setGameResult <gameID> \"<Winning Team's Name>\"     -> Declares the specified team the winner\n";
		returnString+="report                                             -> Reports all details of the tournament";
	
		return returnString;
	}//end execute help
	
	public String executeAddTeam(String [] commandAndParameters)
	{
		String returnString="";
		return returnString;
	}
	
	public String executeAddCoach(String [] commandAndParameters)
	{
		String returnString="";
		return returnString;
	}
	
	public String executeAddPlayer(String [] commandAndParameters)
	{
		String returnString="";
		return returnString;
	}
	
	public String executeCreateGame(String [] commandAndParameters)
	{
		String returnString="";
		return returnString;
	}
	
	public String executeSetGameResult(String [] commandAndParameters)
	{
		String returnString="";
		return returnString;
	}
	
	public String executeReport(String [] commandAndParameters)
	{
		String returnString="";
		return returnString;
	}
	
}//end class
