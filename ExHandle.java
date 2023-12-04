import java.util.Scanner;

public class ExHandle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Enter Num1: ");
            int num1 = Integer.parseInt(scanner.nextLine());

            System.out.print("Enter Num2: ");
            int num2 = Integer.parseInt(scanner.nextLine());

            System.out.print("Enter array length: ");
            int arrayLength = Integer.parseInt(scanner.nextLine());

            int[] array = new int[arrayLength];

            for (int i = 0; i < arrayLength; i++) {
                System.out.print("Enter element at index " + i + ": ");
                array[i] = Integer.parseInt(scanner.nextLine());
            }

            System.out.print("Enter array index to retrieve: ");
            int index = Integer.parseInt(scanner.nextLine());

            // Division of Num1 and Num2
            int result = num1 / num2;
            System.out.println("Result of division: " + result);

            // Accessing array element
            int element = array[index];
            System.out.println("Element at index " + index + ": " + element);

        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException: " + e.getMessage());
        } catch (NumberFormatException e) {
            System.out.println("NumberFormatException: Invalid input format");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException: Index is out of bounds");
        } finally {
            scanner.close();
        }
    }
}
