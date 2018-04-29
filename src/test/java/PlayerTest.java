import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PlayerTest {

    @Test
    public void getNameTest() {

        Player A = new Player("Player A");
        assertEquals("Player A", A.getName());
    }
}
