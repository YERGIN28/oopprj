package Assignment2;

import java.util.*;
import java.util.stream.Collectors;

public class SportsClub extends Entity {
    private List<Player> players = new ArrayList<>();
    private List<Sport> sports = new ArrayList<>();

    public SportsClub() {

    }

    public SportsClub(int id, String name) {
        super(id, name);
    }

    public void addPlayer(Player player) {
        players.add(player);
    }

    public void addSport(Sport sport) {
        sports.add(sport);
    }

    public List<Player> getPlayers() { return players; }
    public List<Sport> getSports() { return sports; }

    // Searching for players by name
    public List<Player> searchPlayerByName(String name) {
        return players.stream()
                .filter(p -> p.getName().equalsIgnoreCase(name))
                .collect(Collectors.toList());
    }

    // Sorting players by age
    public void sortPlayersByAge() {
        players.sort(Comparator.comparingInt(Player::getAge));
    }

    // Filtering players by position
    public List<Player> filterPlayersByPosition(String position) {
        return players.stream()
                .filter(p -> p.getPosition().equalsIgnoreCase(position))
                .collect(Collectors.toList());
    }

    @Override
    public String toString() {
        return "project.SportsClub: " + name + "\nPlayers: " + players + "\nSports: " + sports;
    }
}
