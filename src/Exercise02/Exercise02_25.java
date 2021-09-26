package Exercise02;
/*Author@Harsh patel  (20CS050)
*(Financial application: payroll) Write a program that reads the following information and prints a payroll statement:
*Employee’s name (e.g., Smith)
*Number of hours worked in a week (e.g., 10)
*Hourly pay rate (e.g., 6.75)
*Federal tax withholding rate (e.g., 20%)
*State tax withholding rate (e.g., 9%)
*/
import java.util.Scanner;
public class Exercise02_25 {

    public static void main(String[] args)
            {
                //creating an object
                Scanner sc = new Scanner(System.in);

                System.out.println("Enter employee's name:");
                //taking input from user
                String employee = sc.next();

                System.out.println("Enter number of hours worked in a week:");
                double  hours = sc.nextDouble();

                System.out.println("Enter hourly pay rate:");
                double  pay = sc.nextDouble();

                double  gross_pay = pay * hours;

                System.out.println("Enter federal tax withholding rate:");
                double  fedtax = sc.nextDouble();
                double fedtaxr = fedtax * 0.20;

                System.out.println("Enter state tax withholding rate:");
                double  statetax = sc.nextDouble();

                double statetaxr = statetax * 0.20;

                double deductions = fedtaxr + statetaxr;

                double total_pay = gross_pay - deductions;

                // Display payroll statement
                System.out.println("Employee name: " + employee);

                System.out.println("Hours worked: " + hours);

                System.out.println("Pay rate: " + pay);

                System.out.println("Gross pay: " + gross_pay);

                System.out.println("Deductions: ");
                System.out.println("\t Federal Withholding (20.0%): " + fedtaxr);
                System.out.println("\t State Withholding (9.0%)" + statetaxr);
                System.out.println("\t Total Deductions:" + deductions);
                System.out.println("Total pay: " + total_pay);
            }
        }


