package ProjectCW1ConsoleSong;

import java.io.IOException;
import java.util.Scanner;
import java.io.File;


class Main {
    // final static String _PATHTOFILE = ("C:\\Users\\BartlomiejWojda\\source\\repos\\CollegeWork\\ProjectCW1ConsoleSong\\Data\\data.txt");
    // final static File _FILE = new File(_PATHTOFILE);
    public static boolean _run = true;
    public static Scanner _scanner = new Scanner(System.in);
    public static void main(String[] args) throws IOException 
    {
        SongList mySongList = new SongList();
        // Song song1 = new Song("The Wall","Pink Floyd",7);
        // Song song2 = new Song("Yellow Submarine","Beatles",12);

        // myPlaylist.addSong(song1);
        // myPlaylist.addSong(song2);

        while (_run){

            MainMenu(mySongList);
            System.out.println("Press Enter to continue");
            _scanner.nextLine();
        }

      //createSongs();
    }

    // public static void createSongs()
    // {   

    //   Song song1 = new Song("The Wall","Pink Floyd",7);
    //   Song song2 = new Song("Yellow Submarine","Beatles",12);
          
        
    //   song1.printSong();
    //   song2.printSong();

    
    //   SongList myPlaylist = new SongList();
    //   myPlaylist.addSong(song1);
    //   myPlaylist.addSong(song2);

    //   System.out.println(myPlaylist.sizeOfPlaylist());
  

    //   myPlaylist.printAllSongs();
      
    //   myPlaylist.deleteSong(1);
    //   myPlaylist.printAllSongs();
    //   System.out.println("=============================");
    // }

    public static void MainMenu(SongList songList) throws IOException {

        System.out.println("=================================");
        System.out.println("|           Main Menu           |");
        System.out.println("=================================");
        System.out.println("|          1. View Size         |");
        System.out.println("|          2. View List         |");
        System.out.println("|          3. View Over Amount  |");
        System.out.println("|          4. Add               |");
        System.out.println("|          5. Remove            |");
        System.out.println("|          6. Quit              |");
        System.out.println("=================================");
 
        int selection = _scanner.nextInt();  
        _scanner.nextLine();

        if (selection == 1 )
        {
            System.out.println(songList.sizeofSongList());
        }

        if (selection == 2 )
        {
            songList.printAllSongs(0);
        }
        if (selection == 3 )
        {
            System.out.print("How many plays over would you like to view:\n");
            //_scanner.nextLine();
            int playAmount  = _scanner.nextInt();
            _scanner.nextLine();

            songList.printAllSongs(playAmount);
            
        }
        if (selection == 4 )
        {
            System.out.print("Please enter the song name, artist name and play count of the song you wish to add in the next 3 lines:\n");
            //_scanner.nextLine();
            String name = _scanner.nextLine();
            String artist = _scanner.nextLine();
            int playCount = _scanner.nextInt();

            Song song = new Song(songList.SetID(),name,artist,playCount);
            songList.addSong(song);


        }
        if (selection == 5 )
        {
            System.out.print("Please enter the ID of the song you wish to delete on the next line:\n");
            int id = _scanner.nextInt();

            songList.deleteSong(id - 1);

        }
        if (selection == 6)
        {
            Main._run = false;
            _scanner.close();
        }

        System.out.println(("null"));
    }
  }
  
