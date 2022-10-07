package Week1;

import java.util.*;

public class Main6
{
    public static void main(String[] args)
    {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Please enter your age");
        int age = scanner.nextInt();  
        
        System.out.print(String.valueOf(2022-age));
        
        scanner.close();
    }
}
