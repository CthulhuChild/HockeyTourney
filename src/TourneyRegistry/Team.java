package TourneyRegistry;

import java.util.HashMap;

public class Team
{
	private String name;
	private HashMap<String,Player> players;
	private Coach coach;
	public Team(String name)
	{
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
	
	
	
}//end team
