package Week1;

import java.util.*;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Main8
{
    public static void main(String[] args)
    {
        Scanner scanner= new Scanner(System.in);
        System.out.println("How many feet do you want converting to miles?");
        int feet = scanner.nextInt();  


        System.out.print( feet + " Feet converted to miles is: " + String.valueOf(feet/5280) + " Miles.");
        
        scanner.close();
    }
}
