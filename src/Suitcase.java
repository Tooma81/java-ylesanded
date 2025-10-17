import java.util.ArrayList;

public class Suitcase {

    private int weightLimit;
    ArrayList<Thing> things = new ArrayList<Thing>();

    public Suitcase(int weightLimit) {
        this.weightLimit = weightLimit;
    }

    public void addThing(Thing thing) {
        if (this.getWeight() + thing.getWeight() <= this.weightLimit) {
            this.things.add(thing);
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

    public String toString() {
        return switch (this.things.size()) {
            case 0 -> "empty (" + this.getWeight() + " kg)";
            case 1 -> "1 thing (" + this.getWeight() + " kg)";
            default -> this.things.size() + " things (" + this.getWeight() + " kg)";
        };
    }
}
