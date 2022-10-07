package Week2;

import java.util.Scanner;

public class Main7
{

    public static void main(String[] args)
    {
    Scanner scanner= new Scanner(System.in);
    System.out.println("Input your marks from your test: ");
    int mark = scanner.nextInt();  

    scanner.close();

    if (mark < Grades.NS.getValue() || mark > Grades.A.getValue())
        System.out.println("This is an invalid mark");
    else if (mark <= Grades.F.getValue())
        System.out.println("This is a failed attempt");
    else if (mark <= Grades.D.getValue())
        System.out.println("This is a pass");
    else if (mark <= Grades.C.getValue())
        System.out.println("This is a 2:2");
    else if (mark <= Grades.B.getValue())
        System.out.println("This is a 2:1");
    else
        System.out.println("This is a 1st");
    }


    public enum Grades
    {
        NS(0), F(39), D(49), C(59), B(69), A(100);

        private final int VALUE;

        private Grades(int VALUE)
        {
            this.VALUE = VALUE;
        }

        public int getValue()
        {
            return VALUE;
        }
    }
}
