package ProjectCW1ConsoleSong;

import java.util.ArrayList;

//Song List Class. 
//Contains all method linked with the list itself
public class SongList
{
    //This creates an initial ArrayList which is used throughout the code
    private ArrayList<Song> songList;

    public SongList()
    {
        songList = new ArrayList<>();
    }

    //Allows to easily get the size of the list
    public int sizeofSongList()
    {
        return songList.size();
    }

    //Allows to easily add songs to the list
    public void addSong(Song song)
    {
        songList.add(song);
    }

    //Allows to easily delete a song from the list 
    public void deleteSong(int id)
    {
        songList.remove(id);
    }

    //Uses a loop to get all the song from and list and print them onto the console
    public void printAllSongs(int playAmount)
    { 
        System.out.print("ID      Song                    Artist              Playcount\n");
        System.out.print("\n");
        for (int index = 0; index < songList.size(); index++)
        {
            //The if statement only prints songs which have a higher play count than the one provided
            if (songList.get(index).getPlayCount() > playAmount)
            {
            Song s = songList.get(index);
            //Uses the index from the for loop to make sure all the songs have a number infront before they are printed
            System.out.print("["+(index+1)+"]");
            s.printSong();
            }
        }
    }

    //When adding an new song this is ran
    //It gets the size of the list and takes 1 away. 
    //This make sure all songs have a unique id infront of them
    public int SetID()
    {
        int id = sizeofSongList() - 1;
        return id;
    }

    //Used to check if a song already exists in the song list 
  public boolean CheckExists(Song songToCheck)
  {
    ArrayList<String> existsList = new ArrayList<String>();
    boolean exists = false;
    if (sizeofSongList() == 0) return exists;

        // loops through all the songs and checks if they are already in the song list 
    for(int i = 0; i < sizeofSongList(); i++)
    {
        if (songToCheck.songName.equals(songList.get(i).getSongName()) && songToCheck.artistName.equals(songList.get(i).getArtistName()))
        {
            //If the song exists it adds a value to a list
            existsList.add("1");
        }
        
    }
    //This finally checks if any song exists in the list
    if (existsList.contains("1"))
    {
        exists = true;
    }
    //return true or false based on the above
    return exists;
  }
}
