import java.util.Scanner;

abstract class Shape {
protected double dimension1;
protected double dimension2;

public Shape(double dim1, double dim2) {
dimension1 = dim1;
dimension2 = dim2;
}

public abstract double computeArea();
}

class Triangle extends Shape {
public Triangle(double base, double height) {
super(base, height);
}

@Override
public double computeArea() {
return 0.5 * dimension1 * dimension2;
}
}

class Rectangle extends Shape {
public Rectangle(double length, double width) {
super(length, width);
}

@Override
public double computeArea() {
return dimension1 * dimension2; 
}
}

public class ShapeAreaCalculator {
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);

System.out.println("Select a shape: ");
System.out.println("1. Triangle");
System.out.println("2. Rectangle");

int choice = scanner.nextInt();

double dim1, dim2;

System.out.print("Choose the unit of measurement (cm/m): ");
String unit = scanner.next();

if (unit.equalsIgnoreCase("cm")) {
System.out.print("Enter the first dimension (in cm): ");
dim1 = scanner.nextDouble();
System.out.print("Enter the second dimension (in cm): ");
dim2 = scanner.nextDouble();
} else if (unit.equalsIgnoreCase("m")) {
System.out.print("Enter the first dimension (in meters): ");
dim1 = scanner.nextDouble() * 100; 
System.out.print("Enter the second dimension (in meters): ");
dim2 = scanner.nextDouble() * 100; 
} else {
System.out.println("Invalid unit. Please choose 'cm' or 'm'.");
scanner.close();
return;
}

Shape shape;

if (choice == 1) {
shape = new Triangle(dim1, dim2);
} else {
shape = new Rectangle(dim1, dim2);
}

double area = shape.computeArea();

if (unit.equalsIgnoreCase("cm")) {
System.out.println("Area of the selected shape: " + area + " square cm");
} else if (unit.equalsIgnoreCase("m")) {
System.out.println("Area of the selected shape: " + (area / 10000) + " square m");
}

scanner.close();
}
}
