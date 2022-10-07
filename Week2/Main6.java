package Week2;

import java.time.Year;
import java.util.*;

public class Main6
{
    public static void main(String[] args)
    {
        boolean run = true;

        do
        {
            Scanner scanner= new Scanner(System.in);
            System.out.println("Which number table would you like to see? ");
            int number = scanner.nextInt(); 
            scanner.nextLine(); 


            for(int i = 1;i < 13;i++ )
            {
                System.out.print(String.valueOf(i) + " x " + String.valueOf(number) + " = " + String.valueOf(i*number)+ "\n");
            }
            
            String runString = "";

            System.out.println("Would you like to see another number? (yes/no)");

            runString = scanner.nextLine();  
            //System.out.println(String.valueOf(runString.length()));

            scanner.close();

            if (runString.equals("yes"))
            {
                run = true;
            }
            else
            {
                run = false;
                System.out.print("Goodbye");
            }

        }
        while (run);
    }
}
