package Week2;

import java.util.*;


public class Main9
{
    public static void main(String[] args)
    {
        Scanner scanner= new Scanner(System.in);

        System.out.println("Would you like miles to feet or feet to miles (mtf/ftm)");
        String choice = scanner.nextLine();  


        if (choice.equals("mtf"))
        {
            System.out.println("How many miles do you want converting to feet?");
            int miles = scanner.nextInt();  
            System.out.print( miles + " Miles converted to feet is: " + String.valueOf(miles*5280) + " feet.");
        }
        if (choice.equals("ftm"))
        {
            System.out.println("How many feet do you want converting to miles?");
            int feet = scanner.nextInt();  
            System.out.print( feet + " Feet converted to miles is: " + String.valueOf(feet/5280) + " Miles.");
        }

        //System.out.print( feet + " Feet converted to miles is: " + String.valueOf(feet/5280) + " Miles.");
        
        scanner.close();
    }
}
