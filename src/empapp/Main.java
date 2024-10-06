package empapp;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        EmployeeDaoInterf dao = new EmployeeDaoImpl();
        String name;
        System.out.println("Welcome to Employee management application");
        Scanner sc = new Scanner(System.in);

        do{
            System.out.println("1. Add Employee\n" +
                    "2. Show All Employee\n" +
                    "3. Show Employee based on id\n"+
                    "4.Update the employee\n"+
                    "5. Delete the employer\n"+"6. Exit\n");

            System.out.println("Enter choice");
            int ch = sc.nextInt();
            switch (ch){
                case 1:
                    Employee emp = new Employee();
                    System.out.println("Enter ID: ");
                    int id = sc.nextInt();
                    System.out.println("Enter name: ");
                   name = sc.next();
                    System.out.println("Enter salary: ");
                    double salary = sc.nextDouble();
                    System.out.println("Enter age: ");
                    int age = sc.nextInt();
                    emp.setId(id );
                    emp.setName(name);
                    emp.setName(name);
                    emp.setSalary(salary);
                    emp.setAge(age);


                    dao.createEmployee(emp);

                    break;
                case 2:
//                    System.out.println("Show all employees");
                   dao.showAllEmployee();
                   break;
                case 3:
                    System.out.println("Enter employees id to show details");

                    int empId = sc.nextInt();
                    dao.showAllEmployeeBasedOnId(empId);
                    break;
                case 4:
                    System.out.println("Enter employees id to update details");

                    int empId1 = sc.nextInt();
                    System.out.println("Enter the name");
                    name= sc.next();
                    dao.updateEmployee(empId1,name);
                    break;
                case 5:
                    System.out.println("Enter employees id to update details");

                    int empId2 = sc.nextInt();

                    dao.deleteEmployee(empId2);
                    break;


                    case 6:
                    System.out.println("Thank you for using our application");
                    System.exit(0);
                default:
                    System.out.println("Enter valid choice !");
                    break;
            }

        }while (true);
    }
}