package javaprogrammes;

import java.util.Scanner;

public class Programme5_EmployeesSalary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Employee ID:");
        String employeeId = sc.next();

        System.out.println("Enter Employee Name:");
        String employeeName = sc.next();

        System.out.println("Enter Basic Salary:");
        double basicSalary = sc.nextDouble();

        // Calculate allowance and deductions
        double HRA = 0.10 * basicSalary;
        double TA = 0.09 * basicSalary;
        double DA = 0.08 * basicSalary;
        double PF = 0.20 * basicSalary;

        // calculate Gross Salary
        double grossSalary = basicSalary + HRA + TA + DA -PF;

        //Display the results
        System.out.println("--------------------------------------");
        System.out.println("|            Salary  Slip            |");
        System.out.println("|____________________________________|");
        System.out.println("| Employee ID            :" + employeeId + "       |");
        System.out.println("| Employee Name          :" + employeeName + "        |");
        System.out.println("|____________________________________|");
        System.out.println("| Basic Salary           :" + basicSalary + "    |");
        System.out.println("| HRA 10%                :" + HRA + "     |");
        System.out.println("| TA 9%                  :" + TA + "     |");
        System.out.println("| DA 8%                  :" + DA + "     |");
        System.out.println("| PF -20 &               :" + PF + "     |");
        System.out.println("|____________________________________|");
        System.out.println("| Gross Salary :" + grossSalary + "              |");
        System.out.println("|====================================|");

        sc.close();
    }
}
