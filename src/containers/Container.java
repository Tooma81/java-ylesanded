package containers;

public class Container {

    private double capacity;
    private double volume;

    public Container(double capacity) {
        this.capacity = capacity < 0 ? 0 : capacity;
        this.volume = 0;
    }

    public double getVolume() {
        return this.volume;
    }

    public double getOriginalCapacity () {
        return this.capacity;
    }

    public double getCurrentCapacity () {
        return this.capacity - this.volume;
    }

    public void addToTheContainer(double amount) {
        if (amount >= 0) {
            this.volume += amount;
            if (this.volume > this.capacity) {
                this.volume = this.capacity;
            }
        }
    }

    public double takeFromTheContainer(double amount) {
        double taken = 0.0;
        if (amount >= 0) {
            taken = Math.min(this.volume, amount);
            this.volume -= taken;
        }
        return taken;
    }

    public String toString() {
        return "volume = " + this.volume + ", free space = " + (this.capacity - this.volume);
    }
}
