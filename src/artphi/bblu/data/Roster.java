package artphi.bblu.data;

import java.util.ArrayList;

public class Roster {

	private ArrayList<Player> players;
	private String rosterName;
	
	public Roster(ArrayList<Player> players, String rosterName) {

		this.players = players;
		this.rosterName = rosterName;
	}
	
	public Player getPlayer(String name){
		Player player = null;
		for (Player p : players){
			if(p.getName() == name){
				player = p;
				break;
			}
		}
		return player;
	}

	public String getRosterName() {
		return rosterName;
	}

	public void setRosterName(String rosterName) {
		this.rosterName = rosterName;
	}
	
	public void addPlayer(String name){
		players.add(new Player(name,0));
	}
	
	public void removePlayer(String name){
		for (Player p : players){
			if(p.getName() == name){
				players.remove(p);
				break;
			}
		}
	}

	public ArrayList<Player> getPlayers() {
		return players;
	}

	public void setPlayers(ArrayList<Player> players) {
		this.players = players;
	}
}
