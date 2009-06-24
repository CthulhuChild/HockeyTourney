package TourneyRegistry;
public class TourneyRegistry
{

	StringParser parser;
	
	public TourneyRegistry()
	{
		parser=new StringParser();
	}//end constructor
	
	public String runCommand(String inputString)
	{
		parser.parseCommand(inputString);
		return "Command Executed";
	}
	
	
}//end class
