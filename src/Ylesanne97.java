public class Ylesanne97 {
    public static void main(String[] args) {
        int[] array = {5, 1, 3, 4, 2, 7};
        printElegantly(array);
    }

    public static void printElegantly(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
            if (i + 1 < array.length) {
                System.out.print(", ");
            }
        }

    }
}