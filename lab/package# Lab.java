package# Lab;
class Position {
    private String title;
    private double salary;

    public Position(String title, double salary) {
        this.title = title;
        this.salary = salary;
    }

    public String toString() {
        return title + " (Salary: " + salary + ")";
    }
}

class Employee {
    private String name;
    private Position position;   

    public Employee(String name, Position position) {
        this.name = name;
        this.position = position;
    }

    public void showEmployee() {
        System.out.println("Employee Name: " + name);
        System.out.println("Position: " + position);
    }
}

class Company {
    private String companyName;
    private Employee[] employees;   
    private int count = 0;

    public Company(String companyName, int numberOfEmployees) {
        this.companyName = companyName;
        this.employees = new Employee[numberOfEmployees];  
    }

    public void addEmployee(Employee e) {
        if (count < employees.length) {
            employees[count] = e;
            count++;
        } else {
            System.out.println("Cannot add more employees to " + companyName);
        }
    }

    public void showCompany() {
        System.out.println("Company: " + companyName);
        System.out.println("Employees:");
        for (int i = 0; i < count; i++) {
            employees[i].showEmployee();
            System.out.println();
        }
    }
}

public class Task2 {
    public static void main(String[] args) {

        Company comp = new Company("Tech Solutions", 3);

        comp.addEmployee(new Employee("Alice",
                new Position("Software Engineer", 60000)));

        comp.addEmployee(new Employee("Bob",
                new Position("Project Manager", 75000)));

        comp.addEmployee(new Employee("Charlie",
                new Position("UI/UX Designer", 55000)));

        comp.showCompany();
    }
}
