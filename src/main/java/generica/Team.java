package generica;

public class Team<T> {
	
	T obj;
	String teamName;
	
	public Team(T ob, String teamName) {
		obj = ob;
		this.teamName = teamName;
	}
	
	public String getTeamName() {
		return this.teamName;
	}
	
	public String getTeamSport() {
		return teamName;
		
	}

}
