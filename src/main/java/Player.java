import java.util.HashMap;
import java.util.Random;

public class Player {

    private String name;
    private Behaviour behaviour;



    public Player(String name, Behaviour behaviour) {
        this.name = name;
        this.behaviour = behaviour;
    }

    public Player(String name) {
        this.name = name;
    }

    public Behaviour getBehaviour() {
        return behaviour;
    }

    public void setBehaviour(Behaviour behaviour) {
        this.behaviour = behaviour;
    }

    public String getName() {
        return name;
    }

    public Choice choose() {
        Choice result = null;
        if (behaviour == null) {
            throw new IllegalStateException("Please define a proper behaviour first.");
        } else {
            Random random = new Random();
            double randomDoubleBetweenZeroAndOne = random.nextDouble();
            double accumulatedProbabilityToCompare = 0;

            for (Choice choice : Choice.values()) {
                if (randomDoubleBetweenZeroAndOne <= accumulatedProbabilityToCompare +
                    behaviour.getProbabilityDistributionOfChoices().get(choice)) {
                    result = choice;
                    break;
                }
                else {
                    accumulatedProbabilityToCompare += behaviour.getProbabilityDistributionOfChoices().get(choice);
                }
            }
        }
        return result;
    }
}
