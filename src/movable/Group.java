package movable;
import java.util.ArrayList;

public class Group {
    private ArrayList<Organism> organisms;

    public Group() {
        this.organisms = new ArrayList<>();
    }

    public void addToGroup(Organism organism) {
        this.organisms.add(organism);
    }

    public String toString() {
        StringBuilder group = new StringBuilder();
        for (Organism organism : this.organisms) {
            group.append("x: ").append(organism.x)
                    .append("; y: ").append(organism.y)
                    .append("\n");
        }
        return group.toString();
    }
}
