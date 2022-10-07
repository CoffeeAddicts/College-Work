package Week1;

import java.util.*;

public class Main4
{
    public static void main(String[] args)
    {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Please enter 2 numbers");
        double number1 = scanner.nextDouble();  
        double number2 = scanner.nextDouble();  
        
        System.out.print("The average  is: "+ ((number1 + number2)/2));
        
        scanner.close();
    }
}
