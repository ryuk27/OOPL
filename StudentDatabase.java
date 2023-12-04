import java.util.ArrayList;
import java.util.Scanner;

class Student {
    // Assuming all properties are public for simplicity
    public int studentId;
    public String name;
    public int rollNo;
    public String studentClass;
    public double marks;
    public String address;
}

public class StudentDatabase {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Student> students = new ArrayList<>();

        while (true) {
            System.out.println("Student Database Menu:");
            System.out.println("1. Create Database");
            System.out.println("2. Display Database");
            System.out.println("3. Delete Records");
            System.out.println("4. Update Record");
            System.out.println("5. Search Record");
            System.out.println("0. Exit");

            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    createDatabase(scanner, students);
                    break;
                case 2:
                    displayDatabase(students);
                    break;
                case 3:
                    deleteRecords(scanner, students);
                    break;
                case 4:
                    updateRecord(scanner, students);
                    break;
                case 5:
                    searchRecord(scanner, students);
                    break;
                case 0:
                    System.out.println("Exiting program. Goodbye!");
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please enter a valid option.");
            }
        }
    }

    private static void createDatabase(Scanner scanner, ArrayList<Student> students) {
        System.out.print("Enter the number of students: ");
        int numStudents = scanner.nextInt();

        for (int i = 0; i < numStudents; i++) {
            Student student = new Student();

            System.out.println("Enter details for student " + (i + 1) + ":");
            System.out.print("Enter student ID: ");
            student.studentId = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character

            System.out.print("Enter name: ");
            student.name = scanner.nextLine();

            System.out.print("Enter roll number: ");
            student.rollNo = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character

            System.out.print("Enter class: ");
            student.studentClass = scanner.nextLine();

            System.out.print("Enter marks: ");
            student.marks = scanner.nextDouble();
            scanner.nextLine(); // Consume the newline character

            System.out.print("Enter address: ");
            student.address = scanner.nextLine();

            students.add(student);
        }

        System.out.println("Database created successfully.");
    }

    private static void displayDatabase(ArrayList<Student> students) {
        System.out.println("\nDisplaying student details:\n");

        for (Student student : students) {
            System.out.println("Student ID: " + student.studentId);
            System.out.println("Name: " + student.name);
            System.out.println("Roll Number: " + student.rollNo);
            System.out.println("Class: " + student.studentClass);
            System.out.println("Marks: " + student.marks);
            System.out.println("Address: " + student.address + "\n");
        }
    }

    private static void deleteRecords(Scanner scanner, ArrayList<Student> students) {
        System.out.print("Enter the student ID to delete: ");
        int deleteId = scanner.nextInt();

        boolean found = false;
        for (Student student : students) {
            if (student.studentId == deleteId) {
                students.remove(student);
                found = true;
                System.out.println("Record deleted successfully.");
                break;
            }
        }

        if (!found) {
            System.out.println("Student ID not found. Deletion failed.");
        }
    }

    private static void updateRecord(Scanner scanner, ArrayList<Student> students) {
        System.out.print("Enter the student ID to update: ");
        int updateId = scanner.nextInt();

        boolean found = false;
        for (Student student : students) {
            if (student.studentId == updateId) {
                System.out.println("Enter new details for student " + updateId + ":");
                System.out.print("Enter name: ");
                student.name = scanner.nextLine();
                scanner.nextLine(); // Consume the newline character

                System.out.print("Enter roll number: ");
                student.rollNo = scanner.nextInt();
                scanner.nextLine(); // Consume the newline character

                System.out.print("Enter class: ");
                student.studentClass = scanner.nextLine();

                System.out.print("Enter marks: ");
                student.marks = scanner.nextDouble();
                scanner.nextLine(); // Consume the newline character

                System.out.print("Enter address: ");
                student.address = scanner.nextLine();

                found = true;
                System.out.println("Record updated successfully.");
                break;
            }
        }

        if (!found) {
            System.out.println("Student ID not found. Update failed.");
        }
    }

    private static void searchRecord(Scanner scanner, ArrayList<Student> students) {
        System.out.print("Enter the student ID to search: ");
        int searchId = scanner.nextInt();

        boolean found = false;
        for (Student student : students) {
            if (student.studentId == searchId) {
                System.out.println("\nRecord found:");
                System.out.println("Student ID: " + student.studentId);
                System.out.println("Name: " + student.name);
                System.out.println("Roll Number: " + student.rollNo);
                System.out.println("Class: " + student.studentClass);
                System.out.println("Marks: " + student.marks);
                System.out.println("Address: " + student.address);
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Student ID not found.");
        }
    }
}
