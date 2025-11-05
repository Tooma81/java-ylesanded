package containers;
import java.util.ArrayList;
import java.util.Collections;

public class ContainerHistory {
    private ArrayList<Double> history;

    public ContainerHistory() {
        this.history = new ArrayList<>();
    }

    public void add(double situation) {
        history.add(situation);
    }

    public void reset() {
        history.clear();
    }

    public double maxValue() {
        return !history.isEmpty() ? Collections.max(history) : 0;
    }

    public double minValue() {
        return !history.isEmpty() ? Collections.min(history) : 0;
    }

    public double average() {
        int sum = 0;
        for (int i=0; i< history.size(); i++) {
            sum += i;
        }
        return !history.isEmpty() ? (double) sum / history.size() : 0;
    }

    public String toString() {
        return history.toString();
    }
}
