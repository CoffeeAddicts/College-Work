package Week1;

import java.util.*;

public class Main2
{
    public static void main(String[] args)
    {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Please enter your name:");
        String name = scanner.nextLine();  

        System.out.print("Hello " + name);

        scanner.close();
    }
}
