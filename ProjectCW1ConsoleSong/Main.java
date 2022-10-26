package ProjectCW1ConsoleSong;

import java.io.IOException;
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

        //need exception if file is empty       

        String name = "TEST31dfs515";
        String artist = "Tester45";
        String playCount = "999";

        Add(name, artist, playCount);            

    }

    public static void Add(String name, String artist, String playCount) throws IOException 
    {
        boolean exists = CheckExists(name, artist);
        if (exists)
        {
            System.out.println("\nAlready Exists");
            return;
        }
        String id = IncrementID();
        
        FileWriter fw = new FileWriter(_FILE, true);
        String totalString = (id+", "+name+","+artist+","+playCount+"\n");
        fw.write(totalString);
        fw.close();

        System.out.print("\nADDED");
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

    public static void Remove()
    {


    }

    public static void MainMenu()
    {

    }

    public static void Update()
    {

    }

    public static String IncrementID() throws IOException
    {
        String id = "";
        List<String> lastItem = GetLastItemFromList();
        id = String.valueOf(Integer.parseInt(lastItem.get(0)) + 1);
        return id;
    }

    public static String GetId(String name, String artist) throws IOException
    {
        String id = "0";
        if (CheckExists(name, artist)) return id;

        return id;
    }

    public static List<String> GetLastItemFromList() throws IOException
    {
        ArrayList<String> listFromFile = ReturnListFromFile();
        
        String lastFullItem = listFromFile.get(listFromFile.size() - 1);
        List<String> item = Arrays.asList(lastFullItem.split("\\s*,\\s*"));

        return item;
    }

    public static boolean CheckExists(String name, String artist) throws IOException
    {
        ArrayList<String> listFromFile = ReturnListFromFile();
        boolean exists = false;
        System.out.print(listFromFile);
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
