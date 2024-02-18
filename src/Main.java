import java.util.Scanner;

class RectangleCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double width = 0, height = 0;
        boolean validInput;

        // Prompt user for the width of the rectangle
        do {
            System.out.print("Enter the width of the rectangle: ");
            if (scanner.hasNextDouble()) {
                width = scanner.nextDouble();
                validInput = true;
            } else {
                System.out.println("Invalid input. Please enter a valid width.");
                scanner.next(); // clear the invalid input
                validInput = false;
            }
        } while (!validInput);

        // Prompt user for the height of the rectangle
        do {
            System.out.print("Enter the height of the rectangle: ");
            if (scanner.hasNextDouble()) {
                height = scanner.nextDouble();
                validInput = true;
            } else {
                System.out.println("Invalid input. Please enter a valid height.");
                scanner.next(); // clear the invalid input
                validInput = false;
            }
        } while (!validInput);

        // Calculate area of the rectangle
        double area = width * height;
        System.out.println("Area of the rectangle: " + area);

        // Calculate perimeter of the rectangle
        double perimeter = 2 * (width + height);
        System.out.println("Perimeter of the rectangle: " + perimeter);

        // Calculate length of the diagonal (using Pythagorean theorem)
        double diagonal = Math.sqrt(width * width + height * height);
        System.out.println("Length of the diagonal: " + diagonal);

        scanner.close();
    }
}
