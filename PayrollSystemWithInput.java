import java.util.Scanner;

class Employee {
private String emp_name;
private int emp_id;
private String address;
private String mail_id;
private String mobile_no;
private String jobPosition;
protected double basicPay;

public Employee(String emp_name, int emp_id, String address, String mail_id, String mobile_no, double basicPay, String jobPosition) {
this.emp_name = emp_name;
this.emp_id = emp_id;
this.address = address;
this.mail_id = mail_id;
this.mobile_no = mobile_no;
this.basicPay = basicPay;
this.jobPosition = jobPosition;
}

public void generatePaySlip() {
double da = 0.97 * basicPay;
double hra = 0.10 * basicPay;
double pf = 0.12 * basicPay;
double staffClubFund = 0.001 * basicPay;
double grossSalary = basicPay + da + hra;
double netSalary = grossSalary - pf - staffClubFund;

System.out.println("**********Salary Slip**********");
System.out.println("Employee Name: " + emp_name);
System.out.println("Employee ID: " + emp_id);
System.out.println("Job Position: " + jobPosition);
System.out.println("Address: " + address);
System.out.println("Mail ID: " + mail_id);
System.out.println("Mobile Number: " + mobile_no);
System.out.println("Basic Pay: Rs." + basicPay);
System.out.println("Dearness Allowance (DA): Rs." + da);
System.out.println("House Rent Allowance (HRA): Rs." + hra);
System.out.println("Provident Fund (PF): Rs." + pf);
System.out.println("Staff Club Fund: Rs." + staffClubFund);
System.out.println("Gross Salary: Rs." + grossSalary);
System.out.println("Net Salary: Rs." + netSalary);
}

public String getName() {
return emp_name;
}

public int getID() {
return emp_id;
}

public String getJobPosition() {
return jobPosition;
}
}

class Programmer extends Employee {
public Programmer(String emp_name, int emp_id, String address, String mail_id, String mobile_no, double basicPay) {
super(emp_name, emp_id, address, mail_id, mobile_no, basicPay, "Programmer");
}
}

class TeamLead extends Employee {
public TeamLead(String emp_name, int emp_id, String address, String mail_id, String mobile_no, double basicPay) {
super(emp_name, emp_id, address, mail_id, mobile_no, basicPay, "Team Lead");
}
}

class AssistantProjectManager extends Employee {
public AssistantProjectManager(String emp_name, int emp_id, String address, String mail_id, String mobile_no, double basicPay) {
super(emp_name, emp_id, address, mail_id, mobile_no, basicPay, "Assistant Project Manager");
}
}

class ProjectManager extends Employee {
public ProjectManager(String emp_name, int emp_id, String address, String mail_id, String mobile_no, double basicPay) {
super(emp_name, emp_id, address, mail_id, mobile_no, basicPay, "Project Manager");
}
}

public class PayrollSystemWithInput {
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);

System.out.print("Enter the employee's full name (First Last): ");
String inputName = scanner.nextLine();
System.out.print("Enter the employee's ID (6 digits): ");
int inputID = scanner.nextInt();
scanner.nextLine();

System.out.println("Choose a job role:");
System.out.println("1. Programmer");
System.out.println("2. Team Lead");
System.out.println("3. Assistant Project Manager");
System.out.println("4. Project Manager");
System.out.print("Enter the number corresponding to the job role: ");
int jobRoleChoice = scanner.nextInt();
String inputJobRole;

switch (jobRoleChoice) {
case 1:
inputJobRole = "Programmer";
break;
case 2:
inputJobRole = "Team Lead";
break;
case 3:
inputJobRole = "Assistant Project Manager";
break;
case 4:
inputJobRole = "Project Manager";
break;
default:
inputJobRole = "Unknown";
break;
}

System.out.print("Enter the employee's basic pay: Rs.");
double inputBasicPay = scanner.nextDouble();

Programmer programmer = new Programmer(inputName, inputID, "Address", "mail@example.com", "1234567890", inputBasicPay);
TeamLead teamLead = new TeamLead(inputName, inputID, "Address", "mail@example.com", "1234567890", inputBasicPay);
AssistantProjectManager apm = new AssistantProjectManager(inputName, inputID, "Address", "mail@example.com", "1234567890", inputBasicPay);
ProjectManager pm = new ProjectManager(inputName, inputID, "Address", "mail@example.com", "1234567890", inputBasicPay);

if (inputID == programmer.getID() && inputJobRole.equals(programmer.getJobPosition())) {
programmer.generatePaySlip();
} else if (inputID == teamLead.getID() && inputJobRole.equals(teamLead.getJobPosition())) {
teamLead.generatePaySlip();
} else if (inputID == apm.getID() && inputJobRole.equals(apm.getJobPosition())) {
apm.generatePaySlip();
} else if (inputID == pm.getID() && inputJobRole.equals(pm.getJobPosition())) {
pm.generatePaySlip();
} else {
System.out.println("Employee not found.");
}

scanner.close();
}
}
