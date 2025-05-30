package model;

public class League {
    private int leagueId;
    private String name;

    public League(int leagueId, String name) {
        this.leagueId = leagueId;
        this.name = name;
    }

    public int getLeagueId() { return leagueId; }
    public String getName() { return name; }

    @Override
    public String toString() {
        return name;
    }
}
