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
        for (int index = 0; index <= songList.size(); index++)
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
  public boolean CheckExists(Song songToCheck)
  {
    boolean exists = false;
    for(int i = 0; i < sizeofSongList(); i++)
    {
        if (songToCheck == songList.get(i))
        {
            exists = true;
        }
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
