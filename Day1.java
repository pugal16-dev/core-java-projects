public class Day1 {

    public static void main(String[] args) {
        System.out.println("Hello World");
        System.out.print("Welcome. ");
        System.out.println("Rate");
        int totalRows = 4;

        for (int i = 1; i <= totalRows; i++) {

            for (int j = 1; j <= (totalRows - i); j++) {
                System.out.print(" ");
            }

            for (int k = 1; k <= (2 * i - 1); k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}