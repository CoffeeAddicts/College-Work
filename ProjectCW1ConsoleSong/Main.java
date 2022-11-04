package ProjectCW1ConsoleSong;

import java.io.IOException;
import java.util.Scanner;
import java.io.File;


public class Main {
    final static String _PATHTOFILE = ("C:\\Users\\BartlomiejWojda\\source\\repos\\CollegeWork\\ProjectCW1ConsoleSong\\Data\\data.txt");
    final static File _FILE = new File(_PATHTOFILE);
    public static boolean _run = true;

    public static void main(String[] args) throws IOException {

        

        while (_run){

            Functions.MainMenu();
            System.out.println("Press Enter to continue");
            Functions._scanner.nextLine();
        }
    }
}
