package ProjectCW1ConsoleSong;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Utilities {

    public static String IncrementID() throws IOException {
        String id = "";
        List<String> lastItem = GetLastItemFromList();
        if (lastItem == null)
            return null;

        id = String.valueOf(Integer.parseInt(lastItem.get(0)) + 1);
        return id;
    }

    public static String GetId(String name, String artist) throws IOException {
        String id = "0";
        if (!CheckExists(name, artist))
            return null;

        ArrayList<String> listFromFile = ReturnListFromFile();
        for (int i = 0; i < listFromFile.size(); i++) {
            List<String> testValue = Arrays.asList(listFromFile.get(i).split("\\s*,\\s*"));
            if (name.equals(testValue.get(1)) && artist.equals(testValue.get(2))) {
                id = testValue.get(0);
            }
        }

        return id;
    }

    public static List<String> GetLastItemFromList() throws IOException {
        ArrayList<String> listFromFile = ReturnListFromFile();

        if (listFromFile.size() == 0)
            return null;

        String lastFullItem = listFromFile.get(listFromFile.size() - 1);
        List<String> item = Arrays.asList(lastFullItem.split("\\s*,\\s*"));

        return item;
    }

    public static boolean CheckExists(String name, String artist) throws IOException {
        ArrayList<String> listFromFile = ReturnListFromFile();
        boolean exists = false;
        for (int i = 0; i < listFromFile.size(); i++) {
            List<String> testValue = Arrays.asList(listFromFile.get(i).split("\\s*,\\s*"));
            if (name.equals(testValue.get(1)) && artist.equals(testValue.get(2))) {
                exists = true;
            }
        }
        return exists;
    }
    
    public static void ClearTextFile() {
        try {

            PrintWriter writer = new PrintWriter(Main._FILE);
            writer.print("");
            writer.close();

        } catch (Exception exception) {

            System.out.println("Exception have been caught");

        }
    }
    public static ArrayList<String> ReturnListFromFile() throws IOException {
        BufferedReader br = new BufferedReader(new FileReader(Main._FILE));
        ArrayList<String> arlist = new ArrayList<String>();

        String st;
        while ((st = br.readLine()) != null) {
            arlist.add(st);
        }

        br.close();
        return arlist;
    }
}
