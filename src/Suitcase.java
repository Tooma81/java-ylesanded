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
        switch (this.things.size()) {
            case 0:
                return "empty (" + this.getWeight() + " kg)";
            case 1:
                return "1 thing (" + this.getWeight() + " kg)";
            default:
                return this.things.size() + " things (" + this.getWeight() + " kg)";
        }
    }
}
