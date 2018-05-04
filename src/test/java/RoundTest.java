import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class RoundTest {

    @Test
    public void startRoundTest_GivenRockVsPaper_WhenCalled_ThenPaperWins() {

        // arrange
        List<Player> players = new ArrayList<Player>();
        players.add(Constants.PLAYER_ALWAYS_ROCK);
        players.add(Constants.PLAYER_ALWAYS_PAPER);

        Round testRound = new Round(players, Constants.tieDummy, 1);

        // act
        Player actualWinner = testRound.startRoundAndReturnWinner();

        // assert
        assertEquals(Constants.PLAYER_ALWAYS_PAPER,actualWinner);
        }

    @Test
    public void startRoundTest_GivenScissorsVsScissors_WhenCalled_ThenTieDummyWins() {

        // arrange
        List<Player> players = new ArrayList<Player>();
        players.add(Constants.PLAYER_ALWAYS_SCISSORS);
        players.add(Constants.PLAYER_ALWAYS_SCISSORS);
        Round testRound = new Round(players, Constants.tieDummy, 1);

        // act
        Player actualWinner = testRound.startRoundAndReturnWinner();

        // assert
        assertEquals(Constants.tieDummy,actualWinner);
    }
}