package TourneyRegistry;

public class Game
{
	public Team[] teams;
	public Team winner;
	public Game(Team teamA, Team teamB)
	{
		teams=new Team[2];
		teams[0]=teamA;
		teams[1]=teamB;
		winner=null;
	}
	
	public Team[] getTeams()
	{
		return teams;
	}
	
	public boolean includesTeam(String teamName)
	{
		boolean returnValue=false;
		if (teams[0].getName().equalsIgnoreCase(teamName))
		{
			returnValue=true;
		}
		if (teams[1].getName().equalsIgnoreCase(teamName))
		{
			returnValue=true;
		}
		return returnValue;
	}//end includes team
	
	public void setWinner(Team theWinner)
	{
		winner=theWinner;
		theWinner.incrimentWins();
	}
	
	public Team getWinner()
	{
		return winner;
	}
}//end game class
