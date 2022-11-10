package ProjectCW1ConsoleSong;

import java.io.IOException;
import java.util.Scanner;
import java.io.Console;
import java.io.File;


class Main {
    // final static String _PATHTOFILE = ("C:\\Users\\BartlomiejWojda\\source\\repos\\CollegeWork\\ProjectCW1ConsoleSong\\Data\\data.txt");
    // final static File _FILE = new File(_PATHTOFILE);
    public static boolean _run = true;
    public static Scanner _scanner = new Scanner(System.in);
    public static void main(String[] args) throws IOException 
    {
        SongList mySongList = new SongList();

        while (_run){

            MainMenu(mySongList);
            System.out.println("Press Enter to continue");
            _scanner.nextLine();
        }
    }


    public static void MainMenu(SongList songList) throws IOException {

        System.out.println("=================================");
        System.out.println("|           Main Menu           |");
        System.out.println("=================================");
        System.out.println("|          1. View Size         |");
        System.out.println("|          2. View List         |");
        System.out.println("|          3. View Over Amount  |");
        System.out.println("|          4. Add               |");
        System.out.println("|          5. Add 10 Songs      |");
        System.out.println("|          6. Remove            |");
        System.out.println("|          7. Quit              |");
        System.out.println("=================================");
        
        int selection = 0;
        try 
        {
            selection = _scanner.nextInt();  
            _scanner.nextLine();
        } catch (Exception e) 
        {
            selection = 0;
        }
        

        if (selection == 1 )
        {
            System.out.println(songList.sizeofSongList());
        }

        else if (selection == 2 )
        {
            songList.printAllSongs(-1);
        }
        else if (selection == 3 )
        {
            System.out.print("How many plays over would you like to view:\n");
            //_scanner.nextLine();
            int playAmount  = _scanner.nextInt();
            _scanner.nextLine();

            songList.printAllSongs(playAmount);
            
        }
        else if (selection == 4 )
        {
            System.out.print("Please enter the song name, artist name and play count of the song you wish to add in the next 3 lines:\n");
            //_scanner.nextLine();
            String name = _scanner.nextLine();
            String artist = _scanner.nextLine();
            int playCount = _scanner.nextInt();

            Song song = new Song(songList.SetID(),name,artist,playCount);
            if(!songList.CheckExists(song))
            {
            songList.addSong(song);
            System.out.println("Song successfully added.");
            }
            else
            {
                System.out.println("Song already exists.");
            }

        }
        else if (selection == 5)
        {
            Song song1 = new Song(songList.SetID(),"Shivers        ", "Ed Sheeran   ", 154509);
            Song song2 = new Song(songList.SetID(),"Matilda        ", "Harry Styles ", 2564509);
            Song song3 = new Song(songList.SetID(),"River          ", "Eminem       ", 256109);
            Song song4 = new Song(songList.SetID(),"About Damn Time", "Lizzo        ",14809);
            Song song5 = new Song(songList.SetID(),"Hart           ", "Gibbs        ", 95609);
            Song song6 = new Song(songList.SetID(),"Star Walking   ", "Lil Naz X    ", 29689);
            Song song7 = new Song(songList.SetID(),"Holiday        ", "Genzie       ", 52799);
            Song song8 = new Song(songList.SetID(),"Click          ", "Jake Miller  ", 694509);
            Song song9 = new Song(songList.SetID(),"Crisis         ", "Joshua Basset", 9082173);
            Song song10 = new Song(songList.SetID(),"Grenade       ", "Bruno Mars   ", 1762901);

            songList.addSong(song1);
            songList.addSong(song2);
            songList.addSong(song3);
            songList.addSong(song4);
            songList.addSong(song5);
            songList.addSong(song6);
            songList.addSong(song7);
            songList.addSong(song8);
            songList.addSong(song9);
            songList.addSong(song10);

        }
        else if (selection == 6)
        {
            System.out.print("Please enter the ID of the song you wish to delete on the next line:\n");
            int id = _scanner.nextInt();

            songList.deleteSong(id - 1);

        }
        else if (selection == 7)
        {
            Main._run = false;
            _scanner.close();
            System.exit(0);
        }
        else
        {
            System.out.println("Incorrect value. Please try again");
        }
    }
  }
  
