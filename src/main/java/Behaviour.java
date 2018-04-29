import java.util.HashMap;
import java.util.stream.DoubleStream;

public class Behaviour {

    private HashMap<Choice, Double> probabilityDistributionOfChoices = new HashMap<Choice, Double>();

    public Behaviour(Choice[] choices, double[] probabilities) throws IllegalArgumentException{

        if (choices.length != probabilities.length
                || DoubleStream.of(probabilities).sum() != 1.0) {

            throw new IllegalArgumentException("Please insert a valid probability distribution!");
        }
        else {

            // ensure the HashMap contains every possible Choice, fill with 0.0 as probabilities
            for (Choice choice : Initialization.CHOICES) {
                probabilityDistributionOfChoices.put(choice, 0.0);
            }

            // fill the HashMap with the values from the second parameter
            for (int i = 0; i < choices.length; i++) {
                probabilityDistributionOfChoices.put(choices[i], probabilities[i]);
            }
        }
        }
    }