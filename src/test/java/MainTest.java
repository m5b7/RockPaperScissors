import org.junit.Test;

import java.util.*;
import java.util.stream.Collectors;

import static org.junit.Assert.*;

public class MainTest {


    // rewrite Test as set-comparison
    @Test
    public void choicesConstantTest() {
        Choice[] choicesArray = new Choice[] {Choice.Paper, Choice.Scissors, Choice.Rock};
        List<Choice> choicesList = Arrays.asList(choicesArray);
        Collections.sort(choicesList);

        List<Choice> choicesListConstant = Main.CHOICES.stream().collect(Collectors.toList());
        Collections.sort(choicesListConstant);


        assertEquals(choicesList,choicesListConstant);
    }

}