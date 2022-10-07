package Week1;

import java.util.*;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Main7
{
    public static void main(String[] args)
    {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Please enter your dob (dd/mm/yyy)");
        String dob = scanner.nextLine();  

        String[] dobList = dob.split("/");

        
        int year = Calendar.getInstance().get(Calendar.YEAR);
        int month = Calendar.getInstance().get(Calendar.MONTH);
        int day = Calendar.getInstance().get(Calendar.DAY_OF_MONTH);

        LocalDate currentDate = LocalDate.of(year, month, day);
        //29-July-2017, change this to your desired End Date
	    LocalDate enteredDate = LocalDate.of(Integer.parseInt(dobList[2]),Integer.parseInt(dobList[1]),Integer.parseInt(dobList[0]));
	    long noOfDaysBetween = ChronoUnit.DAYS.between(enteredDate, currentDate);

        System.out.print("You were born " + String.valueOf(noOfDaysBetween) + " day ago.");
        
        scanner.close();
    }
}
