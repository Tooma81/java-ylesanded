public class Ylesanne4Week7 {
    public static void main(String[] Container) {
        Container container = new Container(1000);
        addSuitcasesFullOfBricks(container);
        System.out.println(container);
    }

    public static void addSuitcasesFullOfBricks(Container container) {
        Thing brick = new Thing("Brick", 4);
        for (int i = 0; i < 100; i++) {
            Suitcase suitcase = new Suitcase(10);
            suitcase.addThing(brick);
            container.addSuitcase(suitcase);
        }
    }
}
