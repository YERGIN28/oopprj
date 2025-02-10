package project;

public class SportsClubManagement {
    public static void main(String[] args) {
        // Using default constructors
        SportsClub club = new SportsClub();
        club.setId(1);
        club.setName("Elite Sports Club");

        // Creating Sports using default and parameterized constructors
        Sport football = new Sport();
        football.setId(101);
        football.setName("Football");
        football.setType("Outdoor");

        Sport basketball = new Sport(102, "Basketball", "Indoor");

        // Creating another Football object to compare
        Sport anotherFootball = new Sport(101, "Football", "Outdoor");

        club.addSport(football);
        club.addSport(basketball);

        // Creating Players
        Player player1 = new Player();
        player1.setId(201);
        player1.setName("John Doe");
        player1.setAge(25);
        player1.setPosition("Forward");

        Player player2 = new Player(202, "Alice Smith", 22, "Goalkeeper");
        Player player3 = new Player(203, "Michael Brown", 30, "Defender");

        // Creating another project.Player object to compare
        Player duplicatePlayer = new Player(201, "John Doe", 25, "Forward");

        club.addPlayer(player1);
        club.addPlayer(player2);
        club.addPlayer(player3);

        // Displaying club details
        System.out.println(club);

        // Comparing Sports
        System.out.println("\nComparing two sports:");
        System.out.println("Is football equal to another football? " + football.equals(anotherFootball));

        // Comparing Players
        System.out.println("\nComparing two players:");
        System.out.println("Is player1 equal to duplicatePlayer? " + player1.equals(duplicatePlayer));

        // Creating another club for comparison
        SportsClub anotherClub = new SportsClub(1, "Elite Sports Club");

        System.out.println("\nComparing two sports clubs:");
        System.out.println("Is club equal to anotherClub? " + club.equals(anotherClub));

        // Searching for a player
        System.out.println("\nSearching for 'John Doe':");
        System.out.println(club.searchPlayerByName("John Doe"));

        // Sorting players by age
        club.sortPlayersByAge();
        System.out.println("\nPlayers sorted by age:");
        System.out.println(club.getPlayers());

        // Filtering players by position
        System.out.println("\nFiltering players by position (Defender):");
        System.out.println(club.filterPlayersByPosition("Defender"));
    }
}
