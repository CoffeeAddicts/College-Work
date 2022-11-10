package ProjectCW1ConsoleSong;

import java.io.IOException;
import java.util.Scanner;
import java.io.Console;
import java.io.File;


class Main {
    //Global variables used thoughout the code
    //More efficient than constantly inserting them into methods.
    public static boolean _run = true;
    public static Scanner _scanner = new Scanner(System.in);
    public static void main(String[] args) throws IOException 
    {
        SongList mySongList = new SongList();

        // This while loop runs until the user selects the last option of the menu
        // Once it is selected - the global run variable stops the loop from running. 
        while (_run){

            MainMenu(mySongList);
            System.out.println("Press Enter to continue");
            _scanner.nextLine();
        }
    }

    // Prints out the options of the program and executes the users selection.
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

        // this try catch will make sure that the selection is of the right type.
        // If the user tries to input something other than an integer, it will fail
        //forcing the selection to be 0
        try 
        {
            selection = _scanner.nextInt();  
            _scanner.nextLine();
        } 
        catch (Exception e) 
        {
            selection = 0;
        }
        
        //prints size of song list
        if (selection == 1 )
        {
            System.out.println(songList.sizeofSongList());
        }
        
        //Prints all the songs in the list at the time 
        else if (selection == 2 )
        {
            songList.printAllSongs(-1);
        }

        //Prints all the songs with a higher play count than the user defined
        //Both this and the previous selection use the same method from SongList() to stop repeating code
        //This uses a similar try catch to the selection variable
        else if (selection == 3 )
        {
            System.out.print("How many plays over would you like to view:\n");
            int playAmount = 0;
            try 
            {
                playAmount  = _scanner.nextInt();
            _scanner.nextLine();
            } 
            catch (Exception e) 
            {
                playAmount = 0;
            }

            songList.printAllSongs(playAmount);
            
        }

        // Allows the user to add their own songs into the song list
        else if (selection == 4 )
        {
            System.out.print("Please enter the song name, artist name and play count of the song you wish to add in the next 3 lines:\n");
            String name = _scanner.nextLine();
            String artist = _scanner.nextLine();
            int playCount = _scanner.nextInt();

            Song song = new Song(songList.SetID(),name,artist,playCount);

            //This make sure that the song doesnt already exist in the list.
            //if it exists it tells the user and moves on
            //if it doesnt exists it adds it and tells the user it was added successfully.
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

        //Adds 10 pre-defined songs to the list
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

        //Deletes asong using the ID of the song
        else if (selection == 6)
        {
            System.out.print("Please enter the ID of the song you wish to delete on the next line:\n");
            int id = _scanner.nextInt();

            songList.deleteSong(id - 1);

        }

        //Changes the global _run variable to false and closes the scanner and exits the program.
        else if (selection == 7)
        {
            Main._run = false;
            _scanner.close();
            System.exit(0);
        }

        //else here is used to make sure the user inputs a correct option from the menu
        else
        {
            System.out.println("Incorrect value. Please try again");
        }
    }
  }
  
