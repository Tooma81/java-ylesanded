package movable;

public class Organism {
    public int x;
    public int y;

    public Organism(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void move(int dx, int dy) {
        this.x += dx;
        this.y += dy;
    }

    public String toString() {
        return "x: " + this.x + "; y: " + this.y;
    }
}
