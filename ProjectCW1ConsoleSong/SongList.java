package ProjectCW1ConsoleSong;

import java.util.ArrayList;

public class SongList
{
    private ArrayList<Song> songList;

    public SongList()
    {
        songList = new ArrayList<>();
    }

    public int sizeofSongList()
    {
        return songList.size();
    }

    public void addSong(Song song)
    {
        songList.add(song);
    }

    public void deleteSong(int id)
    {
        songList.remove(id);
    }

    public void printAllSongs(int playAmount)
    { 
        System.out.print("ID      Song                    Artist              Playcount\n");
        System.out.print("\n");
        for (int index = 0; index < songList.size(); index++)
        {
            if (songList.get(index).getPlayCount() > playAmount)
            {
            Song s = songList.get(index);
            System.out.print("["+(index+1)+"]");
            s.printSong();
            }
        }
    }

    public int SetID()
    {
        int id = sizeofSongList() - 1;
        return id;
    }

  //need a checkExists here
  //This doesnt take into effect id
  public boolean CheckExists(Song songToCheck)
  {
    ArrayList<String> existsList = new ArrayList<String>();
    boolean exists = false;
    if (sizeofSongList() == 0) return exists;
        
    for(int i = 0; i < sizeofSongList()-1; i++)
    {
        if (songToCheck.songName.equals(songList.get(i).getSongName()) && songToCheck.artistName.equals(songList.get(i).getArtistName()))
        {
            existsList.add("1");
        }
        
    }

    if (existsList.contains("1"))
    {
        exists = true;
    }
    return exists;
  }


    //addSong
    //getSize
    //deleteSong needs index(id)
    //Array of Songs
    //printAllSongs
    //printOneSong
    //printHeader
    //printSelectedSongs
    
}
