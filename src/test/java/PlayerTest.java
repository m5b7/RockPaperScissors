import org.junit.*;

import static org.junit.Assert.assertEquals;

public class PlayerTest {

    private Player Player_A;
    private String NameOfPlayer_A;

    @Before
    public void setUp() {
        NameOfPlayer_A = "Player A";
        Player_A = new Player(NameOfPlayer_A);
    }

    @Test
    public void getNameTest() {
        assertEquals(NameOfPlayer_A, Player_A.getName());
    }

    @Test
    public void chooseTest_GivenBehaviourPaper_ChooseReturnsPaper() {

        assertEquals(null, Player_A.choose());
    }


}
