import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Arrays;

public class Suitcase {

    private int weightLimit;
    Thing[] things = {};

    public Suitcase(int weightLimit) {
        this.weightLimit = weightLimit;
    }

    public void addThing(Thing thing) {
        if (this.getWeight() + thing.getWeight() <= this.weightLimit) {
            this.things = Arrays.copyOf(things, things.length + 1);
            this.things[this.things.length - 1] = thing;
        }
    }

    public void printThings() {
        for (Thing thing : this.things) {
            System.out.println(thing.getName() + " (" + thing.getWeight() + " kg)");
        }
    }

    public int getWeight() {
        int weight = 0;
        for (Thing thing : this.things) {
            weight += thing.getWeight();
        }
        return weight;
    }

    public Thing heaviestThing() {
        int[] weights = {};
        for (Thing thing : this.things) {
            weights = Arrays.copyOf(weights, weights.length + 1);
            weights[weights.length - 1] = thing.getWeight();
        }
        int maxAt = 0;
        for (int i = 0; i < weights.length; i++) {
            maxAt = weights[i] > weights[maxAt] ? i : maxAt;
        }
        return things[maxAt];
    }

    public String toString() {
        return switch (this.things.length) {
            case 0 -> "empty (" + this.getWeight() + " kg)";
            case 1 -> "1 thing (" + this.getWeight() + " kg)";
            default -> this.things.length + " things (" + this.getWeight() + " kg)";
        };
    }
}
