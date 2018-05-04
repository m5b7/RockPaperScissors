
import org.junit.*;

import static org.junit.Assert.assertEquals;


public class PlayerTest {


    @Before
    public void setUp() {

    }

    @Test
    public void getNameTest() {
        assertEquals(Constants.NAMEOFPLAYER_A, Constants.PLAYER_A.getName());
    }

    @Test
    public void chooseTest_WhenBehaviourIsConstantlyRock_ChooseReturnsRock() {
        // arrange
        Choice expectedChoice = Choice.Rock;

        // act
        Choice actualChoice = Constants.PLAYER_ALWAYS_ROCK.choose();

        // assert
        assertEquals(expectedChoice, actualChoice);
    }

    @Test
    public void chooseTest_WhenBehaviourIsConstantlyPaper_ChooseReturnsPaper() {
        // arrange
        Choice expectedChoice = Choice.Paper;

        // act
        Choice actualChoice = Constants.PLAYER_ALWAYS_PAPER.choose();

        // assert
        assertEquals(expectedChoice, actualChoice);
    }

    @Test
    public void chooseTest_WhenBehaviourIsConstantlyScissors_ChooseReturnsScissors() {
        // arrange
        Choice expectedChoice = Choice.Scissors;

        // act
        Choice actualChoice = Constants.PLAYER_ALWAYS_SCISSORS.choose();

        // assert
        assertEquals(expectedChoice, actualChoice);
    }
}
