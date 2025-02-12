package Assignment2;

import DBconnection.dbconnection;

public class SportsClubManagement {
    public static void main(String[] args) {
        dbconnection db = new dbconnection();

        db.setupDatabase();
        db.insertSampleData();
        db.getPlayers();
        db.getSportsClubs();
    }
}
