import java.util.*;

class Employee {
    private String employeeName;
    private double employeeSalary;

    public void readEmployeeData(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter employee name: ");
        employeeName = sc.nextLine();
        System.out.println("Enter employee salary: ");
        employeeSalary = sc.nextDouble();
    }

    public void displayEmployeeData() {
        System.out.println("Name: " + employeeName);
        System.out.println("Salary: " + employeeSalary);
    }
}

public class Pr2_2 {
    public static void main(String[] args){
        Employee emp = new Employee();
        emp.readEmployeeData();
        emp.displayEmployeeData();
    }
}