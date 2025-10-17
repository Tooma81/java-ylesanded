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

    public int getWeight() {
        int weight = 0;
        for (int i = 0; i < this.things.size(); i++) {
            weight += this.things.get(i).getWeight();
        }
        return weight;
    }

    public String toString() {
        return this.things.size() + " objects (" + this.getWeight() + " kg)";
    }
}
