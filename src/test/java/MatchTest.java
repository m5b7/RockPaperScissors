import org.junit.Assert;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import java.util.*;

public class MatchTest {

        final private Player playerA = new Player("Player A");
        final private Player playerB = new Player("Player B");
        final private Player playerC = new Player("Player C");
        final int numberOfRounds = 100;

    @Test
    public void startMatchTest_WhenTwoPlayerMatchIsStarted_ThenWinningStatisticContainsAllPlayers() {
        //arrange
        List<Player> players = new ArrayList<Player>();
        players.add(playerA);
        players.add(playerB);

        // act
        Match match = new Match(players, numberOfRounds);
        match.startMatch();

        // assert
        Assert.assertTrue(match.getWinningStatistic().containsKey(match.getTieDummy()));
        Assert.assertTrue(players.size() == match.getPlayers().size());
        for (Player player : players) {
            Assert.assertTrue(match.getWinningStatistic().containsKey(player));
        }
    }

    @Rule
    public ExpectedException thrown = ExpectedException.none();

    @Test
    public void MatchTest_GivenOnlyImplementedForTwoPlayers_WhenConstructorIsCalledWithThreePlayers_ThenThrowExecption() {
        //arrange
        List<Player> players = new ArrayList<Player>();
        players.add(playerA);
        players.add(playerB);
        players.add(playerC);

        // expect
        thrown.expect(IllegalArgumentException.class);
        thrown.expectMessage("A new Match requires exactly two Players!");

        // act
        Match match = new Match(players, numberOfRounds);
    }

}