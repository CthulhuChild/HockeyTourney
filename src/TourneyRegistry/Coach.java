package TourneyRegistry;

public class Coach
{
	private String name;	
	private Team team;
	
	public Coach(String name)
	{
		this.name=name;
	}
	
	public void setTeam(Team newTeam)
	{
		team=newTeam;
	}
	
	public Team getTeam()
	{
		return team;
	}
	
	public void setName(String newName)
	{
		name=newName;
	}
	
	public String getName()
	{
		return name;
	}
	

}
