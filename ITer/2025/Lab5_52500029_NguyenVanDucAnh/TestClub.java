public class TestClub {
    public static void main(String[] args) {
        Club chelsea = new Club("Chelsea", 1, 2, 0);
        System.out.println("Initialize Club Chelsea: " + chelsea.toString());
        System.out.println("Name: " + chelsea.getName() + " | Wins: " + chelsea.getWins());
        System.out.println("Matches played: " + chelsea.numMatchesPlayed());
        System.out.println("Points: " + chelsea.getPoints());
        System.out.println("Is league finished (10 matches)?: " + chelsea.isFinish());
        chelsea.setWins(7);
        chelsea.setDraws(3);
        chelsea.setLosses(0);
        System.out.println("Updated Club: " + chelsea.toString());
        System.out.println("Matches played: " + chelsea.numMatchesPlayed());
        System.out.println("Is league finished?: " + chelsea.isFinish());
        Club cloneChelsea = new Club(chelsea);
        System.out.println("Cloned Club: " + cloneChelsea.toString());
    }
}