package Week2;

import java.util.*;

public class Main5
{

    public static void main(String[] args)
    {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Which number table would you like to see? ");
        int number = scanner.nextInt();  
    
        scanner.close();

        for(int i = 1;i < 13;i++ )
        {
            System.out.print(String.valueOf(i) + " x " + String.valueOf(number) + " = " + String.valueOf(i*number)+ "\n");
        }
    }
}
