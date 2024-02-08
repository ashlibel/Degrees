//Ashley Gutierrez Carreto
//September 12th, 2023
//Lab 4 Basic Math
//Converting fareneheit into Celcius with arithmetic 
import java.util.Scanner;
public class BasicMath
{
   public static void main (String [] args)
   
   {
      System.out.println ("Enter a temperature in degree Celcius: ");
      // user prints a temp. in celcius 
      
      Scanner keyboard = new Scanner (System.in);
      double degreesC = keyboard.nextInt();
      
      double answer = 9 * (degreesC) / 5 + 32;
      String name; 
      // converison of celcius to fahreneheit  
      
            
      System.out.println (degreesC + " degrees Celsius is "
                          + answer +  " degrees Fahreinheit");
      //prints out temp. in Fahreneheit 
                               
    }
}
