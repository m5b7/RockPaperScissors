
import java.util.*;

public class Match {

    private List<Player> players = new ArrayList<Player>();
    private int numberOfRounds;
    final private Player tieDummy = new Player("TieDummy");
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

        // Test meckert hier. Per Stream die Liste players ausgeben
        for (Player player : players) {
            winningStatistic.put(player, 0);
        }
/*
        for (int roundNumber = 1; roundNumber <= numberOfRounds; roundNumber++) {
            Round round = new Round(players, tieDummy, roundNumber);
        }
*/    }

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
