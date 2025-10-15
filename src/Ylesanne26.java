import java.util.Scanner;

public class Ylesanne26 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int sum = 0;
        while (true) {
            int read = Integer.parseInt(reader.nextLine());
            if (read == 0) {
                System.out.println("Sum in the end: " + sum);
                break;
            } else {
                sum += read;
                System.out.println("Sum now: " + sum);
            }
        }
    }
}
