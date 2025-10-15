import java.util.Scanner;

public class Ylesanne32 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int result = 0;
        int num = 1;
        System.out.print("Until what? ");
        int limit = Integer.parseInt(reader.nextLine());
        while (num <= limit) {
            result += num;
            num++;
        }
        System.out.print("Sum is " + result);
    }
}
