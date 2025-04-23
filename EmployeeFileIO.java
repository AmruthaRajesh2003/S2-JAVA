import java.io.*;
import java.util.*;

public class EmployeeFileIO {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);

        try {
            FileOutputStream fout = new FileOutputStream("employee2.txt");
            int empno;
            String empname;
            int salary;
            
            System.out.println("Enter the number of employees:");
            int limit = obj.nextInt();
            obj.nextLine(); 

            for (int j = 0; j < limit; j++) {
                try {
                    System.out.println("Enter the employee number:");
                    empno = obj.nextInt();
                    obj.nextLine(); 
                    fout.write(("Employee Number: " + empno + "\r\n").getBytes());

                    System.out.println("Enter the employee name:");
                    empname = obj.nextLine();
                    fout.write(("Employee Name: " + empname + "\r\n").getBytes());

                    System.out.println("Enter the employee salary:");
                    salary = obj.nextInt();
                    obj.nextLine(); 
                    fout.write(("Employee Salary: " + salary + "\r\n").getBytes());

                    fout.write("------------------------\r\n".getBytes());
                } catch (InputMismatchException e) {
                    System.out.println("Invalid input. Please enter a valid integer.");
                    obj.nextLine(); 
                    j--; // Retry current employee entry
                }
            }
            fout.close();
        } catch (IOException e) {
            System.out.println("An error occurred while writing to the file: " + e);
        }
        try {
            FileInputStream fin = new FileInputStream("employee2.txt");
            System.out.println("\nContents of the file:");
            int data;
            while ((data = fin.read()) != -1) {
                System.out.print((char) data);
            }
            fin.close();
        } catch (IOException e) {
            System.out.println("An error occurred while reading the file: " + e);
        }
        obj.close();
    }
}
