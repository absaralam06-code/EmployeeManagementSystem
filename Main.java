import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        EmployeeManagement em = new EmployeeManagement();

        int choice;

        do {

            System.out.println("\n========== Employee Management System ==========");
            System.out.println("1. Add Employee");
            System.out.println("2. View All Employees");
            System.out.println("3. Search Employee by ID");
            System.out.println("4. Update Employee Department");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");

            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {

                case 1:

                    System.out.print("Enter Employee ID: ");
                    int id = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Enter Employee Name: ");
                    String name = sc.nextLine();

                    System.out.print("Enter Department: ");
                    String department = sc.nextLine();

                    em.addEmployee(id, name, department);
                    break;

                case 2:

                    em.viewEmployees();
                    break;

                case 3:

                    System.out.print("Enter Employee ID to Search: ");
                    int searchId = sc.nextInt();

                    em.searchEmployee(searchId);
                    break;

                case 4:

                    System.out.print("Enter Employee ID: ");
                    int updateId = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Enter New Department: ");
                    String newDepartment = sc.nextLine();

                    em.updateDepartment(updateId, newDepartment);
                    break;

                case 5:

                    System.out.println("Thank you for using Employee Management System.");
                    break;

                default:

                    System.out.println("Invalid Choice! Please try again.");

            }

        } while (choice != 5);

        sc.close();
    }
}