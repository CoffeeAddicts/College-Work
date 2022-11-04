package ProjectCW1ConsoleSong;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Functions {
    public static Scanner _scanner = new Scanner(System.in);

    public static void Add(String name, String artist, String playCount) throws IOException {
        boolean exists = Utilities.CheckExists(name, artist);
        if (exists) {
            System.out.println("Already Exists\n");
            return;
        }
        String id = Utilities.IncrementID();
        if (id == null) {
            id = "1";
        }

        ArrayList<String> listFromFile = Utilities.ReturnListFromFile();
        if (listFromFile.size() > 9)
        {
            System.out.println("List already contains 10 items");
            return;
        }



        FileWriter fw = new FileWriter(Main._FILE, true);
        String totalString = (id + ", " + name + "," + artist + "," + playCount + "\n");
        fw.write(totalString);
        fw.close();

        System.out.print("ADDED\n");
    }

    public static void Remove(String name, String artist) throws IOException {

        // ISSUE when removing IDs dont stay they same...
        ArrayList<String> listFromFile = Utilities.ReturnListFromFile();

        if (listFromFile == null)
            return;

        String id = Utilities.GetId(name, artist);

        if (id == null)
            return;

        listFromFile.remove(Integer.parseInt(id) - 1);
        System.out.println(listFromFile);
        Utilities.ClearTextFile();

        for (String item : listFromFile) {
            List<String> itemSplit = Arrays.asList(item.split("\\s*,\\s*"));
            Add(itemSplit.get(1), itemSplit.get(2), itemSplit.get(3));
        }

    }

    public static void MainMenu() throws IOException {

        System.out.println("====================");
        System.out.println("|     Main Menu    |");
        System.out.println("====================");
        System.out.println("|     1. View      |");
        System.out.println("|     2. Add       |");
        System.out.println("|     3. Update    |");
        System.out.println("|     4. Remove    |");
        System.out.println("|     5. Quit      |");
        System.out.println("====================");

        
        // need to close scanner once 
        int selection = _scanner.nextInt();  
        _scanner.nextLine();

        if (selection == 1 )
        {
            ViewData();
        }

        if (selection == 2 )
        {
            System.out.print("Please enter the song name, artist name and play count of the song in the next 3 lines:");
            _scanner.nextLine();
            String name = _scanner.nextLine();
            String artist = _scanner.nextLine();
            String playCount = _scanner.nextLine();

            Add(name, artist, playCount);
        }
        if (selection == 3 )
        {
            System.out.print("Please enter the song name, artist name and play count of the song in the next 3 lines:");
            String name = _scanner.nextLine();
            String artist = _scanner.nextLine();
            String playCount = _scanner.nextLine();

            Update(name, artist, playCount);
        }
        if (selection == 4 )
        {
            System.out.print("Please enter the song name, artist name in the next 2 lines:");
            String name = _scanner.nextLine();
            String artist = _scanner.nextLine();

            Remove(name, artist);
        }
        if (selection == 5 )
        {
            Main._run = false;
            _scanner.close();
        }

        System.out.println(("null"));
    }

    private static void ViewData() throws IOException {

        ArrayList<String> listFromFile = Utilities.ReturnListFromFile();

        for (int i = 0;i < listFromFile.size();i++)
        {
        System.out.println(listFromFile.get(i));
        }
    }

    public static void Update(String name, String artist, String playCount) throws IOException {
        // ISSUE when removing IDs dont stay they same...
        ArrayList<String> listFromFile = Utilities.ReturnListFromFile();

        if (listFromFile == null)
            return;

        String id = Utilities.GetId(name, artist);

        if (id == null)
            return;

        listFromFile.remove(Integer.parseInt(id) - 1);
        System.out.println(listFromFile);
        Utilities.ClearTextFile();

        for (String item : listFromFile) {
            List<String> itemSplit = Arrays.asList(item.split("\\s*,\\s*"));
            Add(itemSplit.get(1), itemSplit.get(2), itemSplit.get(3));
        }
        Add(name, artist, playCount);

    }    
}
