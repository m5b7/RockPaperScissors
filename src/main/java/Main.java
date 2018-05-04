import java.util.ArrayList;
import java.util.List;

public class Main {

    // player and behaviour setup
    private static Choice[] ALLCHOICES = {Choice.Rock, Choice.Paper, Choice.Scissors};

    final private static double[] PROBABILITIES_ROCK = new double[] {1, 0, 0};
    final private static Behaviour ALWAYS_ROCK = new Behaviour(ALLCHOICES, PROBABILITIES_ROCK);
    final private static Player PLAYER_ALWAYS_ROCK = new Player("Player Rock", ALWAYS_ROCK);

    final private static double[] PROBABILITIES_PAPER = new double[] {0, 1, 0};
    final private static Behaviour ALWAYS_PAPER = new Behaviour(ALLCHOICES, PROBABILITIES_PAPER);
    final private static Player PLAYER_ALWAYS_PAPER = new Player("Player Paper", ALWAYS_PAPER);

    final private static double[] PROBABILITIES_SCISSORS = new double[] {0, 0, 1};
    final private static Behaviour ALWAYS_SCISSORS = new Behaviour(ALLCHOICES, PROBABILITIES_SCISSORS);
    final private static Player PLAYER_ALWAYS_SCISSORS = new Player("Player Scissors", ALWAYS_SCISSORS);

    final private static double[] PROBABILITIES_EQUAL = new double[] {0.3333, 0.3333, 0.3334};
    final private static Behaviour UNIFORM_RANDOM = new Behaviour(ALLCHOICES, PROBABILITIES_EQUAL);
    final private static Player PLAYER_UNIFORM_RANDOM = new Player("Player Uniform Random", UNIFORM_RANDOM);



    public static void main(String[] args) {

        List<Player> players = new ArrayList<Player>();
        players.add(PLAYER_UNIFORM_RANDOM);
        players.add(PLAYER_ALWAYS_PAPER);

        // act
        Match match = new Match(players, 100);
        match.startMatch();
        match.printWinningStatistic();

    }
}
