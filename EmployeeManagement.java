import java.util.ArrayList;

public class EmployeeManagement {

    private ArrayList<Employee> employees;

    // Constructor
    public EmployeeManagement() {
        employees = new ArrayList<>();
    }

    // Add Employee
    public void addEmployee(int id, String name, String department) {

        Employee emp = new Employee(id, name, department);
        employees.add(emp);

        System.out.println("Employee added successfully.");
    }

    // View All Employees
    public void viewEmployees() {

        if (employees.isEmpty()) {
            System.out.println("No employees found.");
            return;
        }

        System.out.println("\n----- Employee List -----");

        for (Employee emp : employees) {
            System.out.println(emp);
            System.out.println("-------------------------");
        }
    }

    // Search Employee by ID
    public void searchEmployee(int id) {

        for (Employee emp : employees) {

            if (emp.getId() == id) {
                System.out.println("Employee Found");
                System.out.println(emp);
                return;
            }

        }

        System.out.println("Employee not found.");
    }

    // Update Department
    public void updateDepartment(int id, String newDepartment) {

        for (Employee emp : employees) {

            if (emp.getId() == id) {

                emp.setDepartment(newDepartment);

                System.out.println("Department updated successfully.");
                return;
            }

        }

        System.out.println("Employee not found.");
    }
}