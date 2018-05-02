import org.junit.*;

import static org.junit.Assert.assertEquals;

public class PlayerTest {

    // players behaviour setup
    final private Choice[] CHOICES = {Choice.Rock, Choice.Paper, Choice.Scissors};
    final private double[] PROBABILITIES_ROCK = new double[] {1, 0, 0};
    final private Behaviour CONSTANTLY_ROCK = new Behaviour(CHOICES, PROBABILITIES_ROCK);

    final private double[] PROBABILITIES_PAPER = new double[] {0, 1, 0};
    final private Behaviour CONSTANTLY_PAPER = new Behaviour(CHOICES, PROBABILITIES_PAPER);

    final private double[] PROBABILITIES_SCISSORS = new double[] {0, 0, 1};
    final private Behaviour CONSTANTLY_SCISSORS = new Behaviour(CHOICES, PROBABILITIES_SCISSORS);

    // natural dependency on the classes Player and Behaviour. Refactor?
    final private String NAMEOFPLAYER_A = "Player A";
    final private Player PLAYER_A = new Player(NAMEOFPLAYER_A);
    final private Player PLAYER_CONSTANTLY_ROCK = new Player("Constantly Rock Player", CONSTANTLY_ROCK);
    final private Player PLAYER_CONSTANTLY_PAPER = new Player("Constantly Paper Player", CONSTANTLY_PAPER);
    final private Player PLAYER_CONSTANTLY_SCISSORS = new Player("Constantly Scissors Player", CONSTANTLY_SCISSORS);



    @Before
    public void setUp() {

    }

    @Test
    public void getNameTest() {
        assertEquals(NAMEOFPLAYER_A, PLAYER_A.getName());
    }

    @Test
    public void chooseTest_WhenBehaviourIsConstantlyRock_ChooseReturnsRock() {
        // arrange
        PLAYER_CONSTANTLY_ROCK.setBehaviour(CONSTANTLY_ROCK);
        Choice expectedChoice = Choice.Rock;

        // act
        Choice actualChoice = PLAYER_CONSTANTLY_ROCK.choose();

        // assert
        assertEquals(expectedChoice, actualChoice);
    }

    @Test
    public void chooseTest_WhenBehaviourIsConstantlyPaper_ChooseReturnsPaper() {
        // arrange
        Choice expectedChoice = Choice.Paper;

        // act
        Choice actualChoice = PLAYER_CONSTANTLY_PAPER.choose();

        // assert
        assertEquals(expectedChoice, actualChoice);
    }

    @Test
    public void chooseTest_WhenBehaviourIsConstantlyScissors_ChooseReturnsScissors() {
        // arrange
        PLAYER_CONSTANTLY_SCISSORS.setBehaviour(CONSTANTLY_SCISSORS);
        Choice expectedChoice = Choice.Scissors;

        // act
        Choice actualChoice = PLAYER_CONSTANTLY_SCISSORS.choose();

        // assert
        assertEquals(expectedChoice, actualChoice);
    }
}
