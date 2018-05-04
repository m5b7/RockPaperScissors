import java.util.*;

public class Round {

    private final Player tieDummy;
    private List<Player> players;
    private Player winner;
    private HashMap<Player, Choice> playersChoices = new HashMap<Player, Choice>();

    public Round(List<Player> players, Player tieDummy, int roundNumber) {

        this.players = players;
        this.tieDummy = tieDummy;
    }

    public Player startRoundAndReturnWinner() {

        for (Player player : players) {
            playersChoices.put(player, player.choose());
        }

        return determineWinner();


    }

    private Player determineWinner() {
        // determine winner, quick and dirty implementation, works for two players only so far. Furthers ideas are
        // the implementation of a directed graph of choices in order to simplify the determination of the winner

        // tie, that is tieDummy wins
        if (playersChoices.get(players.get(0)) == playersChoices.get(players.get(1))) {
            winner = tieDummy;
        }

        // Player 0 wins
        else if (playersChoices.get(players.get(0)) == Choice.Rock && playersChoices.get(players.get(1)) == Choice.Scissors ) {
            winner = players.get(0);
        }
        else if (playersChoices.get(players.get(0)) == Choice.Paper && playersChoices.get(players.get(1)) == Choice.Rock ) {
            winner = players.get(0);
        }
        else if (playersChoices.get(players.get(0)) == Choice.Scissors && playersChoices.get(players.get(1)) == Choice.Paper ) {
            winner = players.get(0);
        }
        else if (playersChoices.get(players.get(0)) == Choice.Paper && playersChoices.get(players.get(1)) == Choice.Rock ) {
            winner = players.get(0);
        }

        // Player 1 wins
        else {winner = players.get(1);}

        return winner;
    }
}
