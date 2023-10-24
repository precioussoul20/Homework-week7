package javaprogrammes;

import java.util.Scanner;

/** Write a java program input sales id, seller's name, sales amount, and salary basic and then fined this sales
*Commission
*Sales amount >= 50,000 35%
*Sales amount >= 30,000 20%
*>= 20,000 10%
*>= 10,000 5%
*< 10,000 2%
* */

public class Programme7_SalesCommission {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter Sales ID:");
        int salesID = in.nextInt();
        in.nextLine(); // Consume newline character

        System.out.println("Enter Seller Name:");
        String sellerName = in.nextLine();

        System.out.println("Enter Sales Amount:");
        double salesAmount = in.nextDouble();

        System.out.println("Enter Basic Salary:");
        double basicSalary = in.nextDouble();

        double commission = 0.0;

        if(salesAmount >= 50000){
            commission = salesAmount * 0.35;
        }else if(salesAmount >= 30000){
            commission = salesAmount * 0.20;
        }else if (salesAmount >= 20000){
            commission = salesAmount * 0.10;
        } else if (salesAmount >= 10000){
            commission = salesAmount * 0.05;
        }else {
            commission = salesAmount * 0.02;
        }

        double totalEarning = basicSalary + commission;

        //Display the results
        System.out.println("Sales ID         : " + salesID);
        System.out.println("Seller's Name    : " + sellerName);
        System.out.println("Sales Amount     : " + salesAmount);
        System.out.println("Basic Salary     : " + basicSalary);
        System.out.println("Sales Commission : " + commission);
        System.out.println("Total Earnings   : " + totalEarning);

        in.close();
    }
}
