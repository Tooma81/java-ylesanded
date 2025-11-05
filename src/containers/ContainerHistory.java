package containers;
import java.util.ArrayList;

public class ContainerHistory {
    private ArrayList<Double> history;

    public ContainerHistory() {
        this.history = new ArrayList<>();
    }

    public void add(double situation) {
        this.history.add(situation);
    }

    public void reset() {
        this.history.clear();
    }

    public String toString() {
        return this.history.toString();
    }
}
