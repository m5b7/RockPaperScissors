import org.junit.Test;

import static org.junit.Assert.*;

public class BehaviourTest {

    @Test
    public void behaviourSetUp() {
    }

    @Test
    public void BehaviourTest_WhenConstructed_ThenProbabilityDistributionIsCorrect() {


        // arrange
        final Choice[] CHOICES = {Choice.Rock, Choice.Paper, Choice.Scissors};
        final double[] PROBABILITIES = {0, 1, 0};


        // act
        Behaviour constantlyPaper = new Behaviour(CHOICES, PROBABILITIES);


        // assert

        // delta necessary, to avoid depreation of assertEquals(double, double)
        for (int i = 0; i < CHOICES.length; i++ ) {
            assertEquals(PROBABILITIES[i],
                    (double) constantlyPaper.getProbabilityDistributionOfChoices().get(CHOICES[i]), 0.0);
        }
    }
}