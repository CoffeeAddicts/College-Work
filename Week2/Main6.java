package Week2;

import java.util.*;

public class Main6
{
    public static void main(String[] args)
    {
        String numberString;

        Scanner scanner= new Scanner(System.in);
        System.out.println("Which number table would you like to see? ");
        numberString = scanner.next(); 

        int number = Integer.parseInt(numberString);

        for(int i = 1;i < 13;i++ )
        {
            System.out.print(String.valueOf(i) + " x " + String.valueOf(number) + " = " + String.valueOf(i*number)+ "\n");
        }

        boolean run = true;
        
        while (run)
        {
            String runString = "";
            String inputContinue = "yes";

            System.out.println("Would you like to see another number? ("+ inputContinue + "/no)");
            
            Scanner scanner2= new Scanner(System.in);
            runString = scanner2.nextLine();  
            
            
            //System.out.println(String.valueOf(runString.length()));


            if (runString.equals(inputContinue))
            {  
                getNumberTable();
            }
            else
            {
                run = false;
                System.out.print("Goodbye");
            }  

        }
    }


    public static void getNumberTable()
    {

        String numberString;

        Scanner scanner= new Scanner(System.in);
        System.out.println("Which number table would you like to see? ");
        numberString = scanner.next(); 

        int number = Integer.parseInt(numberString);

        for(int i = 1;i < 13;i++ )
        {
            System.out.print(String.valueOf(i) + " x " + String.valueOf(number) + " = " + String.valueOf(i*number)+ "\n");
        }

    }
}
