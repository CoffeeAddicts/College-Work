package Week1;

import java.util.*;

public class Main5
{
    public static void main(String[] args)
    {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Please enter 2 numbers");
        int number1 = scanner.nextInt();  
        int number2 = scanner.nextInt();  
        
        System.out.print(String.valueOf(number1) + " " + String.valueOf(number2) + "\n");
        System.out.print(String.valueOf(number2) + " " + String.valueOf(number1));

        scanner.close();
    }
}
