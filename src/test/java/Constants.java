
public class Constants {

    // natural dependency on the classes Player and Behaviour. Refactor?
    final public static String NAMEOFPLAYER_A = "Player A";
    final public static Player PLAYER_A = new Player(NAMEOFPLAYER_A);

    // player and behaviour setup
     private static Choice[] ALLCHOICES = {Choice.Rock, Choice.Paper, Choice.Scissors};

     final private static double[] PROBABILITIES_ROCK = new double[] {1, 0, 0};
     final public static Behaviour ALWAYS_ROCK = new Behaviour(ALLCHOICES, PROBABILITIES_ROCK);
     final public static Player PLAYER_ALWAYS_ROCK = new Player("Constantly Rock Player", ALWAYS_ROCK);

     final private static double[] PROBABILITIES_PAPER = new double[] {0, 1, 0};
     final public static Behaviour ALWAYS_PAPER = new Behaviour(ALLCHOICES, PROBABILITIES_PAPER);
     final public static Player PLAYER_ALWAYS_PAPER = new Player("Constantly Paper Player", ALWAYS_PAPER);

     final private static double[] PROBABILITIES_SCISSORS = new double[] {0, 0, 1};
     final public static Behaviour ALWAYS_SCISSORS = new Behaviour(ALLCHOICES, PROBABILITIES_SCISSORS);
     final public static Player PLAYER_ALWAYS_SCISSORS = new Player("Constantly Scissors Player", ALWAYS_SCISSORS);

     final public static Player tieDummy = new Player("TieDummy");
}
