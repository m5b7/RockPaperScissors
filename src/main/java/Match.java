
import java.util.*;

public class Match {

    private List<Player> players = new ArrayList<Player>();
    private int numberOfRounds;
    final private Player tieDummy = new Player("Tie");
    private HashMap<Player,Integer> winningStatistic = new HashMap<Player, Integer>();
    // add players and tieDummy

    // This Constructor limits numberOfPlayers to 2 so far
    public Match(List<Player> players, int numberOfRounds) throws IllegalArgumentException{

        if (players.size() != 2) {
            throw new IllegalArgumentException("A new Match requires exactly two Players!");
        }
        this.players.add(players.get(0));
        this.players.add(players.get(1));
        this.numberOfRounds = numberOfRounds;
    }


    public void startMatch() {
        winningStatistic.put(tieDummy,0);

        for (Player player : players) {
            winningStatistic.put(player, 0);
        }

        for (int roundNumber = 1; roundNumber <= numberOfRounds; roundNumber++) {
            Round round = new Round(players, tieDummy, roundNumber);
            Player winner = round.startRoundAndReturnWinner();
            winningStatistic.put(winner, winningStatistic.get(winner)+1);
        }
    }

    public void printWinningStatistic() {
        System.out.println("\nResult \n ");
        for (Player player : players) {
            System.out.printf("%s wins %d of %d games. %n", player.getName(), winningStatistic.get(player), numberOfRounds);
        }
        System.out.printf("Tie: %d of %d games.%n", winningStatistic.get(tieDummy), numberOfRounds);


    }

    public HashMap<Player,Integer> getWinningStatistic() {
        return winningStatistic;
    }

    public Player getTieDummy() {
        return tieDummy;
    }

    public List<Player> getPlayers() {
        return players;
    }
}
