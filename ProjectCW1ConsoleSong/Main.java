package ProjectCW1ConsoleSong;

import java.io.IOException;
import java.util.Scanner;
import java.io.File;


//public class Main {
    //  final static String _PATHTOFILE = ("C:\\Users\\BartlomiejWojda\\source\\repos\\CollegeWork\\ProjectCW1ConsoleSong\\Data\\data.txt");
    //  final static File _FILE = new File(_PATHTOFILE);
    //  public static boolean _run = true;

    // public static void main(String[] args) throws IOException {
    //     while (_run){

    //         Functions.MainMenu();
    //         System.out.println("Press Enter to continue");
    //         Functions._scanner.nextLine();
    //     }
    // }
//}
class Main {
    final static String _PATHTOFILE = ("C:\\Users\\BartlomiejWojda\\source\\repos\\CollegeWork\\ProjectCW1ConsoleSong\\Data\\data.txt");
    final static File _FILE = new File(_PATHTOFILE);
    public static boolean _run = true;
    public static Scanner _scanner = new Scanner(System.in);
    public static void main(String[] args) throws IOException 
    {
        while (_run){

            MainMenu();
            System.out.println("Press Enter to continue");
            Functions._scanner.nextLine();
        }

      //createSongs();
    }

    public static void createSongs()
    {   

      Song song1 = new Song("The Wall","Pink Floyd",7);
      Song song2 = new Song("Yellow Submarine","Beatles",12);
          
        
      song1.printSong();
      song2.printSong();

    
      Playlist myPlaylist = new Playlist();
      myPlaylist.addSong(song1);
      myPlaylist.addSong(song2);

      System.out.println(myPlaylist.sizeOfPlaylist());
  

      myPlaylist.printAllSongs();
      
      myPlaylist.deleteSong(1);
      myPlaylist.printAllSongs();
      System.out.println("=============================");
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

        Playlist myPlaylist = new Playlist();

        
        // need to close scanner once 
        int selection = _scanner.nextInt();  
        _scanner.nextLine();

        if (selection == 1 )
        {
            System.out.println(myPlaylist.sizeOfPlaylist());
        }

        if (selection == 2 )
        {
            System.out.print("Please enter the song name, artist name and play count of the song in the next 3 lines:");
            _scanner.nextLine();
            String name = _scanner.nextLine();
            String artist = _scanner.nextLine();
            int playCount = _scanner.nextInt();

        }
        if (selection == 3 )
        {
            System.out.print("Please enter the song name, artist name and play count of the song in the next 3 lines:");
            String name = _scanner.nextLine();
            String artist = _scanner.nextLine();
            String playCount = _scanner.nextLine();

        }
        if (selection == 4 )
        {
            System.out.print("Please enter the song name, artist name in the next 2 lines:");

        }
        if (selection == 5 )
        {
            Main._run = false;
            _scanner.close();
        }

        System.out.println(("null"));
    }
  }
  
