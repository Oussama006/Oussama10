package model;

/**
 * Modelo que representa un jugador.
 */


public class Player {
    private int playerId;
    private String name;
    private String position;
    private int shirtNumber;
    private int teamId;
    
    public Player(String name, String position, int shirtNumber, int teamId) {
        this.name = name;
        this.position = position;
        this.shirtNumber = shirtNumber;
        this.teamId = teamId;
    }
    
	public Player() {
		// TODO Auto-generated constructor stub
	}

	public int getPlayerId() {
		return playerId;
	}
	
	public void setPlayerId(int playerId) {
		this.playerId = playerId;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getPosition() {
		return position;
	}
	
	public void setPosition(String position) {
		this.position = position;
	}
	
	public int getShirtNumber() {
		return shirtNumber;
	}
	
	public void setShirtNumber(int shirtNumber) {
		this.shirtNumber = shirtNumber;
	}
	
	public int getTeamId() {
		return teamId;
	}
	
	public void setTeamId(int teamId) {
		this.teamId = teamId;
	}

    @Override
    public String toString() {
        return name + " (" + position + ")";
    }
}