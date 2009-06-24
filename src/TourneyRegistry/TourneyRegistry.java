package TourneyRegistry;
public class TourneyRegistry
{

	StringParser parser;
	
	public TourneyRegistry()
	{
		parser=new StringParser();
	}//end constructor
	
	public String runCommand(String inputCommand)
	{
		parser.parseCommand(inputCommand);
		return "Command Executed";
	}
	
	
}//end class
