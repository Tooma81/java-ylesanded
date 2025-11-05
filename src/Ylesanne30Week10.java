import containers.*;

public class Ylesanne30Week10 {
    public static void main(String[] containers) {
        ProductContainer juice = new ProductContainer("Juice", 1000.0);
        juice.addToTheContainer(1000.0);
        juice.takeFromTheContainer(11.3);
        System.out.println(juice.getName()); // Juice
        System.out.println(juice);           // volume = 988.7, free space 11.3
    }
}
