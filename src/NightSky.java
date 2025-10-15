import java.util.Random;

public class NightSky {

    private double density;
    private int width;
    private int height;
    private int stars;

    Random random = new Random();

    public static void main(String[] args) {
        NightSky NightSky = new NightSky(0.1, 40, 10);
        NightSky.print();
        System.out.println("Number of stars: " + NightSky.starsInLastPrint());
    }

    public NightSky(double density, int width, int height) {
        this.density = density;
        this.width = width;
        this.height = height;
    }

    public void printLine() {
        for (int i = 1; i <= width; i++) {
            double randomStar = random.nextDouble();
            if (density >= randomStar) {
                System.out.print("*");
            } else {
                System.out.print(" ");
            }
        }
    }

    public void print() {
        stars = 0;
        for (int i = 1; i <= height; i++) {
            for (int j = 1; j <= width; j++) {
                double randomStar = random.nextDouble();
                if (density >= randomStar) {
                    System.out.print("*");
                    stars++;
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public int starsInLastPrint() {
        return stars;
    }
}
