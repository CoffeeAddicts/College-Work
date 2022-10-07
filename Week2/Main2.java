package Week2;

import java.util.Scanner;

public class Main2 
{

    public static void main(String[] args)
    {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Input your Grade from your test: ");
        String grade = scanner.nextLine();  

        scanner.close();

        if (grade.equals("A"))
        {
            System.out.print("This is a 1st");
        }
        else if (grade.equals("B"))
        {
            System.out.print("This is a 2:1");
        }
        else if (grade.equals("C"))
        {
            System.out.print("This is a 2:2");
        }
        else if (grade.equals("D"))
        {
            System.out.print("This is a 3rd");
        }
        else if (grade.equals("E"))
        {
            System.out.print("This is a ordinary");
        }
        else if (grade.equals("F"))
        {
            System.out.print("This is a fail");
        }
        else
        {
            System.out.print("That is an invalid input");
        }

    }       
}
