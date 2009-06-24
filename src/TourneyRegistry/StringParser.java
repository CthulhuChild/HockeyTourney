package TourneyRegistry;


import java.util.Vector;


public class StringParser
{
	
	
	public String [] createArrayFromVector (Vector<String> tokenVector)
	{
		String [] returnString=new String [tokenVector.size()];
		for (int x=0; x<tokenVector.size(); x++)
		{
			returnString[x]=tokenVector.elementAt(x);
		}//end for loop
		return returnString;
	}//end createArray from vector
	
	//parses an input string. 
	public void addUnquotedTextTokens(String subString, Vector<String> tokenVector)
	{
		String [] splitSubString=subString.split(" ");
		for (int x=0; x<splitSubString.length; x++)
		{
			splitSubString[x]=splitSubString[x].trim();
			if (!splitSubString.equals(""))
			{				
				tokenVector.add(splitSubString[x]);
			}
		}//end for loop
	}//end addUnquotedTextTokens
	
	public String [] parseCommand(String inputCommand)
	{
		Vector<String> tokenVector=new Vector<String>();	
		inputCommand=inputCommand.trim();
		
		String [] splitString = inputCommand.split("\"");
		
		boolean unquotedTextToggle=true;
		for (int x=0; x<splitString.length; x++)
		{
			splitString[x]=splitString[x].trim();
			
			if (unquotedTextToggle)
			{
				addUnquotedTextTokens(splitString[x],tokenVector);
			}
		
			if ((!unquotedTextToggle)&&(!splitString.equals("")))
			{
				tokenVector.add(splitString[x]);
			}												
			unquotedTextToggle=!unquotedTextToggle;
		}//end for
		
		
		return createArrayFromVector(tokenVector);
	}//end parseCommand
	
}//end stringparser
