package Week1;

import java.util.*;

public class Main6
{
    public static void main(String[] args)
    {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Please enter your age");
        int age = scanner.nextInt();  
        
        int year = Calendar.getInstance().get(Calendar.YEAR);

        System.out.print("You were born in: " + String.valueOf(year-age));
        
        scanner.close();
    }
}
