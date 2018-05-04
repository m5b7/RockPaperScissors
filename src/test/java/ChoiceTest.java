import org.junit.Test;

import static org.junit.Assert.*;

public class ChoiceTest {

    @Test
    public void numberOfChoices() {
        assertEquals("Attention! The number of choices changed! Major Refactoring will be necessary!", 3, Choice.values().length);
    }
}