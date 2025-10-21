import java.util.Arrays;

public class Container {

    private int weightLimit;
    Suitcase[] suitcases = {};

    public Container(int weightLimit) {
        this.weightLimit = weightLimit;
    }

    public void addSuitcase(Suitcase suitcase) {
        if (this.getWeight() + suitcase.getWeight() <= this.weightLimit) {
            this.suitcases = Arrays.copyOf(suitcases, suitcases.length + 1);
            this.suitcases[this.suitcases.length - 1] = suitcase;
        }
    }

    public int getWeight() {
        int weight = 0;
        for (Suitcase suitcase : this.suitcases) {
            weight += suitcase.getWeight();
        }
        return weight;
    }

    public void printThings() {
        for (Suitcase suitcase : this.suitcases) {
            suitcase.printThings();
        }
    }

    public String toString() {
        return this.suitcases.length + " suitcases (" + this.getWeight() + " kg)";
    }
}

