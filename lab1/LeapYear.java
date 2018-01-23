/** Class that determines whether or not a year is a leap year.
 *  @author YOUR NAME HERE/test the git at the same time
 */


import java.util.Scanner;
/*or import java.util.*;*/
import java.util.InputMismatchException;

public class LeapYear {

    /** Calls isLeapYear to print correct statement.
     *  @param  year to be analyzed
     */
    private static void checkLeapYear(int year) {
        if (isLeapYear(year)) {
            System.out.printf("%d is a leap year.\n", year);
        } else {
            System.out.printf("%d is not a leap year.\n", year);
        }
    }

    
   public static boolean isLeapYear(int year) {
   if (year % 4 != 0) {return false;}
   else if (year % 400 == 0) {return true;}
   else if (year % 100 == 0 ) {return false;}
   else {return true;}
   }
     /*= ((year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0));

    /** Must be provided an integer as a command line argument ARGS. */
    public static void main(String[] args) {
       /* if (args.length < 1) {
            System.out.println("Please enter command line arguments.");
            System.out.println("e.g. java Year 2000");
        }*/
       Scanner scan = new Scanner (System.in);
       boolean validData = false;
       int year = 0;
       do { System.out.println("Enter a year");
         try{year = scan.nextInt();
           checkLeapYear(year);
           validData = true;}
         catch (InputMismatchException e){
           System.out.println("%s is not a valid year number. \n");
         break;}
         
       }while(validData==false);




       /* for (int i = 0; i < args.length; i++) {
            try {
                int year = Integer.parseInt(args[i]);
                checkLeapYear(year);
            } catch (NumberFormatException e) {
                System.out.printf("%s is not a valid number.\n", args[i]);
            }
        }*/
    }
}

