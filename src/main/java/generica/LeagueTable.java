package generica;

import java.util.ArrayList;
import java.util.List;

public class LeagueTable<T extends BasketballTeam> {

	public String sportName;
	
	public List<BasketballTeam> teamList = new ArrayList<>();
	
	public List<String> teamRankings = new ArrayList<>();
	
	public LeagueTable(T teamName) {
		this.teamList.add(teamName);
	}
	
	public void addTeam(T teamName) {
		teamList.add(teamName);
	}
	
	public List<String> getTeamsList(){
		if(teamList.get(0).getMatchWins() > teamList.get(1).getMatchWins()) {
			teamRankings.add(teamList.get(0).getTeamName());
			teamRankings.add(teamList.get(1).getTeamName());
		}else {
			teamRankings.add(teamList.get(1).getTeamName());
			teamRankings.add(teamList.get(0).getTeamName());
		}

		
		return teamRankings;
	}
	
	
	
	
	
}
