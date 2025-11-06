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
        double sum = 0;
        for (Double situation : history) {
            sum += situation;
        }
        return !history.isEmpty() ? sum / history.size() : 0;
    }

    public double greatestFluctuation() {
        double greatestFluctuation = 0.0;
        for (int i = 0; i < history.size(); i++) {
            double fluctuation = Math.abs(history.get(i + 1) - history.get(1));
            greatestFluctuation = Math.max(greatestFluctuation, fluctuation);
        }
        return history.size() > 1 ? greatestFluctuation : 0;
    }

    public double variance() {
        double avg = average();
        double squaredDiffsSum = 0.0;
        for (Double situation : history) {
            squaredDiffsSum += Math.pow(situation - avg, 2);
        }
        return !history.isEmpty() ? squaredDiffsSum / history.size() : 0;
    }

    public String toString() {
        return history.toString();
    }
}
