import org.junit.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

import static org.junit.Assert.*;

public class InitializationTest {

    @Test
    public void initialize() {
    }

    // rewrite Test as set-comparison
    @Test
    public void choicesConstantTest() {
        Choice[] choicesArray = new Choice[] {Choice.Paper, Choice.Scissors, Choice.Rock};
        List<Choice> choicesList = Arrays.asList(choicesArray);
        Collections.sort(choicesList);

        List<Choice> choicesListConstant = Initialization.CHOICES.stream().collect(Collectors.toList());
        Collections.sort(choicesListConstant);


        assertEquals(choicesList,choicesListConstant);
    }
}