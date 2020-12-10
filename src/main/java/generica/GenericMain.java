package generica;

import java.util.List;

public class GenericMain {
	
	public static void main(String args[]) {
		
		BasketballTeam hyderabad = new BasketballTeam();
		
		hyderabad.setMatcesPlayed(10);
		hyderabad.setMatchWins(1);
		hyderabad.setMatchesLost(9);
		hyderabad.setTeamName("Hyderabad");
		
		BasketballTeam banglore = new BasketballTeam();
		
		banglore.setMatcesPlayed(10);
		banglore.setMatchWins(7);
		banglore.setMatchesLost(3);
		banglore.setTeamName("Banglore");
		
		LeagueTable<BasketballTeam> leagueTable = new LeagueTable<>(hyderabad);
		
		leagueTable.addTeam(banglore);
		
		List<String> teamList = leagueTable.getTeamsList();
		
		if(teamList !=null && !teamList.isEmpty()) {
			System.out.println("Team List:");
			for(String team: teamList) {
				
				System.out.println(team);
			}
		}
		
		
		
		
		
	}

}
