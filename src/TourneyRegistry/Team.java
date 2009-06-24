package TourneyRegistry;

import java.util.HashMap;

public class Team
{
	private String name;
	private HashMap<String,Player> players;
	private Coach coach;
	private int wins;
	
	public Team(String name)
	{
		wins=0;
		this.name=name;
		players=new HashMap<String, Player>();	
	}
	
	public void setCoach(Coach newCoach)
	{
		coach=newCoach;
	}
	
	public Coach getCoach()
	{
		return coach;
	}
	
	public void addPlayer(Player player)
	{
		players.put(player.getName(), player);
	}
	
	public int getWins()
	{
		return wins;
	}
	public void setWins(int newWins)
	{
		wins =newWins;
	}
	public void incrimentWins()
	{
		wins++;
	}
	
	public void setName(String newName)
	{
		name=newName;
	}
	
	public String getName()
	{
		return name;
	}
	
	
}//end team
