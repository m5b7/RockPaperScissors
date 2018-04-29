import java.util.HashMap;

public class Behaviour {

    private HashMap<Choice, Float> probabilityDistribution;

    public Behaviour(Choice[] choices, float[] probabilities) throws IllegalArgumentException{
        if (false) {
            throw new IllegalArgumentException("Please insert a valid probability distribution!");
        }
        else{
            for (int i=0; i < choices.length; i++){
                probabilityDistribution.put(choices[i],probabilities[i]);
            }
        }
    }
}
