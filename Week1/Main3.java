package Week1;

import java.util.*;

public class Main3
{
    public static void main(String[] args)
    {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Please enter the width of a rectangle:");
        int width = scanner.nextInt();  

        System.out.println("Please enter the height of a rectangle:");
        int height = scanner.nextInt(); 

        System.out.print("The perimeter is: "+ ((height * 2) + (width *2))+"\n");
        System.out.print("The area is: "+ ((height * width)));

        scanner.close();
    }
}
