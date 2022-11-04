package ProjectCW1ConsoleSong;

public class Song {
    
  String songName;
  String artistName;
  int playCount;


    public Song(String sName, String aName, int pCount)
    {
      this.songName = sName;
      this.artistName = aName;
      this.playCount=pCount;
    }

    //get set SongName
    public String getSongName()
    {
      return songName;
    }

    public void setSongName(String sName)
    {
      this.songName = sName;
    }
  
    //get set ArtistName
    public String getArtistName()
    {
      return artistName;
    }
    public void setArtistName(String artistName)
    {
      this.songName = artistName;
    }


    //get set PlayCount
    public int getPlayCount()
    {
      return playCount;
    }

    public void setPlayCount(int playCount)
    {
      this.playCount = playCount;
    }


    //print song 
    public void printSong()
    {
      System.out.println(songName + ","+ artistName + "," + playCount);    
    } 
  
  
  
    
}
