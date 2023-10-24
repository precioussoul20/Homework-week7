package javaprogrammes;

import java.util.Scanner;

/** Write a java program to input student Name, roll No, and three subjects Math, Science and
  * English marks (marks is between 0 to 100 and if it is out of range print error message “Invalid Input,
  * Marks should between 0 to 100”) and find out total, percentage and result.
  * If he is pass or fail on basis of percentage (pass>=35) and also give them grade if %> = 80 A+,
  * %> = 60 A, %> = 50 B, %> = 35 C And print Mark Sheet in following format
**/


public class Programme3_StudentMarkSheet {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Student's Name:");
        String name =sc.nextLine();

        System.out.println("Enter Roll Number:");
        int rollno = sc.nextInt();

        System.out.println("Enter Math Mark (0-100):");
        int mathMarks =sc.nextInt();
        validateMarks(mathMarks);

        System.out.println("Enter Science Marks (0-100):");
        int scienceMarks = sc.nextInt();
        validateMarks(scienceMarks);

        System.out.println("Enter English marks (0-100):");
        int englishMarks = sc.nextInt();
        validateMarks(englishMarks);

        // calculate total and percentage
        int totalMarks = mathMarks + scienceMarks + englishMarks;
        double percentage = (totalMarks/300.0) * 100;

        //Determine result and grade
        String result = (percentage >= 35) ? "Pass" : "Fail" ;
        String grade;
        if (percentage >= 80){
            grade = "A+";
        } else if (percentage >= 60) {
            grade = "A";
        } else if (percentage >= 50) {
            grade = "B";
        } else if (percentage >= 35) {
            grade = "C";
        } else {
            grade = "F";
        }
        // Print the Mark Sheet
        System.out.println("---------------------------------");
        System.out.println("|                               |");
        System.out.println("|          Mark Sheet           |");
        System.out.println("|-------------------------------|");
        System.out.println("| Name : " + name + "                    |" );
        System.out.println("| Roll No : " + rollno + "                   |");
        System.out.println("|-------------------------------|");
        System.out.println("| Subject :  Marks              |");
        System.out.println("|-------------------------------|");
        System.out.println("| Math    : " + mathMarks + "                  |");
        System.out.println("| Science : " + scienceMarks + "                  |");
        System.out.println("| English : " + englishMarks + "                  |");
        System.out.println("|-------------------------------|");
        System.out.println("| Total   : " + totalMarks + "                 |");
        System.out.println("|-------------------------------|");
        System.out.println("| Percentage: " + percentage + "              |");
        System.out.println("| Result  : " + result + "                |");
        System.out.println("| Grade   : " + grade + "                  |");
        System.out.println("|_______________________________|");

        sc.close();

    }
    public static void validateMarks(int marks){
        if (marks < 0 || marks > 100){
            System.out.println("Invalid Input, Marks should be between 0 to 100");
            System.exit(1);
        }
    }

}
