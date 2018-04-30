import org.junit.Test;

import static org.junit.Assert.*;

public class BehaviourTest {

    @Test
    public void behaviourSetUp() {
    }

    @Test
    public void BehaviourTest_WhenConstructed_ThenProbabilityDistributionIsCorrect() {


        // arrange
        Choice[] choices = {Choice.Rock, Choice.Paper, Choice.Scissors};
        double[] probabilities = {0, 1, 0};


        // act
        Behaviour constantlyPaper = new Behaviour(choices, probabilities);


        // assert

        // delta necessary, to avoid depreation of assertEquals(double, double)
        for (int i = 0; i < choices.length; i++ ) {
            assertEquals(probabilities[i],
                    (double) constantlyPaper.getProbabilityDistributionOfChoices().get(choices[i]), 0.0);
        }
    }
}