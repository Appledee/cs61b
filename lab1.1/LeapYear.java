import java.util.Scanner;
import java.util.InputMismatchException;

public class LeapYear 
{
         private static void checkLeapYear(int year){
         if (isLeapYear(year)){
             System.out.printf("%d is a leap year.\n",year);}
         else{
             System.out.printf("%d is not a leap year.\n", year);}
         }


         public static boolean isLeapYear(int year){
         if (year % 4 != 0) {return false;}
         else if (year % 400 == 0) {return true;}
         else if (year % 100 == 0) {return false;}
         else {return true;}
         
         }

     

      public static void main (String[] args) {
      
      Scanner scan = new Scanner (System.in);
      boolean validDate = false;
      int year = 0;
      do { System.out.println("Enter a year");
          try{year = scan.nextInt();
            checkLeapYear (year);
            validDate = true;}
          catch (InputMismatchException e) {
          System.out.println("%s is not a valid year number. \n");
          break;
          
          }
      
      
      
      }while(validDate == false);
      
      
      
      
      }   

     





}
