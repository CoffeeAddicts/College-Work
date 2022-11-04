package ProjectCW1ConsoleSong;

import java.util.ArrayList;

public class Playlist
{
  private ArrayList<Song> playList;

  public Playlist()
  {
    playList = new ArrayList<>();
  }

  public int sizeOfPlaylist()
  {
    return playList.size();
  }

  public void addSong(Song song)
  {
    playList.add(song);
  }

  public void deleteSong(int id)
  {
    playList.remove(id);
  }

    public void printAllSongs()
  {
    for (int index = 0; index < playList.size(); index++)
    {
        Song s = playList.get(index);
        System.out.print("["+(index+1)+"]");
        s.printSong();
    }
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
