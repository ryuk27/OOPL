import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ElementChecker {
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);

System.out.println("Choose operation:");
System.out.println("1. Check if a number is odd or even");
System.out.println("2. Display prime numbers");
System.out.println("3. Check if a string is a palindrome");
int choice = scanner.nextInt();

switch (choice) {
case 1:
checkOddEven();
break;
case 2:
displayPrimeNumbers();
break;
case 3:
checkPalindrome(scanner);
break;
default:
System.out.println("Invalid choice.");
}

scanner.close();
}

public static void checkOddEven() {
Scanner scanner = new Scanner(System.in);

List<Integer> numbers = new ArrayList<>();
System.out.print("Enter the number of elements in the list: ");
int n = scanner.nextInt();
System.out.println("Enter the elements of the list:");
for (int i = 0; i < n; i++) {
numbers.add(scanner.nextInt());
}

for (int number : numbers) {
System.out.println(number + " is " + (number % 2 == 0 ? "even" : "odd"));
}

scanner.close();
}

public static void displayPrimeNumbers() {
Scanner scanner = new Scanner(System.in);

List<Integer> numbers = new ArrayList<>();
System.out.print("Enter the number of elements in the list: ");
int n = scanner.nextInt();
System.out.println("Enter the elements of the list:");
for (int i = 0; i < n; i++) {
numbers.add(scanner.nextInt());
}

System.out.print("Prime numbers in the list: ");
for (int number : numbers) {
if (isPrime(number)) {
System.out.print(number + " ");
}
}
System.out.println();

scanner.close();
}

public static boolean isPrime(int number) {
if (number < 2) {
return false;
}
for (int i = 2; i <= Math.sqrt(number); i++) {
if (number % i == 0) {
return false;
}
}
return true;
}

public static void checkPalindrome(Scanner scanner) {
System.out.print("Enter a string to check for palindrome: ");
String input = scanner.next().toLowerCase();
String reversed = new StringBuilder(input).reverse().toString();
if (input.equals(reversed)) {
System.out.println("The string is a palindrome.");
} else {
System.out.println("The string is not a palindrome.");
}
}
}
