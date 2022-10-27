package ProjectCW1ConsoleSong;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class Main
{
    final static  String _PATHTOFILE = ("C:\\Users\\BartlomiejWojda\\source\\repos\\CollegeWork\\ProjectCW1ConsoleSong\\Data\\data.txt");
    final static File _FILE = new File(_PATHTOFILE);
    public static void main(String[] args) throws IOException
    {

        String name = "TEST31dfs515";
        String artist = "Tester45";
        String playCount = "999";


        Add(name, "sfsdsesfdsfs", playCount);
        Add(name, "sfsdsfdsadfs", playCount);
        Add(name, artist, playCount);
        Add(name, "sfsfsfdsfdfs", playCount);
        Remove(name, artist);            

    }

    public static void Add(String name, String artist, String playCount) throws IOException 
    {
        boolean exists = CheckExists(name, artist);
        if (exists)
        {
            System.out.println("Already Exists\n");
            return;
        }
        String id = IncrementID();
        if(id == null)
        {
            id = "1";
        }
        
        FileWriter fw = new FileWriter(_FILE, true);
        String totalString = (id+", "+name+","+artist+","+playCount+"\n");
        fw.write(totalString);
        fw.close();

        System.out.print("ADDED\n");
    }

    public static ArrayList<String> ReturnListFromFile() throws IOException
    {
        BufferedReader br = new BufferedReader(new FileReader(_FILE));
        ArrayList<String> arlist = new ArrayList<String>( );

        String st;
        while ((st = br.readLine()) != null)
        {
            arlist.add(st);
        }

        br.close();
        return arlist;

    }

    public static void Remove(String name, String artist) throws IOException
    {

        // ISSUE when removing IDs dont stay they same...
        ArrayList<String> listFromFile = ReturnListFromFile();

        if (listFromFile == null) return;

        String id = GetId(name, artist);

        if (id == null) return;

        listFromFile.remove(Integer.parseInt(id)-1);
        System.out.println(listFromFile);
        ClearTextFile();

        for(String item : listFromFile)
        {
            List<String> itemSplit = Arrays.asList(item.split("\\s*,\\s*"));
            Add(itemSplit.get(1), itemSplit.get(2), itemSplit.get(3));
        }

    }

    public static void MainMenu()
    {


    }

    public static void ClearTextFile()
    {
        try{

            PrintWriter writer = new PrintWriter(_FILE);
            writer.print("");
            writer.close();
        
            }catch(Exception exception){
        
                System.out.println("Exception have been caught");
        
            }
    }

    public static void Update(String name, String artist, String playCount) throws IOException
    {
                // ISSUE when removing IDs dont stay they same...
                ArrayList<String> listFromFile = ReturnListFromFile();

                if (listFromFile == null) return;
        
                String id = GetId(name, artist);
        
                if (id == null) return;
        
                listFromFile.get(Integer.parseInt(id)-1);
                System.out.println(listFromFile);
                ClearTextFile();
        
                for(String item : listFromFile)
                {
                    List<String> itemSplit = Arrays.asList(item.split("\\s*,\\s*"));
                    Add(itemSplit.get(1), itemSplit.get(2), itemSplit.get(3));
                }
    }

    public static String IncrementID() throws IOException
    {
        String id = "";
        List<String> lastItem = GetLastItemFromList();
        if (lastItem == null) return null;

        id = String.valueOf(Integer.parseInt(lastItem.get(0)) + 1);
        return id;
    }

    public static String GetId(String name, String artist) throws IOException
    {
        String id = "0";
        if (!CheckExists(name, artist)) return null;

        ArrayList<String> listFromFile = ReturnListFromFile();
        for (int i=0 ;i < listFromFile.size(); i ++)
        {
            List<String> testValue = Arrays.asList(listFromFile.get(i).split("\\s*,\\s*"));
            if(name.equals(testValue.get(1)) && artist.equals(testValue.get(2)))
            {
                id = testValue.get(0); 
            }
        }


        return id;
    }

    public static List<String> GetLastItemFromList() throws IOException
    {
       ArrayList<String> listFromFile = ReturnListFromFile();

       if(listFromFile.size() == 0) return null;
        
        String lastFullItem = listFromFile.get(listFromFile.size() - 1);
        List<String> item = Arrays.asList(lastFullItem.split("\\s*,\\s*"));

        return item;
    }

    public static boolean CheckExists(String name, String artist) throws IOException
    {
        ArrayList<String> listFromFile = ReturnListFromFile();
        boolean exists = false;
        for (int i=0 ;i < listFromFile.size(); i ++)
        {
            List<String> testValue = Arrays.asList(listFromFile.get(i).split("\\s*,\\s*"));
            if(name.equals(testValue.get(1)) && artist.equals(testValue.get(2)))
            {
                exists = true;
            }
        }
        return exists;
    }

}
