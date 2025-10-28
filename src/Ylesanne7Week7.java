import java.util.ArrayList;
import java.util.Scanner;

public class Ylesanne7Week7 {
    public static void main(String[] Dictionary) {
        Scanner reader = new Scanner(System.in);
        Dictionary dict = new Dictionary();

        TextUserInterface ui = new TextUserInterface(reader, dict);
        ui.start();
    }
}