import java.util.Scanner;

public class TextUserInterface {

    private Scanner reader;
    private Dictionary dictionary;

    public TextUserInterface(Scanner reader, Dictionary dictionary) {
        this.reader = reader;
        this.dictionary = dictionary;
    }

    public void start() {
        System.out.println("Statements:\n" +
                "  add - adds a word pair to the dictionary\n" +
                "  translate - asks a word and prints its translation\n" +
                "  quit - quits the text user interface");
        while (true) {
            System.out.print("Statement: ");
            String input = this.reader.nextLine().toLowerCase();
            switch(input) {
                case "add":
                    System.out.print("In Finnish: ");
                    String finnish = reader.nextLine();
                    System.out.print("Translation: ");
                    String english = reader.nextLine();
                    this.dictionary.add(finnish, english);
                    break;
                case "translate":
                    System.out.print("Give a word: ");
                    String word = reader.nextLine();
                    this.dictionary.translate(word);
                    break;
                case "quit":
                    System.out.println("Cheers!");
                    return;
                default:
                    System.out.println("Unknown statement");
            }
        }
    }
}
