package ProjectCW1ConsoleSong;

import java.io.IOException;
import java.util.ArrayList;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class Main
{
    public static void main(String[] args)
    {
        final String PATHTOFILE = ("C:\\Users\\BartlomiejWojda\\source\\repos\\CollegeWork\\ProjectCW1ConsoleSong\\Data\\data.txt");
        final File FILE = new File(PATHTOFILE);

        ArrayList<String> listFromFile = new ArrayList<String>();

        //need exception if file is empty

        try {
            listFromFile = ReturnListFromFile(FILE);
        } catch (IOException e) {
            e.printStackTrace();
        }

        

        String name = "TEST3";
        String artist = "Tester4";
        String playCount = "999";


        // change to a for each loop

        boolean exists = Find(listFromFile, name, artist);

        // for (int i=0 ;i < listFromFile.size(); i ++)
        // {
        //     String [] testValue = listFromFile.get(i).split(",");
        //     if(name.equals(testValue[0]) && artist.equals(testValue[1]))
        //     {
        //         exists = true;
        //     }
        // }

        if (!exists)
        {
            try {
                Add(FILE, name, artist, playCount);
            } catch (IOException e1) {
                e1.printStackTrace();
            }
        }
    }

    public static void Add(File file, String name, String artist, String playCount) throws IOException
    {
        FileWriter fw = new FileWriter(file, true);
        String totalString = (name+","+artist+","+playCount+"\n");
        fw.write(totalString);
        fw.close();
        System.out.print("\nADDED");
    }

    public static ArrayList<String> ReturnListFromFile(File file) throws IOException
    {
        BufferedReader br = new BufferedReader(new FileReader(file));
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

    public static void Update()
    {

    }

    public static void Increment()
    {

    }

    public static boolean Find(ArrayList listFromFile, String name, String artist)
    {
        boolean exists = false;
        for (int i=0 ;i < listFromFile.size(); i ++)
        {
            String [] testValue = ((String) listFromFile.get(i)).split(",");
            if(name.equals(testValue[0]) && artist.equals(testValue[1]))
            {
                exists = true;
            }
        }
        return exists;
    }

}
