package Week1;

import java.util.*;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Main9
{
    public static void main(String[] args)
    {
        Scanner scanner= new Scanner(System.in);
        System.out.println("How much money did you deposit? ");
        double money = scanner.nextDouble();  


        System.out.print( money + " left over a year will leave you with: £" + String.valueOf(money * 1.01) + ".");
        
        scanner.close();
    }
}
