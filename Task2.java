public class Task2 {
    public static void main(String[] args) {
        int n = 5; // Number of rows for the pyramid

        for (int i = 1; i <= n; i++) {
            // Print leading spaces
            for (int j = i; j < n; j++) {
                System.out.print(" ");
            }

            // Print numbers
            for (int j = 1; j <= (2 * i - 1); j++) {
                System.out.print(j);
            }
            System.out.println();
        }
        System.out.println("Developed By Sarthak");
    }
}