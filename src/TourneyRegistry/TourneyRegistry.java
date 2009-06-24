package TourneyRegistry;

import java.util.HashMap;
import java.util.Vector;

import com.sun.org.apache.xalan.internal.xsltc.runtime.Hashtable;

public class TourneyRegistry
{

	StringParser parser;
	//I know it seems bizzare to use hashsets to manage 
	//something as trivial as this, but without knowing 
	//how this project might be expanded, they provide
	//the simplest way of quickly matching a query to a
	//record (IE, I will repeatedly want to bring up the
	//object representing a team using the teams name.
	
	//I should note that all of this could be avoided 
	//(and the requirements of the asignment met) simply
	//by using fixed length arrays of unreasonable size,
	//or vectors, and just treat all the data as simple
	//strings or ints. I make the brazen assumption that
	//this is supposed to be a test of my object oriented
	//programing abilities, and thus take the complicated
	//(but expandable/maintainable) route.
	
	HashMap<String,Team> teams;
	HashMap<String,Coach> coaches;
	HashMap<String,Player> players;
	HashMap<String,Game> games;
	
	public TourneyRegistry()
	{
		parser=new StringParser();
		
		teams=new HashMap<String, Team>();
		coaches=new HashMap<String, Coach>();
		players=new HashMap<String, Player>();
		games=new HashMap<String, Game>();
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
