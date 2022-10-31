package ProjectCW1ConsoleSong;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Functions {

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
        if (listFromFile.size() > 10)
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

        Scanner scanner= new Scanner(System.in);
        // need to close scanner once 
        int selection = scanner.nextInt();  
        scanner.nextLine();

        if (selection == 1 )
        {
            ViewData();
        }

        if (selection == 2 )
        {
            System.out.print("YES");
            String name = scanner.nextLine();
            String artist = scanner.nextLine();
            String playCount = scanner.nextLine();

            Add(name, artist, playCount);
        }
        if (selection == 3 )
        {
            String name = scanner.nextLine();
            String artist = scanner.nextLine();
            String playCount = scanner.nextLine();

            Update(name, artist, playCount);
        }
        if (selection == 4 )
        {
            String name = scanner.nextLine();
            String artist = scanner.nextLine();

            Remove(name, artist);
        }
        if (selection == 5 )
        {
            Main._run = false;
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
