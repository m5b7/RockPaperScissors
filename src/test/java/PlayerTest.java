import org.junit.*;

import static org.junit.Assert.assertEquals;

public class PlayerTest {

    @Before
    public void setUp() {
    }

    @Test
    public void getNameTest() {
        String playersName = "Player A";
        Player Player_A = new Player(playersName);
        assertEquals(playersName, Player_A.getName());
    }

    @Test
    public void chooseTest_GivenBehaviourPaper_ChooseReturnsPaper() {
        String playersName = "Player A";
        Player Player_A = new Player(playersName);
        assertEquals(null, Player_A.choose());
    }
}
